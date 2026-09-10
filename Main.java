https://www.onlinegdb.com/online_java_compiler#editor_1import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.println("Area: " + area);

        sc.close();
    }
}      