package com.bass.demo.server;


import com.bass.support.BassSupportApplication;
import org.mvnsearch.spring.boot.dubbo.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDubboConfiguration("com.bass.demo.server.dubbo")
@EntityScan({"com.bass.demo.common.model"})
@EnableTransactionManagement
public class BassDemoServerApplication extends BassSupportApplication{
    public static void main(String[] args) {
        SpringApplication.run(BassDemoServerApplication.class, args);
    }

}
