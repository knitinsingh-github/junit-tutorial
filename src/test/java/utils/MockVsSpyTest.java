package utils;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockVsSpyTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    List arrayListMock;

    @Spy
    ArrayList arrayListSpy;

    @Test
    public void test() {
        assertEquals(0, arrayListMock.size());

        when(arrayListMock.size()).thenReturn(5);

        arrayListMock.add("Dummy");

        assertEquals(5, arrayListMock.size());

        assertEquals(0, arrayListSpy.size());

       arrayListSpy.add("JUnit");
       //arrayListSpy.add("Tutorial");

        //arrayListSpy.clear();
        when(arrayListSpy.size()).thenReturn(6);

        assertEquals(6, arrayListSpy.size());

        verify(arrayListSpy).add(anyString());

        verify(arrayListSpy, never()).add(anyInt());

        verify(arrayListSpy, never()).clear();

    }
}
