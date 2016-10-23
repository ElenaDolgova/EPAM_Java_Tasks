package javase02.t01.pen;

import javase02.t03.baseThing.BaseThing;

public class Pen extends BaseThing
{

    private int length;
   // private String color;

    public  Pen(){
        super.price=30;
        super.check=true;
        this.length=10;
        this.color="Blue";
    }

    public  Pen(int length,String color, int price){
        super.price=price;
        this.length=length;
        this.color=color;
    }


    @Override
    public String getColor(){
        return this.color;
    }

    public int getLength() {
        return length;
    }

    public void setPen(int length, int price, String color){
        this.length=length;
        this.price=price;
        this.color=color;
    }
    public  void setPen(String color){
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (null==o)
            return  false;
        if (getClass()!=o.getClass())
            return false;

        Pen pen = (Pen) o;

        if (!super.equals(pen)){
            return false;
        }

        if (this.length!=pen.length){
            return  false;
        }
        if(null==color){
            return (color==pen.color);
        }else
        {
            if(!color.equals(pen.color)){
                return  false;
            }
        }
       return true;
    }

    @Override
    public int hashCode() {
        int result=super.hashCode();
        result=31*result+ ((color==null)?0:color.hashCode());
        result=31*result+length;

        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "length=" + length +
                ", color='" + color  +
                ", price="+super.price +'\'' +
                '}';
    }
}
