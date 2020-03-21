public class BarkingDog {

    public static void main(String[] args)
    {
        System.out.println( shouldWakeUp( true,1  ));
        System.out.println( shouldWakeUp( false,2  ));
        System.out.println( shouldWakeUp( true,8  ));
        System.out.println( shouldWakeUp( true,-1  ));
        System.out.println( shouldWakeUp( true,44  ));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay)
    {  boolean wakeUP = false;
        if(barking)
        {
    if( (hourOfTheDay<8 && hourOfTheDay>=0 )||( hourOfTheDay>22 && hourOfTheDay<24))
    {
        wakeUP = true;
    }
    else if(hourOfTheDay<0 || hourOfTheDay>23)
    {
        wakeUP = false;

    }
        }

            return wakeUP;

    }
}



