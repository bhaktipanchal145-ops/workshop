import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task added");

            } else if (choice == 2) {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }

            } else if (choice == 3) {
                System.out.print("Enter task number: ");
                int num = sc.nextInt();

                if (num > 0 && num <= tasks.size()) {
                    tasks.remove(num - 1);
                    System.out.println("Task deleted");
                } else {
                    System.out.println("Invalid number");
                }

            } else if (choice == 4) {
                break;

            } else {
                System.out.println("Wrong choice");
            }
        }

        sc.close();
    }
}