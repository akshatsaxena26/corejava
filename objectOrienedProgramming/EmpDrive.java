package objectOrienedProgramming;

public class EmpDrive {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = new Emp();
        // First employee
        e1.id = 113;
        e1.salary = 25000;
        e1.profile = "senior - developer";
        e1.name = "akshat";
        e1.degree = "bca";
        // second employee
        e2.id = 113628;
        e2.salary = 2500;
        e2.profile = "junior - developer";
        e2.name = "akshatSaxena";
        e2.degree = "btech";

        // third employee

        e3.id = 11386;
        e3.salary = 2500000;
        e3.profile = "Manager ";
        e3.name = "akshat";
        e3.degree = "bba";

        System.out.println(e1.id);
        System.out.println(e1.salary);
        System.out.println(e1.profile);
        System.out.println(e1.name);
        System.out.println(e1.degree);
        // second employee
        System.out.println(e2.id);
        System.out.println(e2.salary);
        System.out.println(e2.profile);
        System.out.println(e2.name);
        System.out.println(e2.degree);
        // third employee
        System.out.println(e3.id);
        System.out.println(e3.salary);
        System.out.println(e3.profile);
        System.out.println(e3.name);
        System.out.println(e3.degree);

    }
}
