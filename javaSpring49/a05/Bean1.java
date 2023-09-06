package a05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

public class Bean1 {
}


@Component
@Slf4j
public class Bean2 {

    public Bean2(){
        log.debug("我被Spring管理了...");
    }
}


@Mapper
public interface Mapper1 {
}

@Mapper
public interface Mapper2 {
}

@Configuration
@ComponentScan("com.atguigu.boot.a05.component")
public class Config {

    @Bean
    public Bean1 bean1(){
        return new Bean1();
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean(initMethod = "init")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        return dataSource;
    }
}