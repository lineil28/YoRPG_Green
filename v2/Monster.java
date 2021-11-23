public class Monster extends Character{
	public final String[] typeList = {
		"brute", //most health, attacks every other turn, average attack
		"troll", //less health, have a chance to attack more than once (max 3), less attack
		"vampire", //chance to gain health from attack, average
		"gambler", //flips coin, either hurts itself or protagonist, attack rating is always full, he don't miss
		"predator" // lots of damage, low defense health, strength increases per attack, but if he misses, attack resets
	};
	public String type;
	public int timer;

	public Monster(){
		type = typeList[(int)(Math.random()*typeList.length)];
		System.out.printf("It be a %s!%n", type);

		if(type == "brute") {
			health=100;
			strength=20;
			defense=10;
			attackRating=1;
		} else if(type == "troll") {
			health=25;
			strength=10;
			defense=5;
			attackRating=1;
		} else if(type == "vampire") {
			health=50;
			strength=20;
			defense=15;
			attackRating=1;
		} else if(type == "gambler") {
			health=50;
			strength=20;
			defense=10;
			attackRating=1;
		} else if(type == "predator") {
			health=40;
			strength=20;
			defense=5;
			attackRating=1;
		}
		timer = 0;
	}

	public int attack(Character c) {
		System.out.println();
		if(type == "brute") {
			timer = (timer+1)%2;
			if(timer==0) {
				int damage = (int) (Math.max(0, strength * attackRating - c.getDefense()));
				c.lowerHP(damage);
				return damage;
			} else {
				if(isAlive()) {
					System.out.println("The brute bides his time.");
				}
				return 0;
			}
		} else if(type == "troll") {

			int damage = 0;
			int numAttacks = (int)(6*Math.random());

			for(int i=0; i < numAttacks; i++) {
				int currentDamage = (int) (Math.max(0, strength * attackRating - c.getDefense()));
				System.out.println("Bonk!");
				c.lowerHP(damage);
				damage += currentDamage;
			}

			if(numAttacks>0) {
					System.out.printf("The troll clubbed you %d time(s)!!!%n", numAttacks);
				} else {
				System.out.println("The troll trolled you. :)");
				}
				return damage;
			} else if(type == "vampire") {
				int damage= (int) (Math.max(0, strength * attackRating - c.getDefense()));
				c.lowerHP(damage);
				if(Math.random()<0.5) {
					health = (int)(Math.min(50, health + 0.5*damage)); //vampire's health caps at 50
					System.out.println("The vampire drains your life!");
				}
				return damage;
			} else if(type == "gambler") {
				int guess = (int)(2*Math.random());
				if(guess==0) {
					System.out.println("The gambler bets on heads!");
				} else {
					System.out.println("The gambler bets on tails!");
				}
				System.out.println("The gambler flips his coin...");
				int coin = (int)(2*Math.random());
				if(coin==0) {
					System.out.println("Heads!");
				} else {
					System.out.println("Tails!");
				}
				if(guess==coin) {
					c.lowerHP(strength);
					return strength;
				} else {
					System.out.println("\"I am a man of my word,\" the gambler chortles.");
					lowerHP(strength);
					System.out.printf("The gambler stabs himself for %d points of damage.%n", strength);
					return 0;
				}
			} else if(type == "predator") {
				int damage= (int) (Math.max(0, strength * attackRating - c.getDefense()));
				c.lowerHP(damage);
				if(damage>0) {
					System.out.println("The predator studies your weaknesses.");
					strength+=5;
				} else {
					System.out.println("The predator loses its focus.");
					strength=20;
				}
				return damage;
			} else {
				return 0;
		}
	}
}
