package hello.core.member;

public interface MemberRepository {

    void save(Member member);  //Member 객체를 DB에 저장하는 메서드
    Member findById(Long memberId); //Member 객체를 리턴하는 메서드
}
