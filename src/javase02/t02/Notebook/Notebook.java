package javase02.t02.Notebook;

public class Notebook {
    int numberOfTitle;
    int price;
    public boolean check=false;

    public int[] GetNotebook(){
        int[] o=new int[2];
        o[0]=numberOfTitle;
        o[1]=price;
        return o;
    }
    public void  SetNotebook(int numberOfTitle,int price){
        this.numberOfTitle=numberOfTitle;
        this.price=price;
    }
    public  Notebook(int numberOfTitle,int price){
        this.numberOfTitle=numberOfTitle;
        this.price=price;
        check=true;
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
        Notebook pen = (Notebook) o;

        if (this.price!=pen.price|this.numberOfTitle!=pen.numberOfTitle){
            return  false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result=1;
        result=(int) 31*result+price;
        result=(int) 31*result+numberOfTitle;

        return result;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "numberOfTitle=" + numberOfTitle +
                ", price=" + price +
                '}';
    }
}
