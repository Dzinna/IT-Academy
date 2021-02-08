package lt.itacademy.java.basics;

//4 uzduotis
public class Arithmetics {
    public static void main(String[] args) {
        System.out.println("Kubo perimetras: " + perimeterFunction(5) + "cm");
        System.out.println("Kubo turis: " + volumeFunction(5) + "cm3");

        //5 uzduotis
        float feet = 2.4f;
        float inches = 4f;
        System.out.println(feet + " feet and " + inches + " inches = "+ convertFunction(inches, feet) + "cm");

    }
    public static int perimeterFunction(int x){
        return 12*x;
    }

    public static int volumeFunction(int y){
        return y*y*y;
    }

    //5 uzduotis
    public static float convertFunction(float in, float ft){
        return (ft * 12 + in) * 2.54f;
    }
}
