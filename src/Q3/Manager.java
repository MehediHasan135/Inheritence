package Q3;

public class Manager extends Employee{
    private String department;
    public Manager(){
        department = "";
    }
    public Manager(String name, double salary, String department){
        super(name,salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString(){
        return super.toString()+"\nDepartment : " + department;
    }
}
