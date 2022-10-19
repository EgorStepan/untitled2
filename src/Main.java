import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String choise = read.nextLine();

        while (!choise.equals("Exit") && !choise.equals("exit") ) {
            switch (choise) {
                case "hello": {
                    System.out.println("123");
                    break;
                }
                case "hi": {
                    System.out.println("11223");
                    break;
                }
                default: {
                    System.out.println("12344313");
                }
            }
            choise = read.nextLine();
        }


    }
}