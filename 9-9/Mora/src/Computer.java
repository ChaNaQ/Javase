import java.util.Random;

public class Computer {
private  int win = 1;
private String name ;
 Computer(String name){
     win = 0;
     this.name = name;
 }
 String play(){
     Random random = new Random();
     int i = random.nextInt(3);
     if(i == 0 )
         return "剪刀";
     else if( i ==1)
         return "石头";
     else
         return "布";
 }







}
