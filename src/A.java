public class A {
    private String name;
    private int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { //Command+N
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void eating(){ //Method
        System.out.println(name+ "eating meal");
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
