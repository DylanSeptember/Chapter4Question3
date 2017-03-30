package chapter4.quetion3;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 3/30/2017.
 */
public class AppConfig {

    @Bean(name = "bird1")
    public Bird getChickenBird()
    {
        return new Chicken();
    }
}
