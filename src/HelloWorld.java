/*
 * 软件版权: 恒生电子股份有限公司
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println((String) null);
        System.out.println(Double.parseDouble("1"));
        System.out.println(Float.parseFloat("1"));
        System.out.println(Float.parseFloat("12"));

        Map<String, String> map = test1();

        System.out.println(map.get("a").equals("123"));
        System.out.println(map.get("a").getClass());
    }


    public static Map<String, String> test1(){
//        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, String> map = new HashMap<>();
//        map.put("a", "123");
        map.put("b","456");
        return map;
    }
}

