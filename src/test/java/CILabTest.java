import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void getStringTest()
    {
        String s = myString.getString();
        assertEquals(null, s);
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertEquals(true, myString.detectCapitalUse());

    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test void detectCapitalUseTest3() {
        myString.setString("Google");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test void detectCapitalUseTest4() {
        myString.setString("LinkedIn");
        assertEquals(false, myString.detectCapitalUse());
    }

    @Test void detectCapitalUseTest5() {
        myString.setString(" Hello");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test void detectCapitalUseTest6() {
        myString.setString("Welcome");
        assertEquals(true, myString.detectCapitalUse());
    }
}
