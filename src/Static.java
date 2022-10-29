public class Static {
    public static void main(String[] args) {
        Che h1 = new Che("Bob", 40);
        Che h2 = new Che("Tom", 30);
        h1.printNumbOfPeople();
        h2.printNumbOfPeople();
    }
}

class Che{
    private String name;
    private int age;

    public static int countPeople;

    public Che(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("hello world "+this.name+" i'm "+ this.age);
        countPeople++;
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
    public void printNumbOfPeople(){
        System.out.println("Number of people is "+ countPeople);
    }
}