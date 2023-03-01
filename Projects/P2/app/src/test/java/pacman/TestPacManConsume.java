package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManConsume extends TestCase {

  public void testPacManConsume() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(0,0));
    frame.getMap().add("cookie", new Location(0,0), new CookieComponent(0,0,1), Map.Type.COOKIE);
    if (frame.getMap().eatCookie("eat") == null) {
      throw new FileNotFoundException();
    }
  }
}
