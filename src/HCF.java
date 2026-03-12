import java.util.*;
public class hcf {
    int lesser;
    hcf(int a,int b){
        if (a<b){
            lesser=a;
        }
        else {
            lesser=b;
        }
        int hcf=0;
        for (int i=1;i<lesser;i++){
            if (a%i==0&&b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);

    }
}
class Mains{
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        hcf obj=new hcf(n,m);
    }
}
