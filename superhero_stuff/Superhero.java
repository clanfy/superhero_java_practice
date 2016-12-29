package superhero_stuff;

public abstract class Superhero {

  private String name;
  private double health;
  
  public Superhero (String name){
    this.name = name;
    this.health = 100.0;
  }

  public String getName(){
    return this.name;
  }

}