/**
 * Created by Chris on 5/24/2016.
 */
public class Nietzsche extends Entity{
    public Nietzsche(){
        super();
        initBoolArray(3);
        dialogue = new NietzscheDialogue();
    }
    public void conversation(){
        while(questStage < 3){
            converse();
        }
        if(questStage >= 3 && alive){
            if(boolArray.get(2)){
                alive = false;
            }
            else{

            }
        }
        else{
            System.out.println("Nietzsche is dead");
        }
    }
}
