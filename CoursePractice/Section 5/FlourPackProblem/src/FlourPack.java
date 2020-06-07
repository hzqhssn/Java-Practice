public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {


        int total = bigCount*5 + smallCount;

        if (total<goal || (bigCount<0 || smallCount<0 || goal<0))
        {
            return false;
        }
        else
        {
            total = (goal/5);
            return (total*5+smallCount>=goal);

        }

    }
}
