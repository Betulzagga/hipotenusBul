import java.util.Scanner;
public class hipotenusBul {
    public static void main(String[] args) {
        int x,y;
        double z;

        Scanner input = new Scanner(System.in);
        System.out.print("Yatay Kenari Girin :");
        x = input.nextInt();
        System.out.print("Dikey Kenari Girin :");
        y = input.nextInt();
        z = Math.sqrt((x*x) + (y*y));
        System.out.println("Hipotenus:" + z);

        }}
