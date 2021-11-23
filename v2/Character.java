public class Character{
	public int health;
	public int strength;
	public int defense;
	public double attackRating;
	
	public boolean isAlive(){
		return (health>0);
	}
	
	public int getDefense(){
		return defense;
	}
	
	public void lowerHP(int damage){
		health-=damage;
	}
	
	public int attack(Character c){
		attackRating = Math.random();
		int damage= (int) (Math.max(0, strength * attackRating - c.getDefense()));
		c.lowerHP(damage);
		return damage;
	}
}
