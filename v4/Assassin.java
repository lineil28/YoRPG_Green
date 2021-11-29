public class Assassin extends Protagonist {
    
    public Assassin(String name) {
        super(name, 30, 20, 10, 0.75,50);
        about = "The assassin is a specialist with incrased strength, and accuracy, but low defense  Specializing sacrafices a bit of your accuracy and defense in exchange a chance of greater strength. Have faith in your dagger and good luck!";
    }
   public void normalize() {
    critical = 10;
    defense = 10;
    accuracy = 0.75;
  }

  public void specialize() {
    if (mana-10>0){
    critical = 30;
    defense = 5;
    accuracy = 0.5;
    mana -=10;
  } else{
  System.out.print("You have no mana! Normalizing...");
  normalize();
  }
}
}
