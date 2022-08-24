package utils;

import com.junit.utils.Employee;
import com.junit.utils.Manager;
import com.junit.utils.MathUtils;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.commons.util.StringUtils;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MathUtilsTest {

    @Mock
    private Employee employee = new Employee(2, "Nitin", "Architect");

    @Mock
    private MathUtils mathUtils = new MathUtils();

    @Mock
    Manager manager = new Manager(employee, 6);

    @BeforeEach
    void initEach() {
        mathUtils = new MathUtils();
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
    public void testEmployee() {
        assertEquals("Architect", employee.getRole(), "Role is not correct.");
    }

    @Test
    public void testIsNamePresentForEmployee() {
        assertFalse(StringUtils.isBlank(employee.getName()), "Employee name cannot be blank.");
    }

    @Test
    public void testIsRolePresentForEmployee() {
        //when(employee1.getRole()).thenReturn("Manager");
        assertEquals("Architect", employee.getRole(), "Employee role cannot be blank.");
    }

    @Test
    public void testIsNumberOfProjectsGreaterThanFive() {
        //when(manager.getNumberOfProjects()).thenReturn(6);
        assertEquals(true, manager.isNumberOfProjectGreaterThanFive(), "Project should be greater than 5.");

        assertEquals(true, manager instanceof Manager, "manager should be instance of Manager.");

        assertFalse(employee instanceof Manager, "manager should be instance of Manager.");
    }

}
