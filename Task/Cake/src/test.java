/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/10 5:09 下午
 */
public class test {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[10];

        for(int i = 0; i < 10; i++){
            if( i % 2 == 0)
            cakes[i] = new ReadyMadeCake(12,5);
            else
                cakes[i] = new OrderCake(100,23);
        }

    }
}
