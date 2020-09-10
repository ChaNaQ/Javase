public class StringBuffer {
    String str ="";

    StringBuffer(){
    }

    StringBuffer(String str){
        this.str = str ;
    }

    void append(char str){
       this.str += str;
    }
    void append(String str){
        this.str = str;
    }
    public String toString(){
        return this.str;
    }
    void clear(){
        this.str = "";
    }
    String reverse(){
        char[] chars = this.str.toCharArray();
        int tail = chars.length-1;
        int head = 0;
        while(head < tail){
            char temp = chars[head];
            chars[head] = chars[tail];
            chars[tail] = temp ;
            head++;
            tail--;
        }
        return  new String(chars);
    }
    String reverse(int from , int to){
        String head = this.str.substring(0, from);
        String mid = this.str.substring(from, to);
        String tail = this.str.substring(to, this.str.length());
        StringBuffer stringBuffer = new StringBuffer(mid);
        mid = stringBuffer.reverse();
        return head + mid + tail ;
    }
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcert");
        stringBuffer.append('1');
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.reverse(1, 4));
    }


}
