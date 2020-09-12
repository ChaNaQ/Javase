import java.util.Random;

/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/12 9:50 上午
 */
public class Sword  extends  Weapons implements crit {
    public Sword(Integer damage, String name) {
        super(damage, name);
    }  //青缸剑
    @Override
    public Integer crit(role p1) {

        Random random = new Random();
        int i = random.nextInt(4);
        if (i == 0) {
            System.out.println( p1.getName() + " 使用了青缸剑 ，造成暴击 ，效果超群 打出了双倍伤害");
            return p1.getDamage() * 2;
        } else {
            return p1.getDamage();
        }

//百分之20几率造成暴击

    }
}
