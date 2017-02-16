import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class GradeBookTest {

    //Test that the getGrade is not getting a number outside of index.
    @Test
    public void getGradeReturnsRandom(){
        GradeBook gb = new GradeBook();
        assertTrue(gb.getGrade(gb.createRandomNum()) != null);
        assertTrue(gb.getGrade(gb.createRandomNum()) != null);
        assertTrue(gb.getGrade(gb.createRandomNum()) != null);

    }

    //number should always be between 0 and 12
    @Test
    public void checkLogicOnRandomNumber(){
        GradeBook gb = new GradeBook();
        int i = 0;
        while(i < 100) {
            assertTrue(gb.createRandomNum() >= 0 && gb.createRandomNum() <= 12);
            i++;
        }
    }



}
