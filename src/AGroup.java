public class AGroup extends University{
    private String professor;
    public AGroup(String student,String name, int cours,String professor) {
        super(student,name, cours);
        this.professor=professor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "AGroup{" +
                "professor='" + professor + '\'' +
                '}'+super.toString();
    }
}
