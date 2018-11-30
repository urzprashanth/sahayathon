public class MethodOL {
    public int show(int salary){
        //System.out.println("print showmethod");
        return  salary;
    }
    public String show(String name){
        //System.out.println("ur name"");
        return name;

    }

    public static void main(String[] args) {
        MethodOL mol = new MethodOL();
       int i = mol.show(25000);
        String s = mol.show("prashanth");
        System.out.println(s);
        System.out.println(i);
    }
}
