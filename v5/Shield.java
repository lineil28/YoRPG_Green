public class Shield extends Protagonist {

    public Shield(String name) {
        super(name, 10, 10, 20, 0.75,50);
        about = "The Shield is a tank with incrased defense, but lowered strength. Specializing sacrafices a bit of your strength but your defense increases, and you are guaranteed to land a hit. Beware this class has trouble defeating even the simplest of monsters. Have faith in your sword and shield, and good luck!";
    }
  public void normalize() {
    strength = 10;
    defense = 20;
    accuracy = 0.75;
  }

  public void specialize() {
      if (mana>0){
        strength = 5;
        defense = 40;
        accuracy = 1;
        mana -= 10;
    } else{
        System.out.print("You have no mana! Normalizing...");
        normalize();
    }
  }
}

