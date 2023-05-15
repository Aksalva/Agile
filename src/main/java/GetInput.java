import java.util.Scanner;

public class GetInput {
    static Scanner sc = new Scanner(System.in);
    public static String getStringInput(){
        return sc.next();
    }
    public static int getIntegerInput(){
        return sc.nextInt();
    }

    public static double getDoubleInput(){
        return  sc.nextDouble();
    }
}
