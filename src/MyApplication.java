import models.Point;
import models.Shape;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\assignment1\\source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNextLine()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongestSide());
    }
}