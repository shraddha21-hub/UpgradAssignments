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

        //java code to print number positions at ones,tens,hundreds,thousands
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


    }
}
