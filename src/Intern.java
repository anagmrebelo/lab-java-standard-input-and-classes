public class Intern extends Employee {
    private final int SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = Math.min(salary, SALARY_LIMIT);
        this.salary = Math.max(0, this.salary);
    }

}
