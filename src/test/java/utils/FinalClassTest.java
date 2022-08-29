package utils;

import com.junit.utils.FinalClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class FinalClassTest {

    @Test
    public void testFinalClass() {
        FinalClass concrete = new FinalClass();

        FinalClass mock1 = mock(FinalClass.class);

        given(mock1.finalMethod()).willReturn("not anymore");

        assertEquals(true, !mock1.finalMethod().equals(concrete.finalMethod()));
    }

}
