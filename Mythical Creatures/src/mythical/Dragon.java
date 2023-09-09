package mythical;

public class Dragon extends MythicalCreature {
    int power;

    @Override
    public String toString() {
        return "Dragon{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public Dragon(String name, CreatureType type, int power){
        this.name = name;
        this.type = type;
        this.power = power;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a DRAGON and my name is" + name);
    }

    void attack(MythicalCreature creature) {
        System.out.printf("%s has attacked %s with %d power%n", this.name,creature.name,this.power);
    }
}
