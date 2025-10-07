public abstract class Shape {
    protected Point centerPoint;
    private static int count = 0; // đếm số lượng hình đã tạo

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public static int getCount() {
        return count;
    }

    // Mỗi hình sẽ tự in chi tiết riêng
    public abstract String getDetails();
}
