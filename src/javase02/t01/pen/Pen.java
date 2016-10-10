package javase02.t01.pen;

public class Pen {

    protected int length;
    protected String color;
    protected int price;

    public  Pen(int length,String color,int price){
        this.length=length;
        this.color=color;
        this.price=price;
    }

    protected int Price(){
        return price;
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

        if (this.price!=pen.price|this.length!=pen.length){
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
        int result;
        result=(int) (31*price+ ((color==null)?0:color.hashCode()));
        result=(int) 31*result+length;

        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
