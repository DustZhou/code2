/**
 * 判断100---200之间的素数
 */
public class CodeTest1Sushu {
    public static void main(String[] args){
        int count=0;
        for (int i=101;i<200;i+=2){ //i+=2意思为i=i+2，
            boolean flag=true;//定义boolean值循环跳出，下面接收到定义的flag。
            for (int j=2;j<=Math.sqrt(i);j++){ //j<=Math.sqrt(i):是j小于i的平方根。
                if (i%j==0){ //判断是否为素数  注：素数为除了1和它本身，不能被任何数整除的数，又称质数。
                    flag=false;
                    break;
                }
            }
            if (flag=true){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
