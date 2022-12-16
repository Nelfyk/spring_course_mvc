package com.ruslanburduzhan.spring.mvc;

import com.ruslanburduzhan.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Must be minimum 2 symbols")
    private String name;
    private String surname;
    @Min(value = 100, message = "Min 100")
    @Max(value = 2000, message = "Max 2000")
    private int salary;
    private String department;
    private final Map<String,String> departmentHashMap;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",
            message = "Please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;
    private String carBrand;
    private final Map<String,String> carBrandHashMap;
    private String[] languages;
    private final Map<String,String> languagesHashMap;

    public Employee() {
        departmentHashMap = new LinkedHashMap<>();
        departmentHashMap.put("Human Resources","HR");
        departmentHashMap.put("Internet Technology","IT");
        departmentHashMap.put("Sales","Sales");

        carBrandHashMap = new LinkedHashMap<>();
        carBrandHashMap.put("BMW","BMW");
        carBrandHashMap.put("Audi","Audi");
        carBrandHashMap.put("Mercedes-Benz","Mercedes-Benz");

        languagesHashMap = new LinkedHashMap<>();
        languagesHashMap.put("Russia","RU");
        languagesHashMap.put("English","EN");
        languagesHashMap.put("Deutsch","DE");
        languagesHashMap.put("French","FR");
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

    public Map<String, String> getDepartmentHashMap() {
        return departmentHashMap;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrandHashMap() {
        return carBrandHashMap;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesHashMap() {
        return languagesHashMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
