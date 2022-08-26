package com.junit.samples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CompanyUtilsTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Employee employee;



    @Mock
    Manager manager;

    //Manager manager1 = new Manager(0, null, 0L);

    @InjectMocks
    CompanyUtils companyUtils;

    @Test
    @DisplayName("Salary Greater ThanX")
    @Disabled
    public void testIsManagerSalaryGreaterThanX() {
        when(manager.getSalary()).thenReturn(5000001L);
        boolean isManagersWithSalaryGreaterThanX = companyUtils.isManagersWithSalaryGreaterThanX(manager, 5000000L);
        System.out.println(manager.getSalary());
        assertEquals(true, isManagersWithSalaryGreaterThanX, "Manager's salary is less than 50LPA");

    }

}
