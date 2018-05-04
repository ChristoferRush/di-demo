package com.rushedstudio.didemo;

import com.rushedstudio.didemo.controllers.ConstructorInjectedController;
import com.rushedstudio.didemo.controllers.MyController;
import com.rushedstudio.didemo.controllers.PropertyInjectedController;
import com.rushedstudio.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.rushedstudio.didemo")
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
