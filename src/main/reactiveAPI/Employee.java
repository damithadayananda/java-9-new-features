package main.reactiveAPI;

public class Employee {
    private int id;
    private String fname;
    private String sname;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Employee(String fname, String sname) {
        this.fname = fname;
        this.sname = sname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return fname;
    }

    public void setFName(String name) {
        this.fname = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + fname + '\'' +
                '}';
    }
}
