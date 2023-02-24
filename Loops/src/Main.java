import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //        for (int i=0; i<f; i++){
//            System.out.println("hello");
//        }
        int f = 3;
//        while (f<6) {
//
//            if (f==5){
//                continue;
//            }
//            System.out.println("hello");
//            f++;
//        }
//        do {
//            f++;
//            System.out.println("hello");
//        }while (f<6);

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int answer = scanner.nextInt();
        System.out.println("Answer is " + answer);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("your name is: " + name);*/

        Random random = new Random();
        int ran = random.nextInt(100);
        System.out.println(ran);
    }
}