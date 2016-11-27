package Utils;
public class Math{
 public static int factorial(final int n){
    if (n==0){
        return 1;
    }
    return n*factorial(n-1);
    }
 
 public static int factorialLoop(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f *= i;
        }
        return f;
    }
    }
