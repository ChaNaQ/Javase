import java.util.Random;

/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/12 9:39 上午
 */
public class Seven_treasure_knife extends  Weapons implements  dodge{
    public Seven_treasure_knife(Integer damage, String name) {
        super(damage, name);
    }

    @Override
    public boolean dodge(role p) {
        Random random = new Random();
        Integer i =random.nextInt(4);
        if( i == 0) {
            System.out.println( p.getName() +"使用了七星宝刀成功的闪避了敌人的操作，太秀了！！");
            return true;

        }else
            return false;
    }  // 七星宝刀

    // 武器自带25%闪避效果








}
