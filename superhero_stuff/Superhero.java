package superhero_stuff;

public abstract class SuperHero {

  private String name;
  private double health;
  
  public SuperHero (String name){
    this.name = name;
    this.health = 100.0;
  }

  public String getName(){
    return this.name;
  }

}