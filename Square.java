public class Square extends Rectangle {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side); // hình vuông có 2 cạnh bằng nhau
        this.side = side;
    }

    @Override
    public String getDetails() {
        return "Square - Center: " + centerPoint +
                ", Side: " + side;
    }
}
