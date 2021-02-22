package newTask2;

public class Main {
    public static void main(String[] args) {
        String date = "18.02.2021";
        char chr;
        int sum = 0;
        for (int i = 0; i < date.length(); i++) {
            chr = date.charAt(i);
            if(chr >= 48 && chr <= 57){
                sum += Integer.parseInt(String.valueOf(chr));
            }
        }
        System.out.println(sum);
    }
}
