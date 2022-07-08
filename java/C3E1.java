import java.util.Scanner;

public class C3E1 {
    public static void main(String[] args) {
        Compilation();
        Compilation();
    }
    static void Compilation(){
        System.out.println("hello world");
        String game="onepiece";
        System.out.println("mon jeu préféré est "+game);
        Scanner input= new Scanner(System.in);
        System.out.println("entrer votre animal préféré");
        String userAnimal= input.nextLine();
    
        System.out.println("votre animal préféré est "+userAnimal);
        // input.close(); 
        System.out.println("\007");

    }
}
