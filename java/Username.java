import java.util.Scanner;

public class Username {
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        String username= ChooseName();
    
     String botname="Vogue marry";
        System.out.println(username +" prend la mer seul sur son bateau le " +botname +" une grande aventure l'attend");

    }
static String ChooseName(){
String _defaultName="luffy";
System.out.println("votre nom est "+ _defaultName +" voulez vous le changer o/n");
String _choice= input.nextLine().toLowerCase();
if(_choice.equals("o")){
    System.out.println(" quel est le nom que vous voulez?");
    _defaultName=input.nextLine();
    _defaultName=_defaultName.substring(0,1).toUpperCase() + _defaultName.substring(1).toLowerCase();
}

else if(_choice.equals("n")){
    System.out.println("vous conservez le nom "+ _defaultName);
}
else{
    System.out.println("entrée incorrecte");
    _defaultName=ChooseName();
    return _defaultName;

}
return ConfirmName(_defaultName);
}


 static String ConfirmName(String _username ){
     System.out.println("vous ne pourrez pas changer de nom durant toute votre aventure,confirmer le nom " + _username + "o/n");
     String _choice= input.nextLine().toLowerCase();
     if(_choice.equals("o")) {
System.out.println("entrer validé");
 }
 else if(_choice.equals("n")){
     System.out.println("pseudo refusé,réintroduisez votre pseudo");
     _username=ChooseName();
 }
 else{
     System.out.println("entrée incorrecte,recommencez");
     _username=ConfirmName(_username);
 }
 return _username;

 }
    
}
