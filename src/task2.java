import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter string value");
        String value=input.nextLine();
        System.out.println("Please enter starting number");
        int firstNumb=input.nextInt();
        System.out.println("Please enter a ending number");
        int endNumb=input.nextInt();
        System.out.println(value.substring(firstNumb-1,endNumb-1));

    }
}
