import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Point3D points[] = new Point3D[3];
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Введите x: ");
            double x = scanner.nextDouble();

            System.out.print("Введите y: ");
            double y = scanner.nextDouble();
            
            System.out.print("Введите z: ");
            double z = scanner.nextDouble();

            points[i] = new Point3D(x, y, z);
        }
        System.out.println("Площадь треугольника: " + computeArea(points[0], points[1], points[2]));

        scanner.close();
    }

    public static double computeArea(Point3D p1, Point3D p2, Point3D p3)
    {
        double a = p1.distanceTo(p2);
        double b = p1.distanceTo(p3);
        double c = p2.distanceTo(p3);

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}