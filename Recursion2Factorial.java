public class Recursion2Factorial {

   public static int calFact(int n) {
       if(n == 1 || n ==0){
           return 1;
       }
       int fact= calFact(n-1);
       int fact2= n*fact;
       return fact2;


   }
    public static void main(String[] args) {
        int n=10;
        int sum=calFact(n);
        System.out.println(sum);

    }
}
