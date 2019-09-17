/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

import java.util.logging.Logger;

/**
 * 功能说明:
 *
 * @author yangming28071
 */

/*JDK的Logging定义了7个日志级别，从严重到普通：默认级别是INFO
SEVERE
WARNING
INFO
CONFIG
FINE
FINER
FINEST
因为默认级别是INFO，因此，INFO级别以下的日志，不会被打印出来。使用日志级别的好处在于，调整级别，就可以屏蔽掉很多调试相关的日志输出。
使用Java标准库内置的Logging有以下局限：
Logging系统在JVM启动时读取配置文件并完成初始化，一旦开始运行main()方法，就无法修改配置；
配置不太方便，需要在JVM启动时传递参数-Djava.util.logging.config.file=<config-file-name>。
因此，Java标准库内置的Logging使用并不是非常广泛*/
public class JDKLoggingStudy {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}

