package com.meituan.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//https://blog.csdn.net/qq_34178764/article/details/103508776
@Configuration
    @Primary //在同样的DataSource中，首先使用被标注的DataSource
    public class DataSourceConfig {
//    private Logger log = LoggerFactory.getLogger(DataSourceConfig.class);

        @Value("${spring.datasource.url}")
        //jdbc:mysql://127.0.0.1:3306/insight?useUnicode=true&characterEncoding=utf8&failOverReadOnly=false&allowMultiQueries=true
        private String datasourceUrl;
        @Value("${spring.datasource.driver-class-name}")
        private String driverClassName;
        @Value("${spring.datasource.username}")
        private String username;
        @Value("${spring.datasource.password}")
        private String password;

}
