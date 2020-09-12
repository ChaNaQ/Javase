/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/10 5:00 下午
 */
public abstract class Cake {
  private   Integer price;
   private Integer weight;

    public Cake() {
    }

    public Cake(Integer price, Integer weight) {
        this.price = price;
        this.weight = weight;
    }

    public abstract  Integer CakePrice();

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
