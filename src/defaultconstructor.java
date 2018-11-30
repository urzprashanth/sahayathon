public class defaultconstructor {
    String Company;
    String name;
    int salary;

    defaultconstructor(String name, String Company, int salary){
        this.Company= Company;
        this.name= name;
        this.salary= salary;

        System.out.println(Company);
        System.out.println(name);
        System.out.println(salary);

    }

    public static void main(String[] args) {
        defaultconstructor dc = new defaultconstructor("prashanth","vaaraahi tech solutions",20000);
        System.out.println();

    }
}
