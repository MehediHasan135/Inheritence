package Q2;

public class Instructor extends Person{
    private double salary;
    Instructor(String name, int yearOfBirth, double salary){
        super(name,yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return super.toString()+"\nSalary : "+salary;
    }
}
