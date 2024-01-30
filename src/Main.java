import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Intern intern = new Intern("Ana", "anagmrebelo@hotmail.com", 25, 25000);
        System.out.println(intern);

        Employee employee = new Employee("Ana", "anagmrebelo@hotmail.com", 25, 25000);
        System.out.println(employee);

        Intern intern1 = new Intern("Ana", "anagmrebelo@hotmail.com", 25, -25000);
        System.out.println(intern1);

        Employee employee1 = new Employee("Ana", "anagmrebelo@hotmail.com", 25, -25000);
        System.out.println(employee1);

        FileWriter writer = new FileWriter("employees.txt", true);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Intern internRandom = new Intern("Ana" + i, "Email" + i, rand.nextInt(-100, 100), rand.nextDouble(-30, 38000));
            writer.write(internRandom.toString());
        }
        writer.close();
    }
}
