public class Employee {
    private String name;
    private String email;
    private int age;
    protected double salary;

    public Employee(String name, String email, int age, double salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(0, age);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = Math.max(salary, 0);
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "name=" + getName() + "\n" +
                "age=" + getAge() + "\n" +
                "email=" + getEmail() + "\n" +
                "salary=" + getSalary() + "\n" +
                "} \n";
    }
}
