import java.util.ArrayList;

public class StringList {

 String str = "";

 void addStr(String str){
     this.str += str;
 }
 void addstr(String str,int position){
     String head = this.str.substring(0, position);
     String tail = this.str.substring(position, this.str.length());
     this.str = head + str + tail;
 }
String remove(String str) {
    if(this.str.contains(str)){
        int i = this.str.indexOf(str);
        String head = this.str.substring(0, i);
        String tail = this.str.substring(i + str.length(), this.str.length());
        return  head + tail;
    }
    return this.str;
    }
    void update(String str){
     this.str = str;
    }
    boolean empty(){
     if(this.str.isEmpty() == true)
         return true;
     else
         return false;
    }

}
