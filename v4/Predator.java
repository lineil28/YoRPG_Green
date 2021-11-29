public class Predator extends Monster {
    /*
        -less health
        -sometimes misses
        -for every turn the predator attacks, its strength increases
        -its strength goes back to original when it misses
    */
    public Predator() {
        super(75, 20, 10, 10, 0.7);
        about = "While having low health and accuracy, the predator's strength increases with every successful attack. However, the moment it misses, the strength is reset back to its original value.";
    }

    public int attack(Character c) {
        if(hit()) {
            System.out.println("The predator studies your weakness.");
            strength += 5;
            return swing(c);
        } else {
            System.out.println("The predator loses its focus.");
            strength = 20;
            return 0;
        }
    }
}
