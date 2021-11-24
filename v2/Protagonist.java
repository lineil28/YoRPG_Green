public class Protagonist extends Character{
	public String name;
	public final int originalStrength;
	public final int originalDefense;
	
	public Protagonist(String n){
		name = n;
		health=150;
		strength=20;
		defense=10;
		originalStrength = strength;
		originalDefense = defense;
	}

	public  void normalize(){
		strength = originalStrength;
		defense = originalDefense;
	}
	
	public  void specialize(){
		strength = 30;
		defense = 5;
	}
	
	public String getName(){
		return name;
		joejoejoejoe
	}
}