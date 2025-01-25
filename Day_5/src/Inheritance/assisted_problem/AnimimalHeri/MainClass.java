package Inheritance.assisted_problem.AnimimalHeri;

public class MainClass {
    public static void main(String [] args){
        Animal dog=new Dog("Bob",13);
        Animal cat=new Cat("Sakshi",21);
        Animal bird=new Bird("nightingale",4);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

    }
}
