package com.banyuan;

import java.util.Random;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        int i = demo.randomInt(10, 12);
      //  System.out.println(i);
       // String abf_dfs_af = demo.trim("abf dfs af");
       // System.out.println(abf_dfs_af);
        //  demo.guessNum("2345");
        demo.draw();
    }

    int randomInt(int from, int to) {  //5 - 12
        Random random = new Random();
        int i = random.nextInt(to - from) + from;
        return i;
    }

    String trim(String src) {
        String[] s = src.split(" ");
        for (int i = 0; i < s.length; i++) {
            s[i] = new StringBuffer(s[i]).reverse().toString();
        }
        String des="";
        for (String a :
                s) {
            des = des + a + " ";
        }
        String trim = des.trim();
        return trim;
    }

    void guessNum(String num){ 
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.equals(num)) {
            System.out.println("答案正确");
            return;
        }
        while(next.equals(num)== false) {
            int k = 0,v=0;
            for(int i = 0 ; i < num.length(); i++){
                if(num.charAt(i) == next.charAt(i)){
                    k++;
                }
                    for( int j = 0 ; j < next.length();j++){
                        if(num.charAt(i) == next.charAt(j)){
                            v++;
                            break;
                        }
                    }
                }
            System.out.println("包含正确数字"+v+"个");
            System.out.println( k + "个数字位置正确");
            next = scanner.next();
            }
        System.out.println("答案正确");
             return ;

        }

        void draw() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            String next = scanner.next();
            String l;
            int i;
            while (!next.equals("0")) {
                i = random.nextInt(101);  //随机一个0 - 100 以内的数字
                if (i < 5)    // 5%
                    l = "大吉";
                else if (i >= 5 && i < 15)// 10%
                    l = "中吉";
                else if (i >= 15 && i < 30) // 15%
                    l = "小吉";
                else if (i >= 30 && i < 60)  //30%
                    l = "吉";
                else if (i >= 60 && i < 80)   //20%
                    l = "末吉";
                else if (i >= 80 && i < 95)
                    l = "凶";
                else
                    l = "大凶";
                System.out.println(l);
                next = scanner.next();

            }
            return;
        }
    }