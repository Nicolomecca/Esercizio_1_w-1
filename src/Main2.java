import java.util.Scanner;

public class Main2 {
    public static void Main2(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[3];
        System.out.println("inserisci una stringa");
        input[0] = scanner.nextLine();
        System.out.println("inserisci una stringa");
        input[1] = scanner.nextLine();
        System.out.println("inserisci una stringa");
        input[2] = scanner.nextLine();
System.out.println("Ecco qui la concatenazione delle stringhe");
        System.out.println(input[0] + input[1] + input[2]);
        System.out.println("Ecco qui la concatenazione delle stringhe al contrario");
        System.out.println(input[2] + input[1] + input[0]);
        scanner.close();

    }
}