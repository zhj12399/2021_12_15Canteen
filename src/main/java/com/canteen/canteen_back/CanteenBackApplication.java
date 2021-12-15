package com.canteen.canteen_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.canteen.canteen_back.mapper")
public class CanteenBackApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(CanteenBackApplication.class, args);
    }

}
