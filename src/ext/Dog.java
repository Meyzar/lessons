package ext;

public class Dog extends Animal {       //Класс Dog наследует поля и методы класса Animals
    public void eat(){
        System.out.println("Dog is eating"); //Переопределяем метод Animals в нашем классе
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}
