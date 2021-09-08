package slf.supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import slf.A;

/**
 * @author sulingfeng
 * @title: SupplierBeanFactoryPostProcessor
 * @projectName spring
 * @description: TODO
 * @date 2021/9/7 9:27
 */
public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("a");
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanDefinition;
		genericBeanDefinition.setInstanceSupplier(ASupplier::createA);
		genericBeanDefinition.setBeanClass(A.class);
	}
}
