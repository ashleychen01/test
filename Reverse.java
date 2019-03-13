
/**
 * A guess the password program.
 *
 * @author Ashley
 * @version 11/20/18
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "HURKYDURK";
    public static void main(String [] args)
    {
        if (args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Revverse <arguments>");
            return;
        }
        if (args[0].equals(SECRET_PASSWORD))
        {
            System.out.println("You win!!!!! Congratulation!!!!!!");
        }
        else
        {
            System.out.println("Boo! you are WRONg! Try again :)");
        }
    }
    


}
