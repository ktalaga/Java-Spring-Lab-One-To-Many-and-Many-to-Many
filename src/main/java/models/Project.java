package models;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private Long id;
    private String name;
    private int duration;
    private List<Employee> employeeList;

    public Project(Long id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.employeeList = new ArrayList<>();
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
