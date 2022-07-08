import java.util.Scanner;

/**
 * C2E3
 */
public class C2E3 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("entrer votre animal préféré");
        String userAnimal= input.nextLine();
    
        System.out.println("votre animal préféré est "+userAnimal);
        input.close();

    }
}