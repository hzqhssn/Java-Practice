public class FirstAndLast {
    public static void main(String[] args) {
        sumFirstAndLastDigit(101);
    }
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while(number > 9){
            number = number / 10;

        }
        System.out.println(number+lastDigit);
        return number+lastDigit;
    }

}
