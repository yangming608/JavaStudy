/*
 * 软件版权: 恒生电子股份有限公司
 */

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class StringStudy {
    public static void main(String[] args){

        // 按指定位置进行子字符串的替换
        String testStr = "0123456";
        StringBuilder sb = new StringBuilder(testStr);
        System.out.println(sb.replace(2,3,"1"));

        // 字符串中查找特定字符串的个数
        System.out.println(countChildStr("{call proc('123', '456', ?, ?)}", "x") +"");
        System.out.println(countChildStr("{call proc('123', '456', ?, ?)}", "123") +"");

        String str = "1YSS_JJ&2YSS_JJ";
        // 替换字符
        System.out.println(str.replaceAll("&", ","));
        System.out.println(str);

    }



    private static int countChildStr(String str,String strChild) {
        // 字符串中查找特定字符串的个数
        int n = 0;              //计数器
        int index;          //指定字符的长度
        index = str.indexOf(strChild);
        while(index != -1) {
            n++;
            index = str.indexOf(strChild,index + 1);
        }
        return n;
    }

}

