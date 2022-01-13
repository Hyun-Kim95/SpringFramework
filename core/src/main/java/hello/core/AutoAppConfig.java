package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(	// @Component ��� �ֳ����̼��� ã�Ƽ� �ڵ����� ������ ������ ��Ͻ��� ��
		excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)	// ������ ������ �ڵ������ �� ������ �� ����
)																								// �������� ����ϴ� �ָ� �ڵ����� ����Ϸ� �ϸ� �浹�� ���ܼ�
public class AutoAppConfig {

}
