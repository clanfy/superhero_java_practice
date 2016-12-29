import static org.junit.Assert.*;
import org.junit.*;
import superhero_stuff.*;

public class WizardHeroTest {

  WizardHero wizardHero;

  @Before
  public void before(){
    wizardHero = new WizardHero("Harry Potter");
  }

  @Test 
  public void hasName(){
    assertEquals("Harry Potter", wizardHero.getName());
  }

  @Test
  public void canTalk(){
    assertEquals("Hello, my name is Harry Potter and I'm here to save the day.", wizardHero.talk());
  }

  @Test
  public void canFly(){
    assertEquals("Harry Potter is flying with a broom!", wizardHero.fly());
  }

}