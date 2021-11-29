public class Brute extends Monster {
    /*
        -more health
        -never misses
        -attacks every other turn
    */
    public int counter;

    public Brute() {
        super(200, 20, 10, 10, 1);
        about = "Base monster, but with a bit more health than normal.";
        counter = 0;
    }

    public int attack(Character c) {
        counter++;
        if(counter%2 == 0) {
            System.out.println("The brute clubs you.");
            return swing(c);
        } else {
            System.out.println("The brute bides his time.");
            return 0;
        }
    }
}
