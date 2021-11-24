public class Assassin extends Protagonist {

  public Assassin(String name) {
    super(name, 30, 10, 10, 0.75);
    about = "The assassin is a specialist with incrased strength, and accuracy, but low defense  Specializing sacrafices a bit of your accuracy and defense in exchange a chance of greater strength. Have faith in your dagger and good luck!";
  }

  public void normalize() {
    critical = 10;
    defense = 10;
    accuracy = 0.75;
  }

  public void specialize() {
    critical = 30;
    defense = 5;
    accuracy = 0.5;
  }

}
