public class Facebook {


    String name;
    int age;
    float hight;

    Facebook(String name, int age, float hight){
        this.name = name;
        this.age = age;
        this.hight = hight;
        System.out.println(name+" have age "+age+" with hight "+hight+"ft.");

    }

    public static void main(String[] args) {

        Facebook fb = new Facebook("prashanth",24,5.11f);
    }
}
