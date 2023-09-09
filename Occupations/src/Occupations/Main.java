package Occupations;

public class Main extends Person {
    public static void main(String[] args) {
        Person person = new Person("Gábor", 42, Gender.MAN);
        person.introduce();
        person.printGoal();
        Chef chef = new Chef("Péter", 55, Gender.MAN);
        chef.introduce();
        chef.cook("broccoli");
        chef.printGoal();
    }
}
