import java.util.Scanner;

/**
 * C2Bonus
 */
public class C2Bonus {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("dans quelle maison de Poudlard  voudrais tu être envoyé ?");
        String UserHouse= input.nextLine();
        System.out.println("Tu veux aller à "+ UserHouse.toUpperCase()+"?! Mais tu es un sale moldu, les grands mages parlent couramment le Java !");


    }
}
