package task2;

import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("task2.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println("Hallo World!!!\n" +
                    "I'm Anton.\n" +
                    "I live in Moscow.\n" +
                    "How are you?");
        pw.flush();
        pw.close();
        System.out.println("--------------------");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String tmp;
        while ((tmp = br.readLine()) != null){
            System.out.println(tmp);
        }
    }
}
