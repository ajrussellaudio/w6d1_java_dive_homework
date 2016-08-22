import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SongTest {

  Song testSong;

  @Before
  public void before() {
    testSong = new Song(124, 8);
  }

  @Test
  public void hasZeroNotes() {
    assertEquals( 0, testSong.notesCount() );
  }

  @Test
  public void isFullOfNotes() {
    testSong.fillMiddleC();
    assertEquals( 8, testSong.notesCount() );
  }

  @Test
  public void hasASequenceOfNotes() {
    int[] sequence = {60, 62, 64, 0, 62, 64, 65, 0};
    testSong.fillSequence( sequence );
    assertEquals( 6, testSong.notesCount() );
  }

}