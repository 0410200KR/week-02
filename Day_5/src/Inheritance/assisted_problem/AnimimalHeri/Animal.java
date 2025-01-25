package Inheritance.assisted_problem.AnimimalHeri;

public class Animal {
    public String name;
    public int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("Animal sound discription");
    }
}
