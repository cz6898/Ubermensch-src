/**
 * Created by Chris on 5/22/2016.
 */
public class GodDialogue extends Dialogue{
    public GodDialogue(){
        super();
    }
    protected void init(){
        String[][] tempOpt = {{"Who are you?", "Where am I?"}, {"I agree", "I refuse"}, {"End conversation"}, {"I have done as you asked. ", "I am here to destroy you. "},
                {"I believe you are a blight upon humanity, a husk of self-righteousness and amorality which demands our servitude. I reject the very concept of you. ", "Forgive me!"},
                {"You shall destroyed and cast aside for the beacon of falseness that you are. "}, {"Plunge the blade into his heart. "}, {"Show mercy. ", "Don't show mercy. "}};
        String[][] tempDiag = {{"Welcome, sinner. ",
                /*First dialogue option*/
                "Do not ask that of me, you unworthy swine. You are but a thrall, whom I will deem worthy of either sedative happiness or blistering agony. ",
                "Where are you? Some place empty, full of misery and despair. You face my judgement and an existence as meaningless as life itself. You have entered into the jurisdiction of death. "},
                {"But you don't have to endure the knaves and arrows of punishment, nor the whips and scorns of damnation. Not if you perform a single task for me. ",
                /*Second dialogue option*/
                "Thank you, faithful servant. ", "Ah, but you will do so all the same. I am omnipotent and you are here only because I have willed that you shall suffer. ",},{
                "There are four men, four dissidents, who continue to wage a futile war of sin against me. " +
                        "\nThese are: Nietzsche- the nihilist who would proclaim me dead, " +
                        "\nTrump- the glutton of wealth and avarice, whose pretensions towards wealth have created the illusion that he is a more worthy god than I, " +
                        "\nMarx- who believes I am naught but a blight, a weakness by which the masses are pacified, " +
                        "\nand Snowden- who will not yield his privacy to my omniscience and fights me with what little vigor he has. ",
                "Find these fools and end them, lest you be condemned to burn for all eternity."}, {
                "So, you've returned. ",
                /*Third dialogue option*/
                "Do you take me for a fool? You have conspired with those who would seek to destroy me. ",
                "Thank you for carrying out my justice. Now, walk with me. ", "Oh?"},{
                "Why did you adopt such a foolish position?",
                /*Fourth dialogue option*/
                "Ah, so Nietzsche has indoctrinated you. ", "You are not forgiven. Go now, into eternal agony."},{
                "You are deserving of nothing more than eternal agony.",
                /*Fifth dialogue option*/
                "You are a fool to think you can challenge me. ", "What!? I cannot die! You are naught but my thralls, who suffer at my pleasure! Stop or I shall destroy you! "},{
                /*Sixth dialogue option*/
                "Mercy! Please! "},{
                /*Seventh dialogue option*/
                "I am slain! Deposed of by the very dogs whose futility I cherished! Alas, may the eternity be as hollow and fruitless for you as it was for me! "}
        };
        addArray(this, tempDiag);
        addArray(options,tempOpt);
    }
}
