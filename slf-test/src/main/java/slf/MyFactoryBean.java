package slf;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
