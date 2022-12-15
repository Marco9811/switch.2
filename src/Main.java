import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert command : ");
            String input = scanner.nextLine();

            switch (input){
                case "size":
                    System.out.println(list.size());
                    break;
                case "clear":
                    list.clear();
                    break;
                case "print":
                    System.out.println(list.toString());
                    break;
                default:
                    list.add(input);
                    break;
            }
        }
    }
}
