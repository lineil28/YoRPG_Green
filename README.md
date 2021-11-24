# YoRPG_Green # 
### Abdullah Faruque, Neil Lin, Russell Goychayev ###

New Classes- We implented 5 different Monster classes, and 3 different Protagonist classes. 
### Monsters ###
* Brute- Base monster, but with a bit more health than normal
* Troll- Low health, damage, and accuracy, but can attack up to 5 times in a single turn. 
* Vampire- Has the chance to gain 50% of the attack damage dealt in a turn. 
* Gambler- Flips a coin, determining whether the Gambler attacks itself or the protagonist. 
* Predator- Low health, but high damage. Gains damage per successful attack. Loses gained attack upon a miss. 

### Protagonists ###
* Knight- Your average joe, with moderate health, strength, attack, and accuracy. 
* Assassin- High damage at the cost of low defense. 
* Shield- High defense at the cost of low overall damage. 

### Version to Version Modifications ###
* v0-was the bear bone version of YoRPG, with only two subclasses, Monster and Protagonist. Was littered with inconsistincies. 
* v1-Introduction of the superclass Character that contained the shared methods for Monster and Protagonist. 
* v2-Monster is completely revamped, with 5 fleshed out monster types. Each monster did not have it's own subclass under Monster, due to lack of knowledge. 
* v3-The last and final version, with 3 new protagonist classes, under Protagonist. Each type of monster was made into its own subclass under Monster. Instance variables were slightly revamped. Critical is how much extra damage you do ontop of your strength, making strength the minimum amount of damage. Accuracy is a double representing the chances of one missing their attack. These variables were implemented to make attacks feel impactful. 

### Future Plans for the Game ###
* More classes?
* give the protagonist an inventory
* introduce items
* make monsters drop items at different rates (common, rare, epic, legendary items etc...)
* visuals? (pixel art?)
<<<<<<< HEAD
=======

>>>>>>> cfd7f10e02f7b88f1761c504a0ae18eaf523946e
