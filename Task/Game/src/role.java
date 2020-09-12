import java.util.Random;

/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/12 9:04 上午
 */
public class role {
    private String name;    // 角色名称
    private Integer armor;   // 护甲
    private Integer hp;        //生命值
    private Weapons weapons;  // 武器装备
    private Integer damage;  //人物自身攻击力

    public role(String name, Integer armor, Integer hp, Weapons weapons, Integer damage) {
        this.name = name;
        this.armor = armor;
        this.hp = hp;
        this.weapons = weapons;
        this.damage = damage;
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

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Sword weapons) {
        this.weapons = weapons;
    }


    @Override
    public String toString() {
        return "role{" +
                "name='" + name + '\'' +
                ", armor='" + armor + '\'' +
                ", hp=" + hp +
                ", weapons='" + weapons + '\'' +
                '}';
    }

    public void attack( role p) {
        System.out.print(this.getName() + "发动攻击：");
        int v = 0;
        Random random = new Random();
        int i = random.nextInt(5);
        if (i == 0) {   //触发破甲效果
            v = (int) this.weapons.skill1(this, p);  // 破甲效果造成的伤害
        }
        i = random.nextInt(5);
        if (i == 0) { //触发回血效果
            this.weapons.skill2(this, this.getDamage());
        }
        this.setDamage(this.getDamage() + v);
        // ------------------  以上为武器普通效果 ----------------------//

        if (this.getWeapons().getName().equals("青缸剑")) {
            Integer damage = ((Sword) this.getWeapons()).crit(this);// 是否触发青缸剑技能
            //  damage 为 是否 触发青缸剑 后 的伤害   普通 或 翻倍
            boolean dodge = ((Seven_treasure_knife) p.getWeapons()).dodge(p);  // 被攻击者 是否 触发 七星宝刀 技能
            this.setDamage(damage);
            if (dodge == true)
                this.setDamage(0);  // 触发 效果 则 攻击者 伤害 将为 0
        }
//  ---------------------  以上为武器专属效果 --------------------//


        if ( p.getArmor() > (int)(this.getDamage()*0.4) ) {//判断被攻击者 护甲 大于 伤害值
            System.out.println(this.getName() + "最终打出了" + this.getDamage() + "伤害！" +"护甲抵挡" + (int)(this.getDamage() * 0.4) +
                    "造成了" +(int)(this.getDamage() * 0.6) + " 伤害 ");
            p.setHp(p.getHp() - (int) (this.getDamage() * 0.6));
            p.setArmor(p.getArmor() - (int) (this.getDamage() * 0.4));
        }
        else if(p.getArmor() < (int)(this.getDamage()*0.4) ){  // 被攻击者 护甲 小于 伤害值
            System.out.println(this.getName() + "最终打出了" + this.getDamage() + "伤害！" +"护甲抵挡" + (int)(this.getDamage() * 0.4) +
                    "造成了" +(int)(this.getDamage() * 0.6) + " 伤害 ");
            p.setHp(p.getHp() - (int) (this.getDamage() * 0.6));
            p.setArmor(0);
        }
        else if(p.getArmor() == 0){   //被攻击者 护甲 为 0
            System.out.println(this.getName() + "最终打出了" + this.getDamage() +"伤害！");
            p.setHp(p.getHp() - this.getDamage());
        }

    }
}
