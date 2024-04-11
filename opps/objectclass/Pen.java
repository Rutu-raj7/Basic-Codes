class Pen
{
    String brand;
    boolean price;
    String colour;

    Pen(){

    }
    Pen(String brand,boolean price,String colour)
    {
        this.brand=brand;
        this.price=price;
        this.colour=colour;
    }
    public void displaypen() {
        
        System.out.println(brand);
        System.out.println(price);
        System.out.println(colour);
    }



}