package src;
/*
 * 软件版权: 恒生电子股份有限公司
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明:
 *
 * @author yangming28071
 */

public class ThreadStudy {

    public static void main(String[] args){
        multiThread1();
    }


    private static void doSome(String name, String content) {
        try {
            Thread.sleep(1);
//            System.out.println(String.format("%s-----------------%s", name, content));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void multiThread1(){
            // 测试源
        try{
            List<String> sourceList = new ArrayList<>();
            for (int i = 0;i<10000;i++) {
                sourceList.add("第" + i + "条数据");
            }

            System.out.println("数据条数：" + sourceList.size());
            long a1=System.currentTimeMillis();
            for (int i = 0;i < sourceList.size();i++) doSome("普通for循环", sourceList.get(i));
            long a2=System.currentTimeMillis();
            System.out.println("普通for循环用时：" + (a2-a1));

            long b1=System.currentTimeMillis();
            for (String t:sourceList) doSome("增强for循环", t);
            long b2=System.currentTimeMillis();
            System.out.println("增强for循环用时：" + (b2-b1));

            long c1=System.currentTimeMillis();
            sourceList.forEach((t)-> doSome("forEach循环", t));
            long c2=System.currentTimeMillis();
            System.out.println("forEach循环用时：" + (c2-c1));

            long d1=System.currentTimeMillis();
            sourceList.parallelStream().forEach(t-> {
                doSome("forEach-Stream循环", t);
            });
            long d2=System.currentTimeMillis();
            System.out.println("forEach-Stream循环用时：" + (d2-d1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

