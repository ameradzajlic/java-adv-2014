package decorator;
public class Decorator {
    public static void main(String[] args) {
        RectangleDecorator rd = new RectangleDecorator(new Rectangle(2, 3)); 
        System.out.println(rd.r.area()); 
        System.out.println(rd.perimeter());

    }
}
