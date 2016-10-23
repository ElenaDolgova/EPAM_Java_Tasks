package javase02.t02.desk.things.notebook;


import javase02.t03.baseThing.BaseThing;

public class Notebook extends BaseThing {
    int numberOfTitle;

    public Notebook(){
        super.price=40;
        super.check=true;
        numberOfTitle=40;
        color="green";
    }

        public Notebook(int numberOfTitle, int price, String color){
            super.price=price;
        this.numberOfTitle=numberOfTitle;
            this.color=color;
        }

    public int getNumberOfTitle() {
        return numberOfTitle;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void  setNotebook(int numberOfTitle, int price, String color){
        this.numberOfTitle=numberOfTitle;
        this.price=price;
        this.color=color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook)) return false;
        if (!super.equals(o)) return false;

        Notebook notebook = (Notebook) o;

        if (getNumberOfTitle() != notebook.getNumberOfTitle()) return false;
        return getColor() != null ? getColor().equals(notebook.getColor()) : notebook.getColor() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNumberOfTitle();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "numberOfTitle=" + numberOfTitle +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
