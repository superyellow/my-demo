package jodaTime;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author simple_huang@foxmail.com on 2017/10/11.
 */
public class Minus {
    public static void main(String[] args) {
        DateTime dateTime = DateTime.now();
        DateTime thisWeek = dateTime.minusWeeks(0).dayOfWeek().withMinimumValue();
        System.out.println(thisWeek);
    }
}
