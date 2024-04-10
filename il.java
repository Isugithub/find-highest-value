import java.util.Scanner;

public class il {
    public static void main(String[] args) {
        int max;
        System.out.println("Enter first value");


            Scanner x = new Scanner(System.in);
            int y = x.nextInt(),z = x.nextInt();
            //int z = x.nextInt();
            max = y;
            if(max <z){
               max = z;
            }
            System.out.println(max);


    }
}
