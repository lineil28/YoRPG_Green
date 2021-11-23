public class Protagonist extends Character{
	public String name;
	public final int originalDefense;
	public final double originalAttackRating;
	
	public Protagonist(String n){
		name = n;
		health=100;
		strength=20;
		defense=5;
		attackRating=0.6;
		originalDefense = defense;
		originalAttackRating = attackRating;
	}

	public  void normalize(){
		defense = originalDefense;
		attackRating = originalAttackRating;
	}
	
	public  void specialize(){
		defense = 1;
		attackRating = 1.0;
	}
	
	public String getName(){
		return name;
	}
}