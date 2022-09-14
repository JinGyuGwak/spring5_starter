package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //설정 정보를 이용해서 빈 객체 생성
        AnnotationConfigApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppContext.class);
        //Appcontext클래스를 생성자 파라미터로 전달
        //AnnotationConfigApplicationContext는 AppContext에 정의한@Bean 설정 정보를 읽어와 Greeter 객체를 생성하고 초기화함.

        Greeter g = ctx.getBean("greeter",Greeter.class);
        Greeter g1 = ctx.getBean("greeter1",Greeter.class);

        String msg = g.greet("스프링");
        String msg1 = g1.greet("스프링");
        System.out.println(msg);
        System.out.println(msg1);
        ctx.close();
    }
}
