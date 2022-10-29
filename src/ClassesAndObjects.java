public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(-24);
        person1.setName("Vladislav");
            //Вариант 1
        System.out.println("My name " + person1.getName() + ", i'm " + person1.getAge() + " years.");
        Person person2 = new Person();
        person2.setName("Alexey");
        person2.setAge(45);
        System.out.println("Hi, my name " + person2.getName() + ", i'm " + person2.getAge() + " years.");
        Person person3 = new Person();
        String name1 = "Volodymyr";
        int age1 = 35;
        person3.setName(name1);
        System.out.println("My name "+person3.getName());
            //Вариант 2
        System.out.println();
        person1.seyHello();                           //  У класса могут быть:
        person1.speak();                              //  1. Данные (поля)
        person2.speak();                              //  2. Действия, котрорые он может совершать (методы)
        person2.speak();

        int years1 = person1.calculateYears();
        int years2 = person2.calculateYears();
        System.out.println("Человеку до пенсии: "+years1+" лет.");
        System.out.println("Человеку до пенсии: "+years2+" лет.");
    }
}
class Person{
    //Поля:
    private String name;
    private int age;
    //методы
    public void setName(String userName){
       if (userName.isEmpty()){
            System.out.println("You entered empty name!");
        } else{
        name = userName;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("You entered negative age!");
        } else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }
    void speak(){
        System.out.println("Hi, my name "+getName()+", i'm "+ getAge()+" years.");
    }
    void seyHello(){
        System.out.println("Hello!");
    }
    int calculateYears(){
        int years = 65-age;
        return years;
    }
}