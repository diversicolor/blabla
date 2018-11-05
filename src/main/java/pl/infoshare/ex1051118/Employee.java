package pl.infoshare.ex1051118;

import java.time.LocalDate;

public class Employee{

    private LocalDate dateOfBirth;
    private String name;
    private String lastName;
    private String department;

    public void Employee(dateOfBirth, name, lastName, department){
        this.getDateOfBirth();
        this.getName();
        this.getLastName();
        this.getDepartment();
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }
}
