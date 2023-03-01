package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(0,0));
    frame.getMap().add("tok_x0_y0", new Location(0,0), new CookieComponent(0,0,1), Map.Type.COOKIE);
    if (frame.getMap().eatCookie("tok_x0_y0") == null) {
      throw new FileNotFoundException();
    }
  }
}
