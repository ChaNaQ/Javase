import java.util.Arrays;

public class Byte {
    public static void main(String[] args) {
        byte [] by = {65,67,68,97,98,101};
        String s ="";
        for (byte a :
                by) {
         s = s + a;
        }
        System.out.println(s);

        char [] sb = {'1','c','h'};
        System.out.println(String.valueOf(sb));

        String s1 = "abcdw";
        String s2 =  "ABCDw";
        String s3 = s1.toUpperCase();
        String s4 = s2.toUpperCase();
        if(s3.equals(s4))
            System.out.println("相等");
        else
            System.out.println("不相等");

        String s5 = "我是你的谁，我是你的剑";   //
        boolean l = s5.contains("剑");
        System.out.println(l);

        System.out.println(s5.startsWith("我"));
        System.out.println(s5.endsWith("剑"));

        String s6 ="";
        String s7 = null;
        System.out.println(s6.isEmpty());
      //  System.out.println(s7.isEmpty());  //报错

        String s8 = "我是你的小宝贝";
        for(int i = 0 ; i < s8.length();i++)
            if(s8.charAt(i) == '我')
                System.out.println(s8.charAt(i));

        System.out.println(s5.indexOf("我"));

        System.out.println(s5.lastIndexOf("你"));

        System.out.println(s5.indexOf("你", 4));

        System.out.println(s5.substring(1, 5));

        String s9 = " 我是你的谁， 我是你的剑  ";

        System.out.println(s9.trim());

        System.out.println(s5.replace("谁", "被子"));

        System.out.println(s5.replaceAll("你", "哈"));

        String s10 = "avabc";
        String s11 = "avab";
        System.out.println(s10.compareTo(s11));
    }
    void string(byte[] by,int head, int tail){
        String s = "";
        for(int i = head ; i < tail ; i++){
            s = s + by[i];
        }
        System.out.println(s);
    }


}