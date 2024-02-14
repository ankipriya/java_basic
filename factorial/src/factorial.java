public class factorial {
    public  static  void main(String[]args){
        int n=9;
        int fac=1;
        if(n>0&&n<=10){
            for(int i=1;i<=n;i++){
                System.out.print(i+"*");
                fac*=i;}
                System.out.print("="+fac);

        }
    }
}
