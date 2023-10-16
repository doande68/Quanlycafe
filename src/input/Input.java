package input;

import java.util.Scanner;

public class Input {
    public static Scanner input = new Scanner(System.in);
    public  static int inputInterger(){
        int number;
        while (true){
            try {
                number = Integer.parseInt(input.nextLine());
                return number;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
    }
    public static double inputDouble() {
        double number;
        while (true) {
            try {
                number = Double.parseDouble(input.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập so");
            }
        }
    }
    public static String inputStr (){
        return  input.nextLine();
    }
}
