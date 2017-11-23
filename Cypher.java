public class Cypher
{
    private String word = "";
    
    public Cypher(String word) {
        this.word = word;
    }
    public int getLength () 
    {
        return word.length();
    }
    public char returnACharacter(int whichCharacter)
    {
        if ((whichCharacter >= 0)&&(whichCharacter < word.length()))
        return word.charAt(whichCharacter);
        else
            return ' ';
    }
    public int returnASCII(char aChar) 
    {
        return (int)aChar;     
    }    
    public void encrypt(){
        int x = getLength();
        int counter = 0;
        String finalStr = "";

        System.out.println("These are your words/symbols in ASCII!");
        
        while (counter < x) 
        {
            int ascii = returnASCII(returnACharacter(counter)) + 1;
                         
            System.out.print(ascii + " ");
            char changedChar = (char) ascii;
            
            finalStr += changedChar;

            counter++;
            }
            System.out.println("");
        System.out.println("Your Encrypted Word is " + finalStr + "!");
        }
    }

