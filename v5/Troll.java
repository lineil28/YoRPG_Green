public class Troll extends Monster {
    /*
        -less health
        -less attack
        -less defense
        -sometimes misses
        -can attack up to 5 times per turn if doesnt miss
    */
    public Troll() {
        super(50, 5, 10, 5, 0.6);
        about = "The troll has less health, attack, defense, and accuracy. However it is very nimble, allowing itself to attack up to 5 times in one go!";
    }

    public int attack(Character c) {
        if(hit()) {
            int damage = 0;
            int attacks = (int) (Math.random()*5) + 1;
            for(int i = 0; i < attacks; i++) {
                System.out.println("Whack!");
                damage += swing(c);
            }
            System.out.printf("The troll whacked you %d time(s)!!!%n", attacks);
            return damage;
        } else {
            System.out.println("The troll trolled you!");
            return 0;
        }
    }
}