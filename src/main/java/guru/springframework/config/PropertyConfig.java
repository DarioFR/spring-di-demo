package guru.springframework.config;

import guru.springframework.beans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

    @Value("${guru.username}")
    String username;

    @Autowired
    Environment env;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource dataSource=new FakeDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(env.getProperty("JAVA_HOME"));
        return dataSource;
    }
}
