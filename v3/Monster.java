public class Monster extends Character{
  
  public Monster(int h, int s, int c, int d, double a) {
    health = h;
    strength = s;
    critical = c;
    defense = d;
    accuracy = a;
  }

  public static Monster createMonster() {
    Monster[] typeList = {
      new Brute(),
      new Gambler(),
      new Predator(),
      new Troll(),
      new Vampire()
    };

    int type = (int)(Math.random()*typeList.length);
    String typeName;
    if(type == 0) {
        typeName = "brute";
    } else if(type == 1) {
        typeName = "gambler";
    } else if(type == 2) {
        typeName = "predator";
    } else if(type == 3) {
        typeName = "troll";
    } else {
        typeName = "vampire";
    }
    System.out.printf("It be a %s.%n", typeName);
    return typeList[type];
  }

}
