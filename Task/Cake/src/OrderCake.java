
/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/10 5:00 下午
 */
public  class OrderCake extends Cake {
    private   Integer weightlnKG;
    public OrderCake(Integer price, Integer weight) {
        super(price, weight);
    }

    @Override
    public Integer CakePrice() {
        return getPrice() * getWeight();
    }

    public Integer priceCake(){
        return  getPrice()*getWeight();
    }
}
