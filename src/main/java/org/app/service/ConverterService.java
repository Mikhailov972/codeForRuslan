package org.app.service;

import org.app.dto.CsvLineDto;
import org.app.dto.EmployeeDto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConverterService {
    public List<EmployeeDto> csvLineDtoListToEmployeeDtoList(List<CsvLineDto> csvLines) {

        List<EmployeeDto> result = new ArrayList<>();

        for (CsvLineDto currentCsvLine : csvLines) {
            Long id = Long.valueOf(currentCsvLine.getId());
            String firstName = currentCsvLine.getFirstname();
            String lastName = currentCsvLine.getLastname();
            String city = currentCsvLine.getCity();
            LocalDate birthday = parseDate(currentCsvLine.getBirthday());
            Double salary = Double.valueOf(currentCsvLine.getSalary());
            String profession = currentCsvLine.getProfession();
            Boolean fired = Boolean.valueOf(currentCsvLine.getFired());

            EmployeeDto employeeDto = new EmployeeDto(id, firstName, lastName, city, birthday, salary, profession, fired);

            result.add(employeeDto);
        }

        return result;
    }

    private LocalDate parseDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date, formatter);
    }
}
