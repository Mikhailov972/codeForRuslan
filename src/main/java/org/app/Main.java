package org.app;

import org.app.dto.CsvLineDto;
import org.app.dto.EmployeeDto;
import org.app.service.ConverterService;
import org.app.service.CsvParserService;
import org.app.service.EmployeeService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvParserService service = new CsvParserService();
        ConverterService converterService = new ConverterService();
        EmployeeService employeeService = new EmployeeService();


        List<CsvLineDto> csvLineDtoList = service.csvParser("src/main/resources/employees.csv");
        List<EmployeeDto> employeeDtosList = converterService.csvLineDtoListToEmployeeDtoList(csvLineDtoList);

        // Инициализирую дату
        LocalDate filterDate = LocalDate.of(2000, 1, 1);

        // Получаю фильтрованные элементы
        List<EmployeeDto> filterEmployees = employeeService.filterByBirthdayAndSalaryAndFired(filterDate, 2500.0,
                false, employeeDtosList);

        // Вывожу полученны элементы
        for (EmployeeDto employee : filterEmployees) {
            System.out.println(employee);
        }
    }
}