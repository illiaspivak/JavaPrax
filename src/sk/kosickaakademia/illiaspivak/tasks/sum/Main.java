package sk.kosickaakademia.illiaspivak.tasks.sum;

import java.util.Scanner;

/**
 * Enter numbers from the keyboard and count their sum until the user enters the word "sum"
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers:");
        while(true){
            String s = scanner.nextLine();
            if(s.equals("sum"))
                break;
            int x = Integer.parseInt(s);
            sum = sum + x;
        }
        System.out.println(sum);

    }
}
