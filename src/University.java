public class University {
    private String student;
    private String name;
    private int cours;

    public University(String student,String name, int cours) {
        this.student=student;
        this.name = name;
        this.cours = cours;
    }

    public void setStudent(String student){
        this.student=student;
    }
    public String getStudent(){
        return student;
    }
    public University(String student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public void getWelcome(){
        System.out.println( student+"Welcome to "+name);
    }

    @Override
    public String toString() {
        return "University{" +
                "student='" + student + '\'' +
                ", name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }
}
