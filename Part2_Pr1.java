import java.util.Scanner;
//created by Bhautik Vekariya
//ID : 21CE151
public class Part2_Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.println("Enter value of radius: ");
        double radius = sc.nextInt();
        Circle c1 = new Circle(radius);

        System.out.printf("Area is: %.2f" ,c1.getArea());
        System.out.println();
        System.out.printf("Perimeter is: %.2f ", c1.getPerimeter());
    }
}