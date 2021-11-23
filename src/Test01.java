public class Test01 {
    public static void main(String[] args){
        String s1=new String("abc");//2个对象
        String s2="abc";
        //s1和s2是不相等的
        System.out.println(s1==s2);//false
        String s3 = s1.intern();//intern寻找常量池中的常量，并返回值s3.
        System.out.println(s2==s3);//true
    }
}