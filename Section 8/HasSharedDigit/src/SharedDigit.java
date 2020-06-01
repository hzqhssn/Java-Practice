public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,99));
    }
    public static boolean hasSharedDigit(int A,int B){
        if((A<10||A>99)||(B<10||B>99)){
            return false;
        }
        int NumB=B;
        while(A>0){
            int numADig=A%10;
            while(B>0){
                int numB=B%10;
                if(numADig==numB){
                    return true;
                }
                B=B/10;
            }
            A=A/10;
            B=NumB;
        }
        return false;
    }
}
