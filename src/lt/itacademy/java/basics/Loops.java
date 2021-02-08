package lt.itacademy.java.basics;

public class Loops {
    public static void main(String[] args){
        //8 uzdavinys
        timeCount(365);

        //9 uzdavinys
        anotherTimeCount(365);

        //10 uzdavinys
        countingFactorial(5);
    }

    //8 uzdavinys
    public static void timeCount(int days){
        int minutes = 0;
        int hours = 0;
        for (int i = 0; i < days; i++){
            minutes += 1440;
            hours += 24;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    //9 uzdavinys
    public static void anotherTimeCount(int days){
        int minutes = 0;
        int hours = 0;
        int y = 0;
        while(y < days){
            minutes += 1440;
            hours += 24;
            y++;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    //10 uzdavinys
    public static void countingFactorial(int count){
        int factorial = 1;
        for(int i = 1; i <= count; i++){
            factorial *= i;
        }
        System.out.println("Factorial of number " + count + " is " + factorial + ".");

    }

}
