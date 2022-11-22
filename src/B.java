public class B extends A{ //

    private String color;
    public B(String name, int age,String color) { //Unikalnyi polyany koshsok bolot
        super(name, age);
        this.color=color; //Unikalnyi polya
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
