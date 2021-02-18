package newTask2;

public class Main {
    public static void main(String[] args) {
        String date = "18.02.2021";
        System.out.println(date);
        date = date.replace(".", "");
        System.out.println(date);
        int num = Integer.parseInt(date);
        int sum = 0;
        while (num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
