public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        int total = 0;
        if(number <0) {
            return -1;
        }
            while (number != 0){
                int even = number % 10;
                if (even % 2 == 0)
                {
                    total += even;
                }
                number /= 10;
            }
            return total;


    }
}
