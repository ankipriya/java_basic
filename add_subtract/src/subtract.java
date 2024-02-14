public class subtract {
    int diff;
    void  subtract(int a,int b){
        if (a>b){
            diff=a-b;
        }
        else{
            diff=b-a;
        }
        System.out.println("The difference = "+diff);
    }
}
