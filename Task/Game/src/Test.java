import java.util.Random;

/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/12 10:05 上午
 */
public class Test {

    public static void main(String[] args) {
        Weapons sword = new Sword(100,"青缸剑"); //打造了一把青缸剑
        Weapons seven_treasure_knife = new Seven_treasure_knife(80,"七星宝刀");

        role CC = new role("曹操",500,1000,sword , 50);
        role LB = new role("刘备",700,1200,seven_treasure_knife,80);
        System.out.println("游戏开始");
        Random random = new Random();
        while(CC.getHp() >0) {
            CC.setDamage(random.nextInt(50) + 50);  // 曹操的普通攻击 在 50-100 之间浮动
            CC.attack(LB);
            if (LB.getHp() > 0) {
                LB.setDamage(random.nextInt(80) + 50);
                LB.attack(CC);
                System.out.println("回合结束");
                System.out.println(CC.getName() + " 剩余血量" + CC.getHp() + "  剩余护甲：" + CC.getArmor());
                System.out.println(LB.getName() + " 剩余血量" + LB.getHp() + "  剩余护甲：" + LB.getArmor());
                System.out.println();
                System.out.println();

            }
            else
                break;
        }
        if(CC.getHp() >  0 ){
            System.out.println(CC.getName() + "战胜了" + LB.getName());
            System.out.println( CC.getName()+ "当前状态:" + CC.getHp() + " 护甲值：" + CC.getArmor());
        }
        else{
            System.out.println(LB.getName() + "战胜了" + CC.getName());
            System.out.println(LB.getName()+ "当前状态:" + LB.getHp() + " 护甲值：" + LB.getArmor());

        }
    }
}
