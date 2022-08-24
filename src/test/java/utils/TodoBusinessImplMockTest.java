package utils;

import com.junit.mockito.commands.TodoService;
import com.junit.mockito.commands.impl.TodoBusinessImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import utils.stub.TodoServiceStub;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    TodoService todoService;

    @InjectMocks
    TodoBusinessImpl todoBusinessImpl;

    @Test
    public void testRetrieveTodosRelatedToSpring_usingStub() {
        TodoServiceStub todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToJUnit("Dummy");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToJUnit_usingMock() {

        when(todoService.retrieveTodos("Dummy"))
                .thenReturn(Arrays.asList("JUnit Training", "Spring Training", "Web Designing Tutorial"));

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToJUnit("Dummy");
        assertEquals(1, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMockForEmptyList() {

        when(todoService.retrieveTodos("Dummy"))
                .thenReturn(Arrays.asList());

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToJUnit("Dummy");
        assertEquals(0  , filteredTodos.size());
        assertTrue(filteredTodos.isEmpty());
    }


}
