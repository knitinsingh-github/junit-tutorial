package com.junit.samples;

import org.junit.Rule;
import org.junit.Test;
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

    @InjectMocks
    CompanyUtils companyUtils;

    @Test
    public void testIsManagerSalaryGreaterThanX() {
        when(manager.getSalary()).thenReturn(5000001L);
        boolean isManagersWithSalaryGreaterThanX = companyUtils.isManagersWithSalaryGreaterThanX(manager, 5000000L);
        System.out.println(manager.getSalary());
        assertEquals(true, isManagersWithSalaryGreaterThanX, "Manager's salary is less than 50LPA");

    }

}
