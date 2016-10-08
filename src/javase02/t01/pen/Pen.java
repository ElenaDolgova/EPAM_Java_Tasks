package javase02.t01.pen;

public class Pen {
    private double length;
    private String color;

    @Override
    public String toString() {
        return "Pen{" +
                "length=" + length +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.length, length) != 0) return false;
        return color != null ? color.equals(pen.color) : pen.color == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
