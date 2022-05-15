package console;

public class Triangle extends Figure {
    @Override
    public void draw() {
        System.out.println(" /\\");
        System.out.println("/  \\");
        System.out.println("----");
    }
}
