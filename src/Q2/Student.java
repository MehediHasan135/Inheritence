package Q2;

public class Student extends Person{
    private String major;
    Student(String name, int yearOfBirth, String major){
        super(name,yearOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString(){
        return super.toString()+"\n Major : "+major;
    }
}
