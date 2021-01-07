package com.mihasya.spring.mvc;

import com.mihasya.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 100, message = "name min 2 and max 100 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 300, message = "min 300")
    @Max(value = 1000, message = "max 1000")
    private int salary;
    private String department;
    private String carBrand;
    @CheckEmail
    private String email;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;

    public Employee() {
        departments = new HashMap<String, String>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");
        carBrands = new HashMap<>();
        carBrands.put("Lada", "Lada");
        carBrands.put("KIA", "KIA");
        carBrands.put("Mercedes-Benz", "MB");
        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
