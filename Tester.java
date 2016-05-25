import java.util.Scanner;

/**
 * Created by Chris on 5/24/2016.
 */
public class Tester {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        Player player = new Player();
        Map map = new Map();
        boolean active = true;
        while(active){
            System.out.println("What would you like to do?");
            String next = scan.nextLine();
            if(next.equals("/help")){
                System.out.println(
                        "The following can be typed: " +
                                "\ntalk: talk to an npc on the tile" +
                                "\ninventory: check your inventory" +
                                "\nmove: move to another location" +
                                "\n/quit: terminates game" +
                                "\n/help: gets help (although you already knew that)"
                );
            }
            else if(next.equals("/quit")){
                active = false;
            }
            else if(next.equals("talk")){
                System.out.println("To?");
                String npc = scan.nextLine();
                int temp1 = player.getCurrentTile().getIndex(npc);
                if(temp1 >= 0){
                    player.getCurrentTile().getEntity(temp1).conversation();
                }
                else{
                    System.out.println("Invalid npc");
                }
            }
            else if(next.equals("inventory")){
                for(int i = 0; i < player.getInventory().size(); i++){
                    System.out.println(i + ". " + player.getInventory().get(i));
                }
            }
            else if(next.equals("move")){

            }
        }
    }
}
