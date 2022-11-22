public class BGroup extends University{
    private String professor;
    private String faculti;
    public BGroup(String student,String name, int cours,String professor,String faculti) {
        super(student,name, cours);
        this.professor=professor;
        this.faculti=faculti;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getFaculti() {
        return faculti;
    }

    public void setFaculti(String faculti) {
        this.faculti = faculti;
    }

    @Override
    public String toString() {
        return "BGroup{" +
                "professor='" + professor + '\'' +
                ", faculti='" + faculti + '\'' +
                '}'+super.toString();
    }
}
