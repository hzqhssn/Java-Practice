public class LargePrime {
    public static void main(String[] args) {
        System.out.println( largestPrimeFactor(21));
        System.out.println( largestPrimeFactor(217));
        System.out.println( largestPrimeFactor(0));
        System.out.println( largestPrimeFactor(2));

    }

    public static int largestPrimeFactor(int number) {
        int largest = -1;

        if(number<2)
            return largest;

        for (largest = 2; largest <= number; largest++) {
            if (number % largest == 0) {
                number /= largest;
                largest--;
            }
        }

        return largest;
    }
}
