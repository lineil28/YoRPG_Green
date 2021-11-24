public class Gambler extends Monster {
    /*
        -no critical
        -never misses
        -bets on a coin every turn and the player or himself whether hes right or wrong, respectively
    */
  public Gambler() {
    super(100, 30, 0, 10, 1);
  }

  public int attack(Character c) {

    int guess = (int) (Math.random()*2);
    int coin = (int) (Math.random()*2);

    System.out.printf("The gambler bets on %s.%n", guess == 0 ? "heads" : "tails");// checks guess == 0, if T, heads, if F, tails
    System.out.println("He flips his coin...");
    System.out.printf("%s!%n", coin == 0 ? "Heads" : "Tails"); // checks coin == 0, if T, heads, if F, tails

    if(guess == coin) {
      System.out.println("The gambler stabs you.");
      return swing(c);
    } else {
      System.out.println("\"I am a man of my word,\" the gambler chortles.");
      System.out.printf("The gambler stabs himself for %d points of damage.%n", swing(this));
      return 0;
    }
  }

  public void about() {
    System.out.println("An addicted gambler who has faith in his luck. He bets on a coin every turn, and the player or himself get damaged whether he is right or wrong, respectively.");
  }
  
}
