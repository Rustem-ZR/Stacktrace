import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker cheker = new PasswordChecker();

        try {
            System.out.println("Введите мин. длину пароля: ");
            int minLength = Integer.parseInt(scanner.nextLine());
            cheker.setMinLength(minLength);

            System.out.println("Введите макс. допустимое количество повторений символа подряд: ");
            int maxRepeats = Integer.parseInt(scanner.nextLine());
            cheker.setMaxRepeats(maxRepeats);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                System.out.println("Введите пароль или end: ");
                String password = scanner.nextLine();
                if ("end".equals(password)) {
                    break;
                }
                if (cheker.verify(password)) {
                    System.out.println( "Подходит");
                } else {
                    System.out.println( "Не подходит");
                }
            }
        }catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
