/*
 * 软件版权: 恒生电子股份有限公司
 */

/**
 * 功能说明: 日期相关函数学习
 *
 * @author yangming28071
 */

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateStudy {

    public static void main(String[] args){
        System.out.println(getTodayStr());

    }


    private static String getTodayStr(){
        /**
         *  @author: yangming
         *  @Date: 2019/8/6 9:12
         *  @Description: 获取今天的日期字符串
         */
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");

        return ft.format(dNow);
    }

}




