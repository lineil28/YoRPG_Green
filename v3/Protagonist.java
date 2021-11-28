public class Protagonist extends Character{

	public String name;
  public String about;

	public Protagonist(String n, int s, int c, int d, double a) {
		name = n;
		health = 150;
		strength = s;
    critical = c;
		defense = d;
  	accuracy = a;
	}

	public String getName() {
		return name;
	}

	public  void normalize() {
    critical = 10;
		defense = 10;
	}

	public  void specialize() {
  	critical = 30;
		defense = 5;
	}

  public int attack(Character c) {
  	if(hit()) {
      System.out.println("You swing your sword.");
      return swing(c);
    } else {
      System.out.println("You miss!");
      return 0;
    }
	}

  public static Protagonist createPlayer(String name, int playerClass) {
    if(playerClass == 1) {
      return new Knight(name);
    } else if(playerClass == 2) {
      return new Assassin(name);
    } else {
      return new Shield(name);
    }
  }

  public void about() {
    System.out.println(about);
  }

}
