package mythical;

public class MythicalCreature {
    String name;
    CreatureType type;

    @Override
    public String toString() {
        return "MythicalCreature{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public MythicalCreature(){

    }
    public MythicalCreature(String name, CreatureType type){
        this.name = name;
        this.type = type;
    }

    void introduce(){
        System.out.println("Hello, I am a mythical creature and my name is" + name);
    }

}
