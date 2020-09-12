/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/12 9:11 上午
 */
public class Weapons {   // 武器类

private  Integer  damage; // 攻击力

private  String name ;  //武器名字

    public Weapons(Integer damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public  double skill1(role p1 , role  p2){   // 技能1 ： 武器造成破甲效果 ，造成伤害  护甲承受百分之50  自身承受百分之50
    double damage = 300 ;
    if( p2.getArmor() <= 500){
        System.out.println(p2.getName()+" 护甲过低 ，造成破甲真伤!!");
        return damage;
    }
    else
    {
        damage = damage * 0.5;
        System.out.println(p1.getName() + "打出了破甲伤害 ！");
        return damage;
    }

}
public  void skill2(role p1 ,double damage ){   //技能2 ： 武器吸血效果  获得造成伤害的20% 转化为自身生命值
    p1.setHp(p1.getHp() + (int)(damage * 0.2));
    System.out.println(  p1.getName() +"  吸血效果触发!! 恢复自身"+(int)(damage*0.2) +"生命值!!" );
}

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
