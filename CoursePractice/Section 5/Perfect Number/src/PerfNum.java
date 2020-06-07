import javax.swing.plaf.IconUIResource;

public class PerfNum {
    public static void main(String[] args) {
        System.out.println( isPerfectNumber(6));
    }
   public static boolean isPerfectNumber(int number)
    {
        int count  = 1;
        for (int i = 2; i * i <= number; i++)
        {
            if (number % i==0)
            {
                if(i * i != number)
                {
                    count  = count  + i + number / i;
                }
                else
                {
                    count  = count  + i;
                }
            }
        }
        if (count  == number && number != 1)
        {
            return true;

        }

        return false;
    }
}
