package newTask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String yourName = in.next();
        char chr;
        int sum = 0;
        for (int i = 0; i < yourName.length(); i++) {
            chr = yourName.charAt(i);
            if ((chr >= 65 && chr <= 90) | (chr >= 97 && chr <= 122)){
                sum += chr;
            }
        }
        System.out.println(sum);
    }
}
