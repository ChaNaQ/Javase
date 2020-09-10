/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/10 11:29 上午
 */
public class CompareTo {


    int compareTo(String str){
        if( this == str )
            return 0;
        int i = 0;
        int len1 = this.length();
        int len2 = str.length();
        int min = len1 > len2 ?  len2 : len1;
        while(i<min){
            if(this.charAt(i) != str.charAt(i))
                return this.charAt(i)-str.charAt(i);
            i++;
        }
        if( len1  == len2 )
            return 0;
        else
            return  abs(len1-len2);
    }
}
