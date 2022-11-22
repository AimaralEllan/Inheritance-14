public class C extends A{
    private String color;

    public C(String name, int age,String color){
        super(name, age);
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*public String toString(){
        return "Hello Aimaral";
    }*/

    @Override
    public String toString() {
        return "C{" +
                "color='" + color + '\'' +
                '}'+super.toString();
    }
}
