/**
 * Created by Chris on 5/24/2016.
 */
public class NietzscheDialogue extends Dialogue {
    public NietzscheDialogue(){
        super();
    }
    protected void init(){
        String[][] tempOpt = {{"What's Nihilism?", "No..."}, {"Of course.", "Actually, I'm here to destroy you."}, {"I will see what I can do", "I will be remaining faithful to my God after all."}};
        String[][] tempDiag = {{"Greetings you futile fool. Tell me, have you found the answer to Nihilism yet?", "Nothing, nothing at all.", "Then you are as foolish as the rest of them."},
                {"The only solution to Nihilism is something called Ubermensch; that is, to live by principles that you yourself defined. Will you help me achieve Ubermensch?", "Very good.",
                        "Well hear me out before you do so."},
                {"Mankind has become naught but a thrall to suppositions of god. We invented religion to excuse our own suffering. " +
                        "Overtime, we became complacent with our misfortunes and learned to view pain as virtuous and right. " +
                        "'God' gave divinity to those very oppressions of life which we should have sought to destroy, as if our failures made us God's chosen;" +
                        "after all, men always beat the dogs they love best. To free mankind from this wretched curse, we must depose of the lord who claims this world as his own.",
                "Thank you. With the absence of the holy tyrant, we may yet find purpose.", "Aaaagh! I am slain!"}};
        addArray(this, tempDiag);
        addArray(options, tempOpt);
    }
}
