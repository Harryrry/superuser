package com.alibaba.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//扫描我们的mapper文件夹
@MapperScan("com.alibaba.mapper")
@EnableTransactionManagement
@Configuration//配置类
public class MyBatisPlusConfig {




    //注册乐观锁
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }


    //分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /*//逻辑删除
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }*/

}