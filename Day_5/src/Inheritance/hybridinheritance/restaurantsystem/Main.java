package Inheritance.hybridinheritance.restaurantsystem;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("sol", 101);
        Waiter waiter = new Waiter("uri", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
