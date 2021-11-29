public class Protagonist extends Character {
    public String name;
    public int mana;
    public Protagonist(String n, int s, int c, int d, double a, int m) {
        name = n;
        health = 150;
        strength = s;
        critical = c;
        defense = d;
        accuracy = a;
        mana = m;
        about = "Good luck!";
    }

    public String getName() {
        return name;
    }

    public  void normalize() {
        critical = 10;
        defense = 10;
    }

    public  void specialize() {
        critical += 20;
        defense -= 20;
    }

    public int attack(Character c) {
        mana = Math.min(50,mana+5);
        if (hit()) {
            System.out.println("You swing your sword.");
            return swing(c);
        } else {
            System.out.println("You miss!");
            return 0;
        }
    }

    public static Protagonist createPlayer(String name, int playerClass) {
        Protagonist[] typeList = {
            new Knight(name),
            new Assassin(name),
            new Shield(name),
            new Healer(name)
        };
        return typeList[playerClass-1];
    }
}