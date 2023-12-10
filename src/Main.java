import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exchange value of variable a & b
        int a=10;
        int b=11;
        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("value b:"+b +"value a" +a);
        //addition of 2 numbers
        int s1=10;
        int s2=11;
        int sum=s1+s2;
        //Subtraction of 2 numbers
        int sub=s1-s2;
        System.out.println("Addition of two no :" +sum +"Substraction of two no :" +sub);

        //java code to print number positions at ones,tens,hundreds,thousands,ten thousands
        int num =  23456;
        int ones = num%10;
        System.out.println("numbers in the ones : " +ones);
        num = num/10;
        int tens = num%10;
        System.out.println("numbers in the tens : " +tens);
        num = num/10;
        int hundreds = num%10;
        System.out.println("numbers in the hundreds : " +hundreds);
        num = num/10;
        int thousands = num%10;
        System.out.println("numbers in the thousands : " +thousands);
        num = num/10;
        int ten_thousands = num%10;
        System.out.println("numbers in the ten thousands : " +ten_thousands);

        //swapping two numbers without using third variable
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("num1 is " +num1);
        System.out.println("num2 is " +num2);
        //casting example
        int marks1 = 20;
        int marks2 = 40;
        int marks3 = 50;

        double average = ((double)marks1 + (double)marks2 + (double)marks3)/3;
        System.out.println(average);

        // another example
        char x = 'a';
        int z = (int)x;
        System.out.println(z);



    }
}
