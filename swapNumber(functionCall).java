 class SwapNumber{
    
    static void SwapingNumberUsingThirdvariable(int m,int n){
      m=m-n;
      n=m+n;
      m=n-m;
        System.out.println("Value of m is "+m+ "\nvalue of n is "+n);
    }
    public static void main(String args[]){
    int m=9;int n=8;
    SwapingNumberUsingThirdvariable(m,n);    
    }
}