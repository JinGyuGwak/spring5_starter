package main;

import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.Client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppCtx.class);
        Client client = ctx.getBean(Client.class);
        client.send();
        ctx.close(); // 이 코드가 없으면 컨테이너의 종료 과정이 수행 되지 않음
                     // -> 빈 객체의 소멸이 일어나지 않는다.
    }
}
