import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Khởi tạo các hình
        shapes.add(new Rectangle(new Point(2, 3), 4, 6));
        shapes.add(new Square(new Point(5, 5), 3));
        shapes.add(new Circle(new Point(0, 0), 2.5));

        // Số lượng hình đã khởi tạo
        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getCount());

        // Danh sách chi tiết các hình
        System.out.println("\nDanh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getDetails());
        }

        // Danh sách tâm điểm
        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getCenterPoint());
        }
    }
}
