import static org.junit.Assert.*;
import org.junit.*;
import superhero_stuff.*;

public class MarvelHeroTest {

  MarvelHero marvelHero;

  @Before
  public void before(){
    marvelHero = new MarvelHero("Dr. Strange");
  }

  @Test
  public void hasName(){
    assertEquals("Dr. Strange", marvelHero.getName());
  }

  @Test
  public void canTalk(){
    assertEquals("Hello, my name is Dr. Strange and I'm here to save the day.", marvelHero.talk());
  }

}