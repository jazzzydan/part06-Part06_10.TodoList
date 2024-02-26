//import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
//    private String task;
//    private Scanner scanner;
    private ArrayList<String> list;

    public TodoList() {
//        this.scanner = scanner;
        this.list = new ArrayList<>();
    }
    public void add(String task) {
        this.list.add(task);
    }
    public void print() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ": " + this.list.get(i));
        }
    }
    public void remove(int number) {
        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) == number) {
                this.list.remove(i);
            }
        }
    }
    public int size() {
        return this.list.size();
    }
}
