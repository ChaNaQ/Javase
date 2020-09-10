/*
请选择难度等级
1. 0~9
2. 0~99
3. 0~999
0. 退出

你当前选择的难度等级0~99
请输入想要猜的次数，0返回上一级
你的输入：

现在开始猜数
剩余次数10，请输入数字（0~999）：5
输入的是5，没有猜中，猜小了

剩余次数9，请输入数字：50
输入的是50，没有猜中，猜大了

剩余次数8，请输入数字：30
输入的是30，恭喜你，猜中了

是否继续，1.继续, 0. 退出

猜题记录

第1次 50 => -30
第2次 70 => -10
第3次 90 => +10
第4次 80 => 正确
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random random = new Random();
        String[] s = {"9", "99", "999"};
        while (true) {
            System.out.println("请选择难度等级：");
            System.out.println("1. 0-9");
            System.out.println("2. 0-99");
            System.out.println("3. 0-999");
            System.out.println("0. 退出");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            if (k == 0)
                return;
            int result = random.nextInt(Integer.parseInt(s[k - 1]) + 1);
            System.out.println("你当前选择的难度等级为 0-" + s[k - 1]);
            System.out.println("请输入你想要猜的次数，0返回上一级");
            int i = scanner.nextInt();
            int[] ints = new int[i];
            Arrays.fill(ints,-1);
            if (i == 0)
                continue;
            else {
                System.out.println("开始猜数");
                int l = 0;
                while (i != 0) {
                    System.out.println("剩余次数" + i + "，请输入数字（ 0 - " + s[k - 1] + ")");
                    int g = scanner.nextInt();
                    ints[l++] = g;
                    if (g == result) {
                        System.out.println("输入的是" + g + ",恭喜你，猜对了！");
                        break;
                    }
                    else {
                        i--;
                        if (g > result)
                            System.out.println("输入的是" + g + " 大了，剩余次数 " + i);
                        else
                            System.out.println("输入的是" + g + "小了，剩余次数" + i);
                    }
                }
                if(i == 0)
                System.out.println("游戏失败");
                System.out.println("是否继续 1  继续   0   退出");
                int i1 = scanner.nextInt();
                if (i1 == 0) {
                    {
                        System.out.println("-----猜题记录----");
                        for (int j = 1; j < l+1; j++)
                            System.out.println("第" + j  + "次  " + ints[j - 1] + " -->" +
                                    ((ints[j - 1] - result) == 0 ? "正确" :(ints[j - 1] - result)));
                    }
                    return;
                }
            }
        }
    }
}
