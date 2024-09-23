package string;

public class CharacterReplacer
{
    public static void main(String[] args)
    {
        char newLetter = 'h';
        char oldLetter = 's';

        String name = new String("sorayaaitsaidi");
        String result = name.replace(oldLetter, newLetter);
        System.out.println("the replacement of character with another character is " + result);

    }
}
