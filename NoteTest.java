import static org.junit.Assert.assertEquals;
import org.junit.*;

public class NoteTest {

  Note middleC;

  @Before
  public void before() {
    middleC = new Note(60);
  }

  @Test
  public void hasNoteNum() {
    assertEquals( 60, middleC.noteNum());
  }

  @Test
  public void hasFreq() {
    assertEquals( 261.63, middleC.freq(), 0.01 );
  }
}