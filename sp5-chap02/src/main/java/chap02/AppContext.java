package chap02;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//커밋메시지수정
@Configuration
public class AppContext {

    @Bean
    public Greeter greeter(){
        Greeter g = new Greeter();
        g.setFormat("%s, 안녕하세요!");
        return g;
    }
    @Bean
    public Greeter greeter1(){
        Greeter g = new Greeter();
        g.setFormat("안녕, %s님!");
        return g;
    }

}

