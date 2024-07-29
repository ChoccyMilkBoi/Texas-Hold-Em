import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Press enter to begin game.");
        boolean GameActive = true;
        String StrGameActive;
        do{





            do{
                System.out.println("Play again? (Y/N)");
                StrGameActive = scan.nextLine();
                switch(StrGameActive){
                    case "Y":
                        break;
                    case "N":
                        GameActive = false;
                        break;
                    default:
                        System.out.println("Invalid input, go again.");
                        break;
                }
            }while(!(StrGameActive.equalsIgnoreCase("Y") || StrGameActive.equalsIgnoreCase("N")));
        }while(GameActive);
        System.out.println("Thank you for playing!");
    }
}