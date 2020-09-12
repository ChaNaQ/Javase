/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/10 5:00 下午
 */
public class ReadyMadeCake extends  Cake{
    private  Integer quanlity;

    public ReadyMadeCake(Integer price, Integer quanlity) {
        this.setPrice(price);
        this.setQuanlity(quanlity);
    }
    public Integer getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(Integer quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public Integer CakePrice() {
        return getPrice() * getQuanlity();
    }
}
