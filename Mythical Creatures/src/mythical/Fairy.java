package mythical;

public class Fairy extends MythicalCreature{
    int healingPower;
    public Fairy(){

    }

    @Override
    public String toString() {
        return "Fairy{" +
                "healingPower=" + healingPower +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public Fairy(String name, CreatureType type, int healingPower){
        this.name = name;
        this.type = type;
        this.healingPower = healingPower;
    }

    @Override
    void introduce(){
        System.out.println("Hello, I am a FAIRY and my name is " + name);
    }
    void heal(MythicalCreature creature){
        System.out.printf("%s has healed %s with %d hit points%n",this.name,creature.name,this.healingPower);
    }
}
