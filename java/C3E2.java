import java.util.Scanner;

public class C3E2 {
    public static void main(String[] args) {
        Exclamation("bonjour");
        String variable="bonsoir";
        Exclamation(variable);
        Scanner input= new Scanner(System.in);

        System.out.println("entrer le mot");
        String userInput=input.nextLine();
        Exclamation(userInput);
        // Même qu'au dessus mais on ne stock pas dans une variable
        System.out.println("Entrez un deuxième mot :");
        Exclamation(input.nextLine());

        //La différence est :
        System.out.println("Le premier mot de mon utilisateur est : "+ userInput + "Par contre, je ne peux pas acceder au deuxième mot car je ne le stock pas dans une variable !");
    }
    static void Exclamation(String sentence){
        System.out.println( sentence + " !");
    }
    
}
