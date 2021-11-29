public class Vampire extends Monster {
    /*
        -more critical
        -sometimes misses
        -has a chance to regain health equal to half the amount of damage dealt if doesnt miss
    */
    public Vampire() {
        super(100, 20, 20, 10, 0.6);
        about = "The vampire has a chance to regain health equal to half the amount of damage dealt, if it doesn't miss. It's accuracy is mediocore, but has the potential to do more damage in one turn.";
    }

    public int attack(Character c) {
        if(hit()) {
            int damage = swing(c);
            System.out.print("The vampire slashes at your neck");
            if(Math.random() < 0.5) {
                System.out.println("...\nand drains your life!");
                health = (int) Math.min(100, health + damage*0.5);
            } else {
                System.out.println("!");
            }
            return damage;
        } else {
            System.out.println("The vampire misses.");
            return 0;
        }
    }
}