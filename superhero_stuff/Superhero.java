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

  public String talk(){
    return "Hello, my name is " + this.name + " and I'm here to save the day.";
  }

  public String fly(){
    return this.name + " is now flying!";
  }

}