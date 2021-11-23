/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 */
import java.util.*;
public class CodeTestPanduanrizi {
    public static void main(String[] args){
    int year,month,day;//定义年月日
    int days=0;//每个月多少天。
    int d=0;
    int e;
    Scanner input=new Scanner(System.in);//Scanner输入方法。
    do{
        e=0;
        System.out.print("输入年:" );
        year=input.nextInt();
        System.out.print("输入月:" );
        month=input.nextInt();
        System.out.print("输入日:" );
        day=input.nextInt();
        //输入年月日，下面if判断是否输入错误。
        if (year<0||month<0||month>12||day<0||day>31){
            System.out.println("输入错误，请重新输入!");
            e=1;
        }
    }while (e==1);//用while循环直到输入正确为止。
    for (int i=1;i<month;i++){//for循环将各月天数相加赋值给d。i不能等于输入的月份。不然会多加一个月。
        switch (i){//swith和case判定大月小月和二月，相加的天数不一样
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;//这是大月的
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                if ((year % 400==0)||(year % 4==0&&year % 100==0)){//判定闰年二月天数。
                    days=29;
            }else {
                    days=28;
                }
                break;//跳出case输出days
        }
        d+=days;// d等于d+days，赋值循环。
    }
    System.out.println(year+"-"+month+"-"+day+"是这一年的第"+(d+day)+"天");
    }
}