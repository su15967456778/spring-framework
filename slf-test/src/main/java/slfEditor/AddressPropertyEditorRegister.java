package slfEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author sulingfeng
 * @title: AddressPropertyEditorRegister
 * @projectName spring
 * @description: TODO
 * @date 2021/7/30 16:07
 */
public class AddressPropertyEditorRegister implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new AddressPropertyEditor());
	}
}