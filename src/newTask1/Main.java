package newTask1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("src/newTask1/text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String temp;
        while ((temp = br.readLine()) != null){
            System.out.println(temp);
        }
    }
}
