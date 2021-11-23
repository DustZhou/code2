import java.util.Scanner;

public class CodeTestXiaoqiu {
    public static void main(String[] args){
        double h=100;
        double s=100;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入第几次：");
        i=sc.nextInt();
        for (int j=1;j<=i;j++){
            h=h/2;
            s=s+2*h;
        }
        System.out.println("一共路程："+s);
        System.out.println("最后一次多高："+h);
    }
}
// Scanner input =new Scanner(System.in);
//        int numtest=input.nextInt();
//        System.out.println(ver(numtest));