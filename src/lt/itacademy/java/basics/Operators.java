package lt.itacademy.java.basics;

public class Operators {
    public static void main(String[] args){
        //6 uzduotis
        isTriangleEquilateral(8,8,8);

        //7 uzduotis
        carDestination(100,2,4,1.25f);

    }

    //6 uzduotis
    public static void isTriangleEquilateral(int s1, int s2, int s3){
        if(s1 == s2 && s2 == s3){
            System.out.println("Triangle is Equilateral. Sides: " + s1 + " " + s2 + " " + s3);
        } else {
            System.out.println("Triangle is Not Equilateral. Sides: " + s1 + " " + s2 + " " + s3);
        }
    }

    //7 uzduotis
    public static void carDestination(int distance, int fuel, int fuelUsage, float fuelPrice){
        double howFuelNeed = fuelUsage * 0.01 * distance;
        double fuelLeft;
        double cost;

        if(howFuelNeed <= fuel ){
            fuelLeft = fuel - howFuelNeed;
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. " +
                               "It will have " + fuelLeft + " liters of fuel left.");
        }else {
            fuelLeft = howFuelNeed - fuel;
            cost = fuelLeft * fuelPrice;
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. " +
                               "It needs " + fuelLeft + " liter of fuel more. It will cost " + cost + ".");
        }



    }

}
