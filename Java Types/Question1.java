import java.util.Scanner;
 
/** demonstrate how to read from System.in */
class Question1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.println(name.toUpperCase());

        scanner.close();
   }
}
