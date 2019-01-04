package guru.springframework.config;

import guru.springframework.beans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${guru.username}")
    String username;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource dataSource=new FakeDataSource();
        dataSource.setUsername(username);
        return dataSource;
    }
}
