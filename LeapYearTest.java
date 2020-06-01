import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
    
    @Test
    public void isDivisibleBy4(){
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.checkIfLeapYear(2004));
    }

    @Test
    public void isDivisibleBy100AndAlso400(){
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.checkIfLeapYear(2024));
    }

}