import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        int num =  sc.nextInt();
        int ones = num%10;
        System.out.println(ones);
        num = num/10;
        int tens = num%10;
        System.out.println(tens);
        num = num/10;
        int hundreds = num%10;
        System.out.println(hundreds);
        num = num/10;
        int thousands = num%10;
        System.out.println(thousands);
        num = num/10;
        int ten_thousands = num%10;
        System.out.println(ten_thousands);

        //swapping two numbers without using third variable

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
        int value;
        value = (int)x;
        System.out.println(value);
        //celcius to farenhit
        int cel = sc.nextInt();
        float celcius = (float)cel;
        float f = (9*celcius)/5+32;
        System.out.println(f);
        //java programe to sum number from 100 to 200 which is divisible by 9
        //write programe to take array elements from user & add it up
        System.out.println("Please enter number of elemnts you want to provide");
        int n = sc.nextInt();
        int [] arr = new arr[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
        }
    }
}
