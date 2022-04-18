package org.example.ssm.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable {

    private Integer empNo;

    private Date birthDate;

    private String firstName;

    private String lastName;

    private String gender;

    private Date hireDate;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employee() {
    }

    public Employee(Integer empNo, Date birthDate, String firstName, String lastName, String gender, Date hireDate) {
        this.empNo = empNo;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " {" +
                ", empNo=" + empNo +
                ", birthDate=" + birthDate +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", gender=" + gender +
                ", hireDate=" + hireDate +
                "}";
    }
}