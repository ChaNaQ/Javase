import java.util.Scanner;

public class User {
    private  String name ;
    private  int win =  1 ;
    User (){

    }

    public User(String name) {
        this.name = name;
    }

    String play(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的选择： 1  剪刀    2  石头    3  布");
        int i = scanner.nextInt();
        while(i >=1 && i <=3) {
            if (i == 1)
                return "剪刀";
            else if (i == 2)
                return "石头";
            else
                return "布";
        }
        System.out.println("输入错误，重新输入");
        play();
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }
}
