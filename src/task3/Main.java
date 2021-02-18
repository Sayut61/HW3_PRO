package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String line = "Необходимо создать строку с текстом (текст взять любой из интернета). Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.";
        System.out.println("Длина строки: " + line.length());
        String firstLine = line.substring(0, (line.length()/2));
        String secondLine = line.substring(line.length()/2);
        StringBuffer sb = new StringBuffer();
        sb.append(firstLine).append(secondLine);
        System.out.println(sb);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(firstLine);
        System.out.println(secondLine);
    }
}
