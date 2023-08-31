import java.util.*;
public class evenodd {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three number");
        int num1 = in.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1 + "is even num");
        } else {
            System.out.println(num1 + "is a odd num");
        }
    }
}