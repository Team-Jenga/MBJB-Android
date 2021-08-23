package org.dod.manbanjalbu;

// Recycler View 생성을 위한 Person Class
public class Person {

    String name;
    String department;
    String company;
    String phoneNumber;
    String companyNumber;
    String email;

    // 생성자
    public Person(String name, String department, String company, String phoneNumber, String companyNumber, String email) {
        this.name = name;
        this.department = department;
        this.company = company;
        this.phoneNumber = phoneNumber;
        this.companyNumber = companyNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
