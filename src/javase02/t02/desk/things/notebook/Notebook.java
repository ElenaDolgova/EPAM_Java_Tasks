package javase02.t02.desk.things.notebook;

import javase02.t03.baseThing.BaseThing;

public class Notebook extends BaseThing {
    int numberOfTitle;

    public Notebook(){
        super(30);
        numberOfTitle=40;
    }

        public Notebook(int numberOfTitle, int prise){
        super(prise);
        this.numberOfTitle=numberOfTitle;
        }

    public int[] getNotebook(){
        int[] o=new int[2];
        o[0]=numberOfTitle;
        o[1]=price;
        return o;
    }
    public void  setNotebook(int numberOfTitle,int price){
        this.numberOfTitle=numberOfTitle;
        this.price=price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (null==o)
            return  false;
        if (getClass()!=o.getClass())
            return false;
        Notebook notebook = (Notebook) o;

        if (!super.equals(notebook)){
            return false;
        }
        if (this.numberOfTitle!=notebook.numberOfTitle){
            return  false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result=super.hashCode();

        result=31*result+numberOfTitle;

        return result;
    }

    @Override
    public String toString() {
        return "notebook{" +
                "numberOfTitle=" + numberOfTitle +
                ", price=" + price +
                '}';
    }
}
