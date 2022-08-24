package utils;

import com.junit.mockito.commands.impl.TodoBusinessImpl;
import org.junit.Test;
import utils.stub.TodoServiceStub;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToJUnit_usingStub() {
        TodoServiceStub todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToJUnit("Dummy");
        assertEquals(2, filteredTodos.size());
    }


}
