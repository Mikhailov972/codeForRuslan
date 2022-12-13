package org.app.dto;

import java.time.LocalDate;

public class EmployeeDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String city;
    private LocalDate birthday;
    private Double salary;
    private String profession;
    private Boolean isFired;

    public EmployeeDto(Long id, String firstname, String lastname, String city,
                       LocalDate birthday, Double salary, String profession, Boolean isFired) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.birthday = birthday;
        this.salary = salary;
        this.profession = profession;
        this.isFired = isFired;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Boolean getIsFired() {
        return isFired;
    }

    public void setIsFired(Boolean isFired) {
        this.isFired = isFired;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", profession='" + profession + '\'' +
                ", isFired=" + isFired +
                '}';
    }
}
