public class Person {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3, 4, 1.5));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width <= 0|| height <= 0|| areaPerBucket <= 0 || extraBuckets < 0 )
        {
            return -1;
        }
        double totalBuckets = 0;
        double wallArea = width * height;
        System.out.println(wallArea);

        if(areaPerBucket < wallArea)
        {
            totalBuckets = Math.ceil(wallArea/areaPerBucket);
            System.out.println(wallArea + " "+ totalBuckets);
        }
        return (int)totalBuckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width <= 0|| height <= 0|| areaPerBucket <= 0 )
        {
            return -1;
        }
        double totalBuckets = 0;
        double wallArea = width * height;
        System.out.println(wallArea);

        if(areaPerBucket < wallArea)
        {
            totalBuckets = Math.ceil(wallArea/areaPerBucket);
            System.out.println(wallArea + " "+ totalBuckets);
        }
        return (int)totalBuckets ;
    }

    public static int getBucketCount(double wallArea , double areaPerBucket)
    {
        if( wallArea <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        double totalBuckets = 0;

        if(areaPerBucket < wallArea)
        {
            totalBuckets = Math.ceil(wallArea/areaPerBucket);
            System.out.println(wallArea + " "+ totalBuckets);
        }
        return (int)totalBuckets ;
    }
}
