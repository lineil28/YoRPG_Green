public class Healer extends Protagonist {

    public Healer(String name) {
        super(name, 10, 10, 20, 0.75, 50);
        about = "The healer is a mage with overall average stats. Specializing lets you heal your self, but you deal no damage for the turn. Have faith in your mana, and good luck!";
    }

    public void normalize() {
        defense = 20;
        accuracy = 0.75;
    }

    public void specialize() {
        if (mana-15>0){
            accuracy = 0;
            health += 20;
            mana -= 15;
    } else{
        System.out.print("You have no mana! Normalizing...");
        normalize();
    } 
    }
}
