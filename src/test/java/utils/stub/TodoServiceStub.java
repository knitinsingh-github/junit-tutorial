package utils.stub;

import com.junit.mockito.commands.TodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn JUnit Basics", "Learn JUnit Coding",
                "Learn to Dance");
    }

    public void deleteTodo(String todo) {

    }
}
