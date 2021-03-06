package src;
/*
 * 软件版权: 恒生电子股份有限公司
 */

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class StringStudy {
    public static void main(String[] args) throws IOException {
        /*Java字符串的一个重要特点就是字符串不可变。这种不可变性是通过内部的private final char[]字段，以及没有任何修改char[]的方法实现的。*/

        /*当我们想要比较两个字符串是否相同时，要特别注意，我们实际上是想比较字符串的内容是否相同。必须使用equals()方法而不能用==。
        从表面上看，两个字符串用==和equals()比较可能都为true，但实际上那只是Java编译器在编译期，会自动把所有相同的字符串当作一个
        对象放入常量池，自然s1和s2的引用就是相同的。所以，这种==比较返回true纯属巧合。换一种写法，==比较就会失败。
        并且如果是变量和常量的判断，推荐把常量放在前面，避免出现空指针的问题 如  "1".equals(str)  */

        /*按指定位置进行子字符串的替换*/
        String testStr = "0123456";
        StringBuilder sb = new StringBuilder(testStr);
        System.out.println(sb.replace(2,3,"1"));

         /*字符串中查找特定字符串的个数*/
        System.out.println(countChildStr("{call proc('123', '456', ?, ?)}", "x") + "");
        System.out.println(countChildStr("{call proc('123', '456', ?, ?)}", "123") + "");

        /*是否包含子串*/
        System.out.println("Hello".contains("ll"));

        /*子串最前index*/
        System.out.println("Hello".indexOf("l"));

        /*子串最后index*/
        System.out.println("Hello".lastIndexOf("l"));

        /*是否以子串开头*/
        System.out.println("Hello".startsWith("He"));

        /*是否以子串结尾*/
        System.out.println("Hello".endsWith("lo"));

        /* 提取子串,索引从零开始*/
        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2, 4));
        System.out.println("Hello".subSequence(2, 4));

        /* 使用trim()方法可以移除字符串首尾空白字符。空白字符包括空格，\t，\r，\n：*/
        /* strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除 java8没有*/
        System.out.println("  \tHello\r\n ".trim());
        System.out.println("\u3000Hello\u3000".trim());

        /* 判断是否为空,实际是字符串长度为0*/
        System.out.println("".isEmpty());

        String str = "1YSS_JJ&&2YSS_JJ&&3YSS_JJ";

        /*替换所有字符，replaceAll支持正则表达式，而replace是正常替换所有子串*/
        /*正则表达式参考 https://github.com/ziishaned/learn-regex/blob/master/translations/README-cn.md*/
        System.out.println(str.replaceAll("&&", ","));
        System.out.println(str.replace("&&", ","));
        System.out.println(str);

        /* 忽略大小写替换 加上(?i)即可*/
        System.out.println(str.replaceAll("(?i)yss_jj", "yyy"));

        /* 字符串分割,也是使用正则*/
        String[] strList = "hello world hello ym".split(" ");
        System.out.println(Arrays.toString(strList));

        /* 字符串拼接*/
        System.out.println(String.join("---", strList));

        /* Java的String和char在内存中总是以Unicode编码表示。*/

        /* StringJoiner和String.join对比使用, StringJoiner可以方便指定前缀和后缀*/
        String[] names = {"Bob", "Alice", "Grace"};
        System.out.println("Hello " + String.join(",", names) + "!");
        StringJoiner sj = new StringJoiner(",","Hello ", "!");
        for (String name:names){
            sj.add(name);
        }
        System.out.println(sj.toString());

        System.out.println(getQuotedStrs("123,456,789"));

        StringStudy sss = new StringStudy();
        sss.readLines("");
    }



    private static int countChildStr(String str,String strChild) {
         /*字符串中查找特定字符串的个数*/
        int n = 0;              //计数器
        int index;              //指定字符的长度
        index = str.indexOf(strChild);
        while(index != -1) {
            n++;
            index = str.indexOf(strChild,index + 1);
        }
        return n;
    }

    static String getQuotedStrs(String ss) {
        /*  "1,2,3" -> "'1','2','3'"  */
        StringBuilder sb = new StringBuilder();
        String[] parse = ss.split(",");
        for (String s : parse) {
            sb.append("'").append(s).append("'").append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }


    void readLines(String ss) throws IOException {
        ss =
                "2019-09-17 15:51:13.643 [job-0] INFO  JobContainer - \n" +
                "任务启动时刻                    : 2019-09-17 15:51:02\n" +
                "任务结束时刻                    : 2019-09-17 15:51:13\n" +
                "任务总计耗时                    :                 10s\n" +
                "任务平均流量                    :              391B/s\n" +
                "记录写入速度                    :              3rec/s\n" +
                "读出记录总数                    :                  37\n" +
                "读写失败总数                    :                   0\n" +
                "\n" +
                "2019-09-17 15:51:13.667  INFO 18345 --- [           main] c.h.rdc.bdata.datago.base.TaskDataX      : ------------------------  Script - After Task   ------------------------\n" +
                "2019-09-17 15:51:13.668  INFO 18345 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@24fcf36f: startup date [Tue Sep 17 15:50:44 CST 2019]; root of context hierarchy\n" +
                "2019-09-17 15:51:13.670  INFO 18345 --- [       Thread-2] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown\n";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(ss.getBytes(Charset.forName("utf8"))), Charset.forName("utf8")));
        String line;

        Map<String, Object> dataXResultMap = new HashMap<>();

        String[] key = {"任务启动时刻", "任务结束时刻", "任务总计耗时", "任务平均流量",
                "记录写入速度", "读出记录总数", "读写失败总数"};

        while ((line = br.readLine()) != null){
            if (!line.trim().equals("")){
                for (String item:key){
                    if (line.contains(item)){
                        String val = line.split(":")[1].trim();
                        dataXResultMap.put(item, val);
                    }
                }
            }
        }

        if ("0".equals(dataXResultMap.get("读写失败总数"))){
            System.out.println("转换成功");
        }

    }

}

