public class Knight extends Protagonist {
    public Knight(String name) {
        super(name, 20, 10, 15, 0.75);
        about = "The Knight is your average Joe with average health, strength, critical, defense, and accuracy. Specializing sacrifices a bit of your defense in exchange for greater strength. Have faith in your sword and good luck!";
    }

    public void normalize() {
        critical = 10;
        defense = 15;
    }

    public void specialize() {
        critical = 30;
        defense = 5;
    }
}