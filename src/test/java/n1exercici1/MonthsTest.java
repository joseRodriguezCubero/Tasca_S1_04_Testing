package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthsTest {

    @Test
    void SearchEightKeyAndReturnsAgosto(){
        var Months = new Months();
        assertEquals ("Agosto",Months.setMonths().get(8));
    }

    @Test
    void MonthsContainsTwelveElements(){
        var Months = new Months();
        assertEquals(12,Months.setMonths().size());
    }

    @Test
    void MonthsHasNoNullValues(){
        var Months = new Months();
        assertNotNull(Months.setMonths());
    }

}