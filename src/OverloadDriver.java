public class OverloadDriver {

    public static void main (String[]args){
        //array is a group of data that has the same type
        double [] num=new double[5];

        num [0]=10;
        num [1]=12.0;
        num [2]=13.4;
        num [3]=12.4;
        num [4]=14.4;

        System.out.println(Overload.getSum(num));
        System.out.println(Overload.getSum(5.0,3.0));
        System.out.println(Overload.getSum(4,9));
        System.out.println("your sum is "+Overload.getSum(2,4));

        System.out.println(Overload.getAverage(num));
        System.out.println(Overload.getAverage(5.4,6.2));
        System.out.println(Overload.getAverage(4,5,6));
        System.out.println("your average is "+Overload.getAverage(2,9));

        System.out.println(Overload.getProduct(num));
        System.out.println(Overload.getProduct(5.0,2.0));
        System.out.println(Overload.getProduct(5.2,5.6));
        System.out.println("your product is "+Overload.getProduct(3,3));

        System.out.println(Overload.getFactorial(5));




    }
}
