package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManConsume extends TestCase {

  public void testPacManConsume() throws FileNotFoundException {
    Mainframe frame = new Mainframe();
    Location loc = new Location(0,0)
    PacMan pacman = frame.addPacMan(loc)
    Map.add("cookie", loc, new CookieComponent(0,0,1), COOKIE);
    if (pacman.Map.eatCookie("eat") == null) {
      thrown new FileNotFoundException();
    }
  }
}
