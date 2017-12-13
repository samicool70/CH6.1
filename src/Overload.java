public class Overload {
    public static double getSum(double first, double second) {
        return first + second;
    }

    public static int getSum(int first, int second) {
        return first + second;
    }

    public static int getSum(int first, int second, int third) {
        return first + second + third;
    }

    public static double getSum(double[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static double getAverage(double first,double second){
        return (first+second)/2;
    }
    public static int getAverage (int first, int second, int third){
        return (first+second+third)/3;
    }
    public static double getAverage(double[]num){
        double sum=0.0;
        for (int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return sum/num.length;
    }
    public static double getProduct(double first, double second){
        return first*second;
    }
    public static int getProduct (int first, int second, int third){
        return first*second*third;
    }
    public static double getProduct(double[]num){
        double product=1.0;
        for (int i=0;i<num.length;i++){
            product=product*num[i];
        }
        return product;
    }
    public static int getFactorial (int first){
        int factorial=1;
        for (int i=1;i<=first;first--){
            factorial=factorial*first;
        }

        return factorial;
    }
}

