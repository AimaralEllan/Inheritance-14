import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        /*B b=new B("Hatiko",3,"White");
        b.eating(); //A nyn ichinen kelip jatat
        System.out.println(b.getName()+" "+b.getAge());

        C c=new C("Murka",2,"Black");
        //c.setColor("Black");
        c.eating();
        System.out.println(c.getName()+" "+c.getAge()+" "+c.getColor());

        System.out.println(c);*/

        AGroup aGroup=new AGroup("Aimaral Ellanova ","TUM",1,"Annieva");
        System.out.println(aGroup.getStudent()+" "+aGroup.getName()+" "+aGroup.getCours()+" "+aGroup.getProfessor());
        aGroup.getWelcome();
        System.out.println(aGroup);

        BGroup bGroup=new BGroup(input.nextLine(),input.nextLine(),input.nextInt(),input.nextLine(),input.nextLine());
        System.out.println(bGroup.getStudent()+" "+bGroup.getName()+" "+bGroup.getCours()+" "+bGroup.getProfessor()+" "+bGroup.getFaculti());
        bGroup.getWelcome();
        System.out.println(bGroup);
    }
}