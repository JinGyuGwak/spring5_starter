package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PrototypeTest {

    @Test
    void prototypeBeanFind(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Proto.class);
        System.out.println("찾아라 프로토1");
        Proto protoBean1 = ac.getBean(Proto.class);

        System.out.println("찾아라 프로토2");
        Proto protoBean2 = ac.getBean(Proto.class);

        System.out.println("protoBean1 = " + protoBean1);
        System.out.println("protoBean2 = " + protoBean2);
        Assertions.assertThat(protoBean1).isNotSameAs(protoBean2);


    }
    @Scope("prototype")
    static class Proto{
        @PostConstruct
        public void init(){
            System.out.println("프로토.init");
        }
        @PreDestroy
        public void destroy(){
            System.out.println("싱글톤.destroy");
        }


    }
}
