import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class DataTypes {
    public static void main(String[] args) {
        // Print Int Datatype to Console
        int myFirstNumber = 1;
        int mySecondNumber = 2;
        int myThirdNumber = 3;

        System.out.println("First Number: " + myFirstNumber);
        System.out.println("Second Number: " + myFirstNumber);
        System.out.println("Third Number: " + myThirdNumber +"\n");
        System.out.println("All Numbers: " + myFirstNumber + ", " + mySecondNumber + "," + myThirdNumber);

        int myValue = 1000;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Min Value: " + maxValue + ", " + "Max Value: " + maxValue +"\n");

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest +"\n");


        //Print Byte Datatype to Console
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte:" + minByteValue + "," + "Max Byte:" + maxByteValue +"\n");

        //Print Short Datatype to Console
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short:" + minShortValue + "," + "Max Short:" + maxShortValue +"\n");

        //Print Long Datatype to Console
        long myLongValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Value: " + myLongValue);
        System.out.println("Min Long:" + minLongValue + "," + "Max Long:" + maxLongValue +"\n");


        //Print Float Datatype to Console
        float myFloatValue = 1000L;
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Long Float: " + myFloatValue);
        System.out.println("Min Float: " + minFloatValue + "," + "Max Long:" + maxFloatValue +"\n");

        //Print String Datatype to Console
        String myFirstString = "A";
        String mySecondString = "B";
        String myThirdString = "C";
        System.out.println("Print my Strings to Console: " + myFirstString + "," + mySecondString + "," + myThirdString);


    }
}
