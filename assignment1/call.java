/*
Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false 
answerCell(true, false, false) → false
*/
import java.util.Scanner;
public class callprgm
{
    static boolean phonecall(boolean mrng,boolean momcall,boolean sleep)
    {
        if(sleep)
            return false;
        else
        {
            if((mrng==true && momcall==true)||mrng==false)
                return true;
            else
                return false;
        }
    }
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("call is on morning enter true else false");
         boolean mrng=sc.nextBoolean();
         System.out.println("call is form mom enter true else false");
         boolean momcall=sc.nextBoolean();
         System.out.println("if you sleep enter true else false");
         boolean sleep=sc.nextBoolean();
         System.out.println(phonecall(mrng,momcall,sleep));
	}
}
/*
output

call is on morning enter true else false
false
call is form mom enter true else false
false
if you sleep enter true else false
true
false


//answerCell(false, false, false) → true
call is on morning enter true else false
false
call is form mom enter true else false
false
if you sleep enter true else false
false
true


//answerCell(false, false, true) → false
call is on morning enter true else false
false
call is form mom enter true else false
false
if you sleep enter true else false
true
false

//answerCell(true, false, false) → false
call is on morning enter true else false
true
call is form mom enter true else false
false
if you sleep enter true else false
false
false

*/
