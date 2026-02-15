import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Document Factory Method ===");
            System.out.println("1 - Report");
            System.out.println("2 - Resume");
            System.out.println("3 - Letter");
            System.out.println("4 - Invoice (new)");
            System.out.println("0 - Exit");
            System.out.print("Выберите тип документа: ");

            int choice = readInt(sc);

            if (choice == 0) {
                System.out.println("Выход...");
                break;
            }

            DocumentCreator creator = switch (choice) {
                case 1 -> new ReportCreator();
                case 2 -> new ResumeCreator();
                case 3 -> new LetterCreator();
                case 4 -> new InvoiceCreator();
                default -> null;
            };

            if (creator == null) {
                System.out.println("Неверный выбор. Попробуйте снова.");
                continue;
            }

           
            creator.openDocument();
        }

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Введите число: ");
            sc.next();
        }
        int x = sc.nextInt();
        sc.nextLine();
        return x;
    }
}
