public class Test02 {
    public static void main(String[] args){
        Integer i1=100;
        Integer i2=100;
        System.out.println(i1==i2);

        Integer i3=128;
        Integer i4=128;//integer是-128到127的，超过128将会生成一个新的integer对象
        //所以i3和i4是不相等的。
        System.out.println(i3==i4);
    }
}
