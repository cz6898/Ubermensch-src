/**
 * Created by Chris on 5/22/2016.
 */
public class God extends Entity{
    public God(){
        super();
        initBoolArray(8);
        dialogue = new GodDialogue();
    }
    public void conversation() throws ArrayIndexOutOfBoundsException{
        while(questStage < 3){
            converse();
        }
        if(questStage >= 3){

        }
        else{
            println("I have nothing more to say to you until your task is complete.");
        }
    }
}
