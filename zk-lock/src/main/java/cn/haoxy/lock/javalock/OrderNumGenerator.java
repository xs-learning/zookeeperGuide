package cn.haoxy.lock.javalock;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by haoxiaoyong on 2019/8/14 下午 9:55
 * e-mail: hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 * Blog: www.haoxiaoyong.cn
 */
public class OrderNumGenerator {

    //全局订单id;
    public static int count = 0;

    public String getNumber() {

        try {
            //TimeUnit.SECONDS.sleep(2);
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SimpleDateFormat simpt = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        return simpt.format(new Date()) + "-" + ++count;
    }
}
