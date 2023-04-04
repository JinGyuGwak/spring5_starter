package hello.core;

import hello.core.discount.RateDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
//        v1 -> 구현체에 의존해야함
//        OrderService orderService1 = new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());

//        v2 -> 스프링 적용 전 의존성 주입
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();


//        v3
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService",MemberService.class);
        OrderService orderService = ac.getBean("orderService",OrderService.class);

        Long memberId=1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
