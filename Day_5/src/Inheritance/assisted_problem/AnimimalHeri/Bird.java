package Inheritance.assisted_problem.AnimimalHeri;

public class Bird extends Animal{
    public Bird(String name,int age){
        super(name,age);}
    @Override

    void makeSound(){
        System.out.println(name+" sound "+age);

    }

}
