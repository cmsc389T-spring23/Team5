package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    Mainframe frame = new Mainframe();
    PacMan pacman = frame.addPacMan(new Location(0,0));
    Map.add("tok_x0_y0", new Location(0,0), new CookieComponent(0,0,1), Map.Type.COOKIE);
    if (Map.eatCookie("tok_x0_y0") == false) {
      throw new FileNotFoundException();
    }
  }
}
