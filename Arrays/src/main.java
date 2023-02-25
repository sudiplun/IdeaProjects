import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] names = {"yadester", "duryoudan", "bhim", "sakul", "nakul"};
        int[] id = {11, 12, 13, 14, 15};
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("Enter a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=0; i<names.length; i++) {
            if(name.equals(names[i])){
                System.out.println(id[i]);
            }
        }

    }
}
