public class Character{
	public int health;
	public int strength;
    public int critical;
	public int defense;
	public double accuracy;
    public static String about = "This creature is an empty husk.";

	public boolean isAlive() {
		return health > 0;
	}

	public int getDefense() {
		return defense;
	}

	public void lowerHP(int damage) {
		health -= damage;
	}

	public boolean hit() {
        return Math.random() < accuracy;
    }

    public int swing(Character c) {
        int damage = (int) (Math.max(1, Math.random()*critical + strength - c.getDefense()));
        c.lowerHP(damage);
        return damage;
    }

    public int attack(Character c) {
        if(hit()) {
            return swing(c);
        } else {
        return 0;
        }
	}

    public void about() {
  	    System.out.println(about);
    }
}