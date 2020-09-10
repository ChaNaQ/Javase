import java.util.ArrayList;

/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/9 11:22 上午
 */
public class Test {
    public static void  game1( ) {
        User user = new User("CC");
        Computer j = new Computer("甲");
        while (true){
            String renJi = j.play();
            String wanJia = user.play();
            if(renJi.equals("石头") && wanJia.equals("布")){
                System.out.println( "人机选择 " + renJi + " 玩家胜出");
                break;
            }
            else if(renJi.equals("石头") && wanJia.equals("剪刀")){
                System.out.println("人机选择 " + renJi + " 人机胜出");
                break;
            }
            else if (renJi.equals("剪刀") && wanJia.equals("布")){
                System.out.println("人机选择 " + renJi + " 人机胜出");
                break;
            }
            else if (renJi.equals("剪刀") && wanJia.equals("石头")){
                System.out.println("人机选择 " + renJi + " 玩家胜出");
                break;
            }
            else if (renJi.equals("布") && wanJia.equals("石头")){
                System.out.println("人机选择 " + renJi + " 人机胜出");
                break;
            }
            else if (renJi.equals("布") && wanJia.equals("剪刀")){
                System.out.println("人机选择 " + renJi + " 玩家胜出");
                break;
            }
            else
                System.out.println("人机选择 " + renJi + " 打平！");
        }


    }
}
