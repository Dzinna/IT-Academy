package lt.itacademy.java.basics;

public class Basics {


    public static void main(String[] args) {
	    // 1 uzduotis
        String name = "Gina";
        String surname = "Golubickiene";
        int age = 31;
        System.out.println("Hello I am " + name + " " + surname + " " + age + ". I am attending IT Academy 2021!");

        //2 uzduotis
        boolean state = true;
        byte smallNumber = 0;
        float numberFloat = 2.0f;
        char s1 = 'H';
        char s2 = 'w';
        char s3 = 'r';
        char s4 = 'd';
        int number = 1;
        short biggerNumber = 3110;
        String finalSentence = s1 + Short.toString(biggerNumber) + " " + s2 + smallNumber +
                               s3 + number + s4 +  " " + numberFloat + " " + state;
        System.out.println(finalSentence);

        //3 uzduotis
        firstMethod(5,4);

    }
    //3 uzduotis
    public static void firstMethod(int x,int y){
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y);

        if (x > y){
            System.out.println("Maximal number " + x);
            System.out.println("Minimal number " + y);
        } else {
            System.out.println("Maximal number " + y);
            System.out.println("Minimal number " + x);
        }
    }

}

