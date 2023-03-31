package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        Member member = new Member(1L,"memberA",Grade.VIP);
        Member member1 = new Member(2L,"memberA",Grade.VIP);

        memberService.join(member);
        memberService.join(member1);

        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
