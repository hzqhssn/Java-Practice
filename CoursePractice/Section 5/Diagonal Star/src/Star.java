public class Star {
    public static void main(String[] args) {
        printSquareStar(5);
    }
    public static void printSquareStar(int a)
    {

        if(a < 5){
            System.out.println("Invalid value");

        }
        else
        {
            for (int i = 0; i < a; i++)
            {

                for (int j = 0; j < a; j++)
                {
                    if (i == 0 || j == 0 || i == j|| i == a - 1 || j == a - 1 || i + j == a - 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } }
    }
}
