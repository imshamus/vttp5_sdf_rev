package CSV;

public class Employee 
{
    private String name;
    private String gender;
    private int salary;

    // Constructor
    public Employee(String name, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
    }

}
