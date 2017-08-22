import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author simple_huang@foxmail.com on 2017/8/22.
 */
public class TestTime {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println(Date.from(Instant.now()));
        System.out.println(Instant.now().plus(1, ChronoUnit.HOURS));
    }
}
