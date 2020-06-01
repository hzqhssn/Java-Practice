
import javafx.scene.control.skin.CellSkinBase;

import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
public class InputCalc{
public static void main(String[]args)
        {
            inputThenPrintSumAndAverage();
        }

    public static void inputThenPrintSumAndAverage(){
        double total = 0;
        ArrayList<Double> li = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            if (sc.hasNextInt()) {
                double value = sc.nextInt();
                li.add(value);
                total += value;

            } else if (li.size() == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                double base =   Math.ceil( total/li.size();
                System.out.println("SUM = " + (int)total + " AVG = " + (int)Math.ceil(base));
                break;
            }
            sc.nextLine();
        }


        sc.close();
    }
}

