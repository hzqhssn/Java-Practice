public class MinutesToYearAndDaysCalc {

    public static void main(String[] args)
    {
printYearsAndDays(0);

    }

    public static void printYearsAndDays(long minutes)
    {
        if(minutes >= 0)
        {
            long years = minutes/525600;
            long days = minutes%525600;
            days = days/ 1440;
            System.out.println(minutes +"min = "+ years+ "y and "+days + "d");
        }else { System.out.println("Invalid Value");}
    }
}
