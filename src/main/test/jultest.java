import org.apache.log4j.Logger;
import org.junit.Test;

/*import java.util.logging.Level;
import java.util.logging.Logger;*/

public class jultest {

    /*public static void main(String[] args) {
*//*获取日志记录器对象 *//*
        Logger logger=Logger.getLogger("jultest");
        *//*日志记录输出*//*
        logger.info("黑色");
        *//*使用方法进行日志记录 *//*
        logger.log(Level.ALL,"蓝色");
        logger.log(Level.CONFIG,"灰色");
        logger.log(Level.FINE,"黄色");
        logger.log(Level.INFO,"白色");
        *//*警告*//*
        logger.log(Level.WARNING,"绿色");
        *//*严重*//*
        logger.log(Level.SEVERE,"红色");
        logger.log(Level.SEVERE,"用户信息：{1},{0}",new Object[]{"张三","爱美女"});
    }*/
    @Test
    public  void  quicktest(){

        /*获取日志记录器*/
        Logger logger=Logger.getLogger(jultest.class);
        logger.info("张三");
        /*级别默认是debug，因此trace不出现*/
        logger.trace("李四");
        logger.debug("调试");
        logger.error("错误");
        logger.fatal("大错误");
        logger.warn("警告");
    }

}
