import java.util.*;

public class BinarytoDecimal {
    public static int bintodec(int n){
        int binary_number = n;
        System.out.println("Your entered Binary Number is : " + binary_number );
        int decimal = 0;
        int power = 0;
        if (binary_number == 0 ){
            return decimal;
        }
        
        while ( binary_number > 0 ){
            int last_digit = binary_number % 10;

            decimal = decimal + (last_digit * (int) Math.pow(2, power) );
            power++;
            binary_number = binary_number / 10;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number to Convert in Decimal: ");
        int a = sc.nextInt();
        int decimal_number = bintodec(a);
        System.out.println("Decimal Number of Given Binary Number is : " + decimal_number);
    }
}