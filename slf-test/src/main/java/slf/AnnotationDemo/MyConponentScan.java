package slf.AnnotationDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sulingfeng
 * @title: MyConponentScan
 * @projectName spring
 * @description: TODO
 * @date 2021/10/18 13:37
 */

@Configuration
@ComponentScan("slf.*")
public class MyConponentScan {

	@Configuration
	@ComponentScan("slf.*")
	class innerClass{

	}

}
