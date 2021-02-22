package Labor2;

public class Rectangle {

    //region fields
    private double length;
    private double width;

    //endregion

    //region constructor
    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    //endregion

    //region properties
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }
    //endregion
    public double CalcArea()
    {
        return length*width;
    }

    public double CalcPerimeter()
    {
        return 2*(length+width);
    }
}
