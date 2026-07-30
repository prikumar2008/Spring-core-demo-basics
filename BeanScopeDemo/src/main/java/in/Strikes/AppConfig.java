package in.Strikes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan

public class AppConfig {
//hamesa yad rakhna ki yadi aap ye soch rahe ho ki aap ne scope singleton de rakha hai
//to bhi do bean create ho sakthe hai ya fir jayda bhi ho sakthe hai
    @Bean
    public OrderService getOrder(){
        return new OrderService();
    }
    @Bean
    public OrderService getOrder2(){
        return new OrderService();
    }
}
