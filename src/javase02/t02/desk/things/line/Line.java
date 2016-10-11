package javase02.t02.desk.things.line;


import javase02.t03.baseThing.BaseThing;

public class Line extends BaseThing {
    int measure;

    public Line(){
        super(10);
        this.measure=30;
    }
     public Line(int measure, int price){
         super(price);
         this.measure=measure;
     }

    public int[] getLine(){
        int[] o=new int[2];
        o[0]=measure;
        o[1]=price;
        return o;
    }
    public void  setNotebook(int measure,int price){
        this.measure=measure;
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
        Line line = (Line) o;

        if (!super.equals(line)){
            return false;
        }
        if (this.measure!=line.measure){
            return  false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result=super.hashCode();

        result=31*result+measure;

        return result;
    }

    @Override
    public String toString() {
        return "Line{" +
                "measure=" + measure +
                '}';
    }
}
