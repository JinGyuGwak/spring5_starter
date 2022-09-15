# 챕터3

ApplicationContext ctx   -> ctx는 이제 비어있는 컨테이너 박스다

ctx = new AnnotationConfigApplicationContext(AppCtx.class);    -> AppCtx에서 정보를 받아옴


의존성 : 한 객체에서 다른 객체 갖다 쓰면 의존성임.

ex)

public class SimpleMovieLister{

	private MovieFinder movieFinder;
  
}
    

의존성 주입
->밑의 예 처럼 생성자를 통해서 객체(의존성)을 외부에서 넣어주면 그게 의존성 주입이다.
(필요한 자원을 외부에서 생성자를 통해 넣어준다)
ex)
<code>
     
     
    public class SimpleMovieLister{
  	  private MovieFinder movieFinder;
	  public SimpleMovieLister(MovieFinder movieFinder){
  
		    this.movieFinder = Objects.requreNonNull(movieFinder);
    }  
}
    
</code>
