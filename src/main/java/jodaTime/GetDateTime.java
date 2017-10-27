package jodaTime;

import org.joda.time.DateTime;

/**
 * @author simple_huang@foxmail.com on 2017/10/12.
 */
public class GetDateTime {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.minusDays(3).getDayOfWeek());
    }
}
