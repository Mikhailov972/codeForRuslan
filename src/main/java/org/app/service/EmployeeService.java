package org.app.service;

import org.app.dto.EmployeeDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public List<EmployeeDto> filterByBirthdayAndSalaryAndFired(LocalDate birthday, Double salary, Boolean isFired,
                                                               List<EmployeeDto> employees) {

        List<EmployeeDto> result = new ArrayList<>();

        for (EmployeeDto currentEmployee : employees) {
            if (currentEmployee.getBirthday().isAfter(birthday)
                    && currentEmployee.getSalary() > salary
                    && currentEmployee.getIsFired() == isFired) {
                result.add(currentEmployee);
            }
        }

        return result;
    }
}
