import hiof.sekouk.softogtest.oblig2.LeapYear;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class test_isLeapYear {
    @Test
    public void test_isLeapYear_divisible_by_4(){
        assertTrue(LeapYear.isLeapYear(2024));
        assertTrue(LeapYear.isLeapYear(2008));
    }
    @Test
    public void test_isLeapYear_divisible_by400(){
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
    }
    @Test
    public void test_isLeapYear_not_divisible_by4(){
        assertFalse(LeapYear.isLeapYear(2016));
        assertFalse(LeapYear.isLeapYear(2019));
        assertFalse(LeapYear.isLeapYear(2022));
    }
    @Test
    public void test_isLeapYear_divisible_by100(){
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2000));
    }
}
