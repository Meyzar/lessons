import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name1 = sc.nextLine();
        int age1 = sc.nextInt();
        Humans human1 = new Humans(name1, age1);
        sc.close();
    }
}

class Humans{
    private String name;
    private int age;

    public Humans(){
        this.name = "standard name";
        this.age = 2;
        System.out.println("hello world "+this.name+"i'm "+ this.age);
    }

    public Humans(String name){
        this.name = name;
        this.age = 2;
        System.out.println("hello world "+this.name+"i'm "+ this.age);
    }

    public Humans(String name, int age){
        this.name = name;
        this.age = age;
        if (age < 0){
            this.age = 2;
        }
        System.out.println("hello world "+this.name+" i'm "+ this.age);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
