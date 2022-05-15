package console;

public abstract class Figure {
    private String name = "";

    public abstract void draw();
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if(this.name.equals("")) {
            return "-- NO NAME --";
        } else {
            return this.name;
        }
    }

    public void drawWithName() {
        System.out.println(this.getName());
        this.draw();
    }
}
