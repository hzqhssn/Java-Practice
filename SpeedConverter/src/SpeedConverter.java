public class SpeedConverter {

    public static void main(String[] args){
printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kiloMetersPerHour){
        long mph = 0;
        if(kiloMetersPerHour>=0){
        mph = Math.round(kiloMetersPerHour/1.609d);
            return mph;}
       return -1;

    }

    public static void printConversion(double kiloMetersPerHour){
        if(kiloMetersPerHour>=0){
        System.out.println(kiloMetersPerHour+" km/h = "+ toMilesPerHour(kiloMetersPerHour)+" mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
}
