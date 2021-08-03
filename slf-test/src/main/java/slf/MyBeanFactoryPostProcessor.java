package slf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author sulingfeng
 * @title: MyBeanFactoryPostProcessor
 * @projectName spring
 * @description: TODO
 * @date 2021/8/3 9:41
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("========================================");
		System.out.println("调用执行 MyBeanFactoryPostProcessor");
	}
}
