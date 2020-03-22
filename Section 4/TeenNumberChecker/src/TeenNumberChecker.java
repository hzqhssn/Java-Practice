public class TeenNumberChecker {

    public static boolean hasTeen (int a, int b, int c) {
        if (!(a > 12 && a < 20)) {
            if (!(b > 12 && b < 20)) {
                if (!(c > 12 && c < 20)) {

                    return false;
                }else {
                    return true;
                }
            }else {
                return true;
            }
        } else {
            return true;
        }


    }

    public static boolean isTeen(int a)
    {
        if (a > 12 && a < 20)
        {
           return true;
        }else
            {
                return false;
            }
    }

}


