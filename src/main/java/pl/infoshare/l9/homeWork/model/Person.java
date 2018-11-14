package pl.infoshare.l9.homeWork.model;

import java.time.LocalDate;


public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String sex;


    public Person(LocalDate dateOfBirth, String sex) {
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }
}

