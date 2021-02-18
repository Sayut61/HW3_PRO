package dop;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File f1 = new File("file.txt");
        BufferedReader br = new BufferedReader(new FileReader(f1));
        PrintWriter printWriter = new PrintWriter(new FileWriter(f1, true));
        printWriter.println("HI HI hi");
        printWriter.flush();
        String tmp;
        while ((tmp = br.readLine()) != null){
            System.out.println(tmp);
        }
    }
}
