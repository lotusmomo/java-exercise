class Rectangle {
    double Width;
    double Height;
    double getArea() {
        return Width * Height;
    }
    double getPerimeter() {
        return (Width + Height) * 2;
    }
}
public class Rect {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.Width = 4;
        r1.Height = 40;
        System.out.println("Rectangle1 Width: " + r1.Width + ", Height: " + r1.Height + ", Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());
        Rectangle r2 = new Rectangle();
        r2.Width = 3.5;
        r2.Height = 35.9;
        System.out.println("Rectangle1 Width: " + r2.Width + ", Height: " + r2.Height + ", Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());
    }
}