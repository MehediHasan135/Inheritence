package Q3;

public class Employee {
    private String name;
    private double salary;
    public Employee(){
        name = "";
        salary =0;
    }
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name : " + name + "\nSalary : " + salary;
    }
}
