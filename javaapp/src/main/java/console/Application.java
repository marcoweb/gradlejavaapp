package console;

public class Application {
    public static void main(String[] args) {
        Figure figures[] = new Figure[3];
        figures[0] = new Square();
        figures[0].setName("Quadrado 1");
        figures[1] = new Triangle();
        figures[1].setName("Triângulo 1");
        figures[2] = new Triangle();
        figures[2].setName("Triângulo 2");
        for(Figure fig : figures) {
            fig.draw();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        for(Figure fig : figures) {
            fig.drawWithName();
        }
    }
}

