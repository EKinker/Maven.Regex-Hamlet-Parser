import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        hamletParser.changeHamletToLeon();
        int expected = 0;
        int actual = hamletParser.findHamlet();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(472, hamletParser.findName("leon"));
    }

    @Test
    public void testChangeHoratioToTariq() {
    }

    @Test
    public void testFindHoratio() {
        int expected = 158;
        int actual = hamletParser.findHoratio();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHamlet() {
        int expected = 472;
        int actual = hamletParser.findHamlet();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindName() {
        String name = "Hamlet";
        int expected = 472;
        int actual = hamletParser.findName(name);

        Assert.assertEquals(expected, actual);
    }


}