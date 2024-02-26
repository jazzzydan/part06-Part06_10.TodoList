import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    return; // Exit the method and the loop
                case "add":
                    System.out.print("To add: ");
                    String toDo = scanner.nextLine();
                    toDoList.add(toDo);
                    break;
                case "list":
                    toDoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int taskToRemove = Integer.valueOf(scanner.nextLine());
                    if (taskToRemove > toDoList.size() || taskToRemove <= 0) {
                        System.out.println("Invalid task index.");
                    } else {
                        toDoList.remove(taskToRemove);
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
