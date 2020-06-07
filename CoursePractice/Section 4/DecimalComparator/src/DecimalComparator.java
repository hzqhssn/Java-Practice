import javafx.scene.control.skin.CellSkinBase;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main(String[] args){
    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        d1 = d1 * 1000;
        d2 = d2 * 1000;

        int i1 = (int) d1;
        int i2 = (int) d2;

        if (i1 == i2) {
            return true;
        } else {
            return false;
        }
    }

    }



