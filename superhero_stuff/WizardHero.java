package superhero_stuff;

public class WizardHero extends Superhero {
  
  public WizardHero(String name){
    super(name);
  }

  public String fly(){
    return this.getName() + " is flying with a broom!";
  }

}