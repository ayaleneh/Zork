import java.util.Scanner;

class Zork {
    public static int counter=0;
    public static int total_money=0;
    public static void main(String[] args) {
        System.out.println("|----------------------------|");
        System.out.println("|****************************|");
        System.out.println("|***WELCOME TO THE PROGRAM**|");
        System.out.println("|************ZORK************|");
        System.out.println("|----------------------------|");
        foyer();
    }
    public static void foyer(){
        counter++;
        String answer="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("'ROOM:'  FOYER   'CONTAIN:'   DEAD SCORPION    'DIRECTION TO:'  (NORTH)\n");

        money();

        while(true){
            System.out.println("which room you want to travel type (NORTH|N).. OR press 'q' to exit");
            answer=scanner.nextLine();
            if((answer.equalsIgnoreCase("NORTH"))||(answer.equalsIgnoreCase("N"))){
                front_room();
            }
            else if((answer.equalsIgnoreCase("q"))){
                exit();
            }
            else {
                System.out.println("please enter the correct choice");
            }
        }


    }
    public static void random(){

    }
    public static void front_room(){
        counter++;
        String money_choice;
        String answer="";
        Scanner scanner=new Scanner(System.in);
        int random=(int)(Math.random()*1000+1);
        System.out.println("'ROOM:'  FRONT_ROOM   'CONTAIN:'   PIANO    'DIRECTION TO:'  (SOUTH|WEST|EAST)\n");


        money();

        while(true){
            System.out.println("which room you want to travel type (SOUTH|S),(WEST|W),(EAST|E).. OR press 'q' to exit");

            answer=scanner.nextLine();
            answer=answer.toLowerCase();
            if(!(answer.equalsIgnoreCase("q"))){
                switch(answer){
                    case "south":
                    case "s":
                        foyer();
                        break;
                    case "west":
                    case "w":
                        library();
                        break;
                    case "e":
                    case "east":
                        kitchen();
                        break;
                    default:
                        System.out.println("please enter the correct direction");
                }
            }
            else if((answer.equalsIgnoreCase("q"))){
                  exit();
            }
            else {
                System.out.println("please enter the correct choice");
            }

        }


    }
    public static void library(){
        counter++;
        String money_choice;
        String answer="";

        System.out.println("'ROOM:'  LIBRARY   'CONTAIN:'   SPIDERS    'DIRECTION TO:'  (NORTH|EAST)\n");
       Scanner scanner=new Scanner(System.in);

         money();

        while(true){
            System.out.println("which room you want to travel.. OR press 'q' to exit");
            System.out.println("which room you want to travel type (NORTH|N),(EAST|E).. OR press 'q' to exit");

            answer=scanner.nextLine();
            answer=answer.toLowerCase();
            if(!(answer.equalsIgnoreCase("q"))){
                switch (answer){
                    case "east":
                    case "e":
                        front_room();
                        break;
                    case "north":
                    case "n":
                        dining_room();
                        break;
                    default:
                        System.out.println("please enter the correct direction");
                }
            }
            else if((answer.equalsIgnoreCase("q"))){
                exit();
            }
            else {
                System.out.println("please enter the correct choice");
            }

        }

    }
    public static void kitchen(){
        counter++;
        String money_choice;
        String answer="";
        System.out.println("'ROOM:'  KITCHEN   'CONTAIN:'   BATS    'DIRECTION TO:'  (WEST|NORTH)\n");
        Scanner scanner=new Scanner(System.in);

        money();


        while(true){
            System.out.println("which room you want to travel type (WEST|W),(NORTH|N).. OR press 'q' to exit");
            //Scanner scanner=new Scanner(System.in);
            answer=scanner.nextLine();
            if(!(answer.equalsIgnoreCase("q"))){
                switch(answer){
                    case "w":
                    case "west":
                        front_room();
                        break;
                    case "n":
                    case "north":
                        parlor();
                        break;
                    default:
                        System.out.println("please enter the correct room direction");
                }
            }
            else if((answer.equalsIgnoreCase("q"))){
                 exit();
            }
            else {
                System.out.println("please enter the correct choice");
            }

        }

    }
    public static void dining_room(){
        counter++;
        String money_choice;
        String answer="";
        System.out.println("'ROOM:'  DINING_ROOM   'CONTAIN:'  DUST EMPTY BOX    'DIRECTION TO:'  (SOUTH)\n");
        Scanner scanner=new Scanner(System.in);

        money();

        while (true){
            System.out.println("which room you want to travel type (SOUTH|S).. OR press 'q' to exit");

            answer=scanner.nextLine();

            if((answer.equalsIgnoreCase("south"))||(answer.equalsIgnoreCase("s"))){
                library();
            }
            else if(answer.equalsIgnoreCase("q")){
               exit();
            }
            else {
                System.out.println("please enter the correct choice");
            }
        }
    }
    public static void valut(){
        counter++;
        String money_choice;
        String answer="";
        System.out.println("'ROOM:'  VALUT   'CONTAIN:'  3 WALKING SKELETONS    'DIRECTION TO:'  (EAST1|E1),(EAST2|E2)\n");
         Scanner scanner=new Scanner(System.in);

         money();

        while(true){
            System.out.println("which room you want to travel type (EAST1|E1),(EAST2|E2).. OR press 'q' to exit");

            answer=scanner.nextLine();
            int random=(int)(Math.random()*10+1);
            if(((answer.equalsIgnoreCase("EAST1"))||(answer.equalsIgnoreCase("E1")))||(answer.equalsIgnoreCase("EAST2"))||(answer.equalsIgnoreCase("EAST2"))) {
                if (random >= 7) {
                    parlor();
                } else if (random < 7) {
                    secret_room();
                }
            }
            else if(answer.equalsIgnoreCase("q")){
                 exit();
            }
            else{
                System.out.println("please enter the correct choice");
            }
        }
    }


    public static void parlor(){
        counter++;
        String money_choice;
        String answer="";
        System.out.println("'ROOM:'  PARLOR   'CONTAIN:'  TREASURE CHEST     'DIRECTION TO:'  (EAST|E),(SOUTH|S)\n");
        Scanner scanner=new Scanner(System.in);

        money();

        System.out.println("'ROOM:'  PARLOR   'CONTAIN:'  TREASURE CHEST    'DIRECTION TO:'  (e6|s4)\n");

        while (true){
            System.out.println("which room you want to travel type (EAST|E),(SOUTH|S).. OR press 'q' to exit");
            answer=scanner.nextLine();
            if(answer.equalsIgnoreCase("e6")){
                valut();
            }
            else if(answer.equalsIgnoreCase("s4")){
                kitchen();
            }
            else if(answer.equalsIgnoreCase("q")){
                exit();
            }
            else {
                System.out.println("please enter the correct choice");
            }
        }
    }
    public static void secret_room(){
        counter++;
        String money_choice;
        String answer="";
        Scanner scanner=new Scanner(System.in);

        money();

        System.out.println("YOU ARE IN SECRET ROOM RIGHT NOW\n");
        System.out.println("'ROOM:'  SECRET_ROOM   'CONTAIN:'  PILES OF GOLD    'DIRECTION TO:'  (w6)\n");

        while (true){
            System.out.println("which room you want to travel..  OR press 'q' to exit");

            //Scanner scanner=new Scanner(System.in);
            answer=scanner.nextLine();
            if(answer.equalsIgnoreCase("w6")){
                valut();
            }
            else if(answer.equalsIgnoreCase("q")){
             exit();
            }
            else {
                System.out.println("please enter the correct choice");
            }
        }
    }
    public static void money(){
        Scanner scanner=new Scanner(System.in);
        String money_choice;

        int random=(int)(Math.random()*1000+1);
        System.out.println("DO YOU WANT TO TAKE THE MONEY?...(y|n)");

        money_choice=scanner.nextLine();
        if((money_choice.equalsIgnoreCase("y"))){
            total_money=total_money+random;
        }
        else if((money_choice.equalsIgnoreCase("n"))){
            total_money=total_money+0;
        }
        else
        {
            System.out.println("you should type 'y' or 'n'");
            System.out.println("thanks try later");
            System.exit(0);
        }


    }
    public  static void exit(){
        System.out.println("YOU VISIT "+counter +" ROOM");
        System.out.println("YOU HAVE "+total_money+" AMOUNT OF MONEY");
        System.out.println("THANKS");
        System.exit(0);
    }

}

