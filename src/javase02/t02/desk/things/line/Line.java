package javase02.t02.desk.things.line;


import javase02.t03.baseThing.BaseThing;

public class Line extends BaseThing {
    int measure;
    //String color;

    public Line(){
        super.price=100;
        this.measure=30;
        color="yellow";
    }
     public Line(int measure, int price, String color){
         super.price=price;
         super.check=true;
         this.measure=measure;
         this.color=color;
     }

    public int getMeasure() {
        return measure;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void  setNotebook(int measure, int price, String color){
        this.measure=measure;
        this.price=price;
        this.color=color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        if (!super.equals(o)) return false;

        Line line = (Line) o;

        if (getMeasure() != line.getMeasure()) return false;
        return getColor() != null ? getColor().equals(line.getColor()) : line.getColor() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getMeasure();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Line{" +
                "measure=" + measure +
                ", color='" + color + '\'' +
                ", price=" +super.price+
                '}';
    }
}
