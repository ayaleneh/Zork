import java.util.Scanner;

public class Zork {
    public static void main(String[] args) {
        String answer="";
        System.out.println("which room you want to travel..");
        Scanner scanner=new Scanner(System.in);
        answer=scanner.nextLine();
        switch (answer){
            case "foyer":
                foyer();
                break;
            case "front room":
                front_room();
                break;
            case "library":
                library();
                case
        }
    }
}

