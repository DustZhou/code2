/**
 * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class CodeTestShixianhua {
    public static void main(String[] args){
        int a,b,c;
        int count=0;
        for (int i=101;i<1000;i++){
            a=i%10;//除以10的余数，也就是个位上的数。
            b=i/10%10;//先除以10得到一个整数，再用这个整数除以10得余数，此时得到的为十位上的数。
            c=i/100;//除以100得百位上的数。
            if (a*a*a+b*b*b+c*c*c==i){//判断是否为水仙花数。
                count++;
                System.out.println(i+"是水仙花数");

            }
        }
        System.out.println(count);
    }
}
