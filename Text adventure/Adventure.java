import java.util.Scanner;
public class Adventure
{   public static String playerName;
    public static Scanner sc;
    public static boolean hasRock;
    public static boolean Life;
    public static boolean shelter;
    public static String roomChoice = sc.nextLine();
    public static void main(String[] args) {
        String playerName;
        Scanner sc = new Scanner(System.in) ;
        hasRock = false;
        Life = true;
        System.out.println("Greetings adventurer! Please enter your name: ");
        playerName = sc.nextLine();
        System.out.println("Ah, I see your name is " + playerName + ".  Interesting...");
        System.out.println("enjoy your adventure");
        StartRoom();
    }

        public static void StartRoom() {
            System.out.println("Welcome adventurer.  You have awoken in this dank cave.  Drips from the ceiling fall upon your slick forhead.");
            System.out.println("That wont be enough water to last you.  You better go search for a real water source if you want to survive.");
            System.out.println("There is a rock on the floor press 1 to pick it up or press 2 to escape");
            
            String roomChoice = sc.nextLine();
            if (roomChoice.equals("1")) {
                System.out.println("Now you have a weapon to defend yourself from this zombie in the cave that just randomly appeared");
                hasRock = true;
                Life = true;
                System.out.println("Okay time to get out of here.");
                CaveEntrance();
                
            }
            else if (roomChoice.equals("2")) {
                System.out.println("You should've taken that rock... ya dummbie");
                Life = false;
                System.out.println("Well... it's time to restart");
                StartRoom();
            }
        }
        public static void CaveEntrance () {
            System.out.println("You have to squint as the sun beams penetrate your soul!  Slowly your eyes adjust to the blinding light.  What happened to you? You can't remember.  Well, in order for you to remember you need to survive.  Go find your damn water now");
            System.out.println("from the right you hear russling from the bush, and from the left you hear silence.  Which way will you go?");
            System.out.println("press 1 to go right and 2 to go left");
            if (roomChoice.equals("1")) {
                System.out.println("You go around the bend to only be visited by a harmless beaver, and you follow it to a stream");
                Stream ();
            }
            else if (roomChoice.equals("2")) {
                System.out.println("Well... no streams are anywhere to be found.  Congrats");
                CaveEntrance();
                }
            }
            public static void Stream () {
                System.out.println("Well... since we already have a possible shelter you don't need to make one.  But if you want you can build your own.");
                System.out.println("However, heat is also important.  press 1 to build a shelter or press 2 to build a fire.");
                if (roomChoice.equals("1")) {
                    System.out.println("You gather sticks and rocks and leaves and stuff to build your amazing shelter! congrats!");
                    shelter = true;
                }
                else if (roomChoice.equals("2")){
                    System.out.println("Well... remember those zombies? Yeah well there were more... and you can't fight off a hoard with just one rock.");
                    Life = false;
                    StartRoom();
                }
            }        
        }
                    
           
                
  
    