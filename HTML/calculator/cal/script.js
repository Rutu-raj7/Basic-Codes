const resultElement = document.getElementById('reselt');
const clearbtn = document.getElementById('clear-button');
const deletebtn = document.getElementById('delete-button');
const dividebtn = document.getElementById('divide-button');
const multiplybtn = document.getElementById('multiply-button');
const subtractbtn = document.getElementById('subtract-button');
const addbtn = document.getElementById('add-button');
const pointbtn = document.getElementById('point-button');
const equalbtn = document.getElementById('equal-button');

const numberBtns = document.querySelectorAll('.number');

let result = '';
let operation = '';
let previousOperand = 0;

// function to append number
const appendNumber = (number) => {
    if (number === '.' && result.includes('.')) {
        return;
    }
    result += number;
    updateDisplay();
}

// function to update display
const updateDisplay = () => {
    if (operation) {
        resultElement.innerText = `${previousOperand} ${operation} ${result}`;
    } else {
        resultElement.innerText = result;
    }
}

// function to select operator
const selectOperator = (operatorValue) => {
    if (result === '') return;
    if (operation !== '' && previousOperand !== '') {
        calculateResult();
    }

    operation = operatorValue;
    previousOperand = result;
    result = '';

    updateDisplay();
}

// function to calculate result
const calculateResult = () => {
    let evaluatedResult;
    const prev = parseFloat(previousOperand);
    const current = parseFloat(result);

    if (isNaN(prev) || isNaN(current)) return;

    switch (operation) {
        case '+':
            evaluatedResult = prev + current;
            break;
        case '-':
            evaluatedResult = prev - current;
            break;
        case '*':
            evaluatedResult = prev * current;
            break;
        case '/':
            evaluatedResult = prev / current;
            break;
        default:
            return;
    }

    result = evaluatedResult.toString();
    operation = '';
    previousOperand = '';
}

// add event listener to number buttons
numberBtns.forEach(button => {
    button.addEventListener('click', () => {
        appendNumber(button.innerText);
    });
});

// function to clear display
const clearDisplay = () => {
    result = '';
    previousOperand = '';
    operation = '';
    updateDisplay();
}

// delete function
const deleteLastDigit = () => {
    if (result === '') return;
    result = result.slice(0, -1);
    updateDisplay();
}

pointbtn.addEventListener('click', () => appendNumber('.'));
addbtn.addEventListener('click', () => selectOperator('+'));
subtractbtn.addEventListener('click', () => selectOperator('-'));
multiplybtn.addEventListener('click', () => selectOperator('*'));
dividebtn.addEventListener('click', () => selectOperator('/'));
equalbtn.addEventListener('click', () => {
    if (result === '') return;
    calculateResult();
    updateDisplay();
});
clearbtn.addEventListener('click', clearDisplay);
deletebtn.addEventListener('click', deleteLastDigit);
