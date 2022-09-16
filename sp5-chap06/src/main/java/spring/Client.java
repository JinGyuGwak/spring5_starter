package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {
    private String host;

    public void setHost(String host){
        this.host=host;
    }
    @Override
    public void afterPropertiesSet() throws Exception{ //InitializingBean 구현해야함
        System.out.println("Client.afterPropertiesSet() 실행");
    }
    public void send(){
        System.out.println("Client.send() to " + host);
    }
    @Override
    public void destroy() throws Exception { //DisposableBean 구현해야함
        System.out.println("Client.destroy() 실행");
    }
}
