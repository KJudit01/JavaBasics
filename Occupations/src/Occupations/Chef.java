package Occupations;

public class Chef extends Person {
    public Chef() {
        super();
    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Hi, my name is " + name + "." + " I'm " + age + "." + "I'm a " + gender + " and a chef.");
    }

    void cook(String food) {
        System.out.println(name + " has cooked some " + food + ".");
    }
}
