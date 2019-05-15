import java.io.*;
import java.util.*;
public class TemaModul2 {
    //Exercitiul 1
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 2;
        int RecltangleArea = a * b;
        int RectanglePerimeter = 2*(a+b);
        double HexagonArea = ((3 * Math.sqrt(3) * (c * c)) / 2);
        double HexagonPerimeter = 6 * c;
        System.out.println("Area of Rectangle: " + RecltangleArea);
        System.out.println("Perimeter of Rectangle: " + RectanglePerimeter);
        System.out.println("Area of Hexagon: " + HexagonArea);
        System.out.println("Perimeter of Hexagon: " + HexagonPerimeter);
        System.out.println("********************");

        //Exercitiul 2
        int x1,x2,y1,y2;
        double dis;
        x1=1;y1=1;x2=4;y2=4;
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
        System.out.println("********************");

        //Exercitiul 3
        String s = "string de test";

        char[] ch = new char[s.length()];

        for (int i=(s.length())-1; i >= 0 ; i--){

            ch [i] = s.charAt(i);
            System.out.println(ch[i]);
        }
        System.out.println("********************");

        //Exercitiul 4
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("********************");

        //Exercitiul 5
        String str2 = "Acesta Este Un Test";
        System.out.println("Lower case: " + str2.toLowerCase());
        System.out.println("********************");

        //Exercitiul 6
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz",i);
            }
        }
        System.out.printf("\n");
        System.out.println("********************");

        //Exercitiul 7
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}