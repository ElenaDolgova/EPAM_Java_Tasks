package javase02.t03.baseThing;

import java.lang.*;
import java.util.Comparator;

public class BaseThing implements Comparator<BaseThing> {

    protected int price;
    protected String color;
    public boolean check=false;

    @Override
    public int compare(BaseThing o1, BaseThing o2) {
        int var=o1.getClass().getName().compareTo(o2.getClass().getName());
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        
        if(var!=0){
            return var;
        }else if (price1 < price2) {
            return -1;
        } else if (price1 > price2) {
            return 1;
        } else {
            return 0;

         }
    }
    public String getColor() {
        return color;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (null==o){
            return  false;
        }

        if (getClass()!=o.getClass()) {
            return false;
        }

        BaseThing baseThing = (BaseThing) o;

        if(this.price!=baseThing.price||this.check!=baseThing.check){
            return false;
        }
        return true;

    }

    @Override
    public int hashCode() {
        int result=1;
        result=31*result+price;
        result=31*result+(this.check? 0 : 1);
        return result;
    }

    @Override
    public String toString() {
        return "BaseThing{" +
                "price=" + price +
                ", check=" + check +
                '}';
    }
}
