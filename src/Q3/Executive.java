package Q3;

public class Executive extends Manager{
    public Executive(String name, double salary, String department){
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Executive : \n" + super.toString();
    }

}
