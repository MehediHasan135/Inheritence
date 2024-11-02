package Q2;

public class Person {
    private String name;
    private int yearOfBirth;
    Person(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
        return name;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public String toString(){
        return "Name : "+name+"\nYearOfBirth : "+yearOfBirth;
    }
}
