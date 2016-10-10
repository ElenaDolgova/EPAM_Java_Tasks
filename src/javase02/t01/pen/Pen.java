package javase02.t01.pen;

public class Pen {

    private int length;
    private String color;
    private int price;
    public boolean check=false;

    public  Pen(int length,String color,int price){
        this.length=length;
        this.color=color;
        this.price=price;
        check=true;
    }
    public Object getPen(){
        Object[] o= new Object[3];
        o[0]=length;
        o[1]=color;
        o[2]=price;
        return o;
    }
    public void setPen(int length,int price,String color){
        this.length=length;
        this.price=price;
        this.color=color;
    }
    public  void setPen(String color){
        this.color=color;
    }



    public int getPrice(){
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
