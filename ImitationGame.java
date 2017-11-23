
/**
 * Write a description of class ImitationGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImitationGame
{
    public static void main(String [] args) 
    {
        System.out.println("newtrial");
        
        Cypher word = new Cypher("The quick brown fox jumps over the lazy dog");
        word.encrypt();
        System.out.println("");
        
        Decipher text = new Decipher("Uif!rvjdl!cspxo!gpy!kvnqt!pwfs!uif!mb{z!eph!");
        text.decrypt();
        System.out.println("");        
    }
}
