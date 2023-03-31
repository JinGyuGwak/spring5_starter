package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price); // 멤버를 넣으면 그 멤버의 할인 가격을 리턴함



}
