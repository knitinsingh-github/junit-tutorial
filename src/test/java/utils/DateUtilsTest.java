package utils;


import com.junit.mockito.commands.impl.DateUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DateUtilsTest {

    @Test
    public void dateUtilsMethodTest() {
        DateUtils dateUtils = mock(DateUtils.class);
        Date date = new Date();

        when(dateUtils.getDate()).thenReturn(date);
        assertEquals(date, dateUtils.getDate());
    }

    @Test
    public void dateUtilsMethodTest1() {
       assertEquals(true, true);
    }
}
