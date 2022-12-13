package org.app.dto;

public class CsvLineDto {
    private String id;
    private String firstname;
    private String lastname;
    private String city;
    private String birthday;
    private String salary;
    private String profession;
    private String fired;

    public CsvLineDto(String id, String firstname, String lastname, String city,
                      String birthday, String salary, String profession, String fired) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.birthday = birthday;
        this.salary = salary;
        this.profession = profession;
        this.fired = fired;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFired() {
        return fired;
    }

    public void setFired(String fired) {
        this.fired = fired;
    }

    @Override
    public String toString() {
        return "CsvDto{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", birthday='" + birthday + '\'' +
                ", salary='" + salary + '\'' +
                ", profession='" + profession + '\'' +
                ", fired='" + fired + '\'' +
                '}';
    }
}
