package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManConsume extends TestCase {

  public void testPacManConsume() throws FileNotFoundException {
    Mainframe frame = new Mainframe();
    PacMan pacman = frame.addPacMan(new Location(0,0));
    Map.add("cookie", new Location(0,0), new CookieComponent(0,0,1), Type.COOKIE);
    if (pacman.Map.eatCookie("eat") == null) {
      throw new FileNotFoundException();
    }
  }
}
