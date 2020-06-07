import java.util.function.DoubleToIntFunction;

public class SumOdd {

   public static void main(String[] args) {
       System.out.println(sumOdd(1,100));
       System.out.println(sumOdd(-100,100));
       System.out.println(sumOdd(100,100));
       System.out.println(sumOdd(100,1000));
       System.out.println(sumOdd(13,13));
       System.out.println(isOdd(13));

    }

    public static boolean isOdd(int number) {
        if (number>0 && number % 2 != 0)
        {
            return true;
        }
        else
                {
        return false;
                }
    }

    public static int sumOdd(int start,int end){
        int total=0;
        if(end >= start && (end > 0 && start > 0))
        {
           for(int i = start; i <= end ; i++)
            {
                if(isOdd(i))
                {
                    total = total + i;
                }
            }
            return total;
        }
        else
            {
            return -1;
        }
    }
    }
