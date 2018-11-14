package pl.infoshare.l9.homeWork.model;

import java.time.LocalDate;

public class Student extends Person{

    private int indexNumber;

    public Student(LocalDate dateOfBirth, String sex, int indexNumber) {
        super(dateOfBirth, sex);
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

}
