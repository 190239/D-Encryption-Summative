public class Decipher
{
    private String text = "";
    
    public Decipher(String text) {
        this.text = text;
    }
    public int getLength () 
    {
        return text.length();
    }
    public char returnACharacter(int whichCharacter)
    {
        if ((whichCharacter >= 0)&&(whichCharacter < text.length()))
        return text.charAt(whichCharacter);
        else
            return ' ';
    }
    public int returnASCII(char aChar) 
    {
        return (int)aChar;     
    }    
    public void decrypt(){
        int x = getLength();
        int counter = 0;
        String finalStr = "";

        System.out.println("");
        System.out.println("These are your words/symbols in ASCII!");
        
        while (counter < x) 
        {
            int ascii = returnASCII(returnACharacter(counter)) - 1;
                         
            System.out.print(ascii + " ");
            char changedChar = (char) ascii;
            
            finalStr += changedChar;

            counter++;
            }
            System.out.println("");
        System.out.println("Your Decrypted Word is " + finalStr + "!");
        }
    }

