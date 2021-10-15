package slf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author sulingfeng
 * @title: MyBeanFactoryPostProcessor
 * @projectName spring
 * @description: TODO
 * @date 2021/8/3 9:41
 */
public class MyBeanDefinitionRegistryPostProcessor2 implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("postProcessBeanFactory222=========");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		//registry.registerBeanDefinition(); 这里可以增加，但是postProcessor不能增加
		System.out.println("postProcessBeanDefinitionRegistry222=========");
	}
}
