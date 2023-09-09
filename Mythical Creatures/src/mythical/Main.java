package mythical;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MythicalCreature mythicalCreature = new MythicalCreature("Zakariás",CreatureType.FIRE);
        mythicalCreature.introduce();
        System.out.println(mythicalCreature.name + " " + mythicalCreature.type);
        Dragon dragon = new Dragon("Red dragon",CreatureType.WATER,20);
        dragon.introduce();
        dragon.attack(mythicalCreature);
        System.out.println(dragon.name + " " + dragon.type);
        Fairy fairy = new Fairy("Hera",CreatureType.WATER,200);
        dragon.attack(fairy);
        dragon.attack(dragon);
        fairy.introduce();
        fairy.heal(fairy);
        fairy.heal(dragon);
        fairy.heal(mythicalCreature);
        List<MythicalCreature> creatures = new ArrayList<>();
        Dragon dragon1 = new Dragon("Otto",CreatureType.FIRE,500);
        Dragon dragon2 = new Dragon("Zeus",CreatureType.FIRE,600);
        Dragon iceDragon = new Dragon("Ula",CreatureType.ICE,300);

        Fairy iceFairyOne = new Fairy("Ella",CreatureType.ICE,50);
        Fairy iceFairyTwo = new Fairy("Eva",CreatureType.ICE,100);
        Fairy iceFairyThree = new Fairy("Ada",CreatureType.ICE,150);

        creatures.add(dragon1);
        creatures.add(dragon2);
        creatures.add(iceDragon);
        creatures.add(iceFairyOne);
        creatures.add(iceFairyTwo);
        creatures.add(iceFairyThree);
        System.out.println(creatures);
        System.out.println(dragon);
        System.out.println(fairy);
    }
}
