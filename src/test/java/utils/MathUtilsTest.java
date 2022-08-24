package utils;

import com.junit.utils.Employee;
import com.junit.utils.Manager;
import com.junit.utils.MathUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.commons.util.StringUtils;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class MathUtilsTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private Employee employee;

    @InjectMocks
    private MathUtils mathUtils;

    @Mock
    Manager manager;

    @BeforeEach
    void initEach() {
        //NO OP
    }

    @Test
    public void addTest() {
        assertEquals(2, mathUtils.add(1, 1), "Add method should return the sum of two numbers");
    }

    @Test
    public void computeCircleAreaTest() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10));
    }

    @Test
    public void testIsNamePresentForEmployee() {
        when(employee.getName()).thenReturn("MockName");
        assertFalse(StringUtils.isBlank(employee.getName()), "Employee name cannot be blank.");
    }

    @Test
    public void testIsRolePresentForEmployee() {
        when(employee.getRole()).thenReturn("Architect");
        assertEquals("Architect", employee.getRole(), "Employee role cannot be blank.");
    }

    @Test
    public void testIsNumberOfProjectsGreaterThanFive() {
        when(manager.isNumberOfProjectGreaterThanFive()).thenReturn(true);
        //manager.setNumberOfProjects(6);
        assertAll(

                () -> assertEquals(true, manager.isNumberOfProjectGreaterThanFive(), "Project should be greater than 5."),

                () -> assertEquals(true, manager instanceof Manager, "manager should be instance of Manager."),

                () -> assertFalse(employee instanceof Manager, "manager should be instance of Manager."));
    }

}
