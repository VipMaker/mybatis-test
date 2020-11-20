package log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestLog4j {
    //指定要打印日志的类
    private Logger logger=Logger.getLogger(TestLog4j.class);
    @Test
    public void testLog4j(){
        logger.fatal("致命错误");
        logger.error("程序错误");
        logger.warn("警告");
        logger.info("信息");
        logger.debug("调试");
        logger.trace("跟踪信息");
    }
}
