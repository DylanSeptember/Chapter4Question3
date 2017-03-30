package chapter4.quetion3;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 3/30/2017.
 */
public class AppConfig {

    @Bean(name = "eat1")
    public Eat getCowEat()
    {
        return new Cow();
    }
}
