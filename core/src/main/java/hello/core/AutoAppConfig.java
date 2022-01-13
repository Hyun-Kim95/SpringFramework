package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(	// @Component 라는 애노테이션을 찾아서 자동으로 스프링 빈으로 등록시켜 줌
		excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)	// 스프링 빈으로 자동등록할 때 제외할 것 지정
)																								// 수동으로 등록하는 애를 자동으로 등록하려 하면 충돌이 생겨서
public class AutoAppConfig {

}
