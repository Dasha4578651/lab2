class Point3D
{
    private double x;
    private double y;
    private double z;

    Point3D()
    {
        this(0.0, 0.0, 0.0);
    }
    Point3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Геттеры - для получения значений полей
    public double getX() { return this.x; }
    public double getY() { return this.y; }
    public double getZ() { return this.z; }
    // Сеттеры - для изменения значений полей
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }

    public double distanceTo(Point3D other)
    {
        double a = other.x - this.x;
        double b = other.y - this.y;
        double c = other.z - this.z;

        return Math.sqrt(a*a + b*b + c*c);
    }
}