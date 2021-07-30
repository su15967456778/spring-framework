package slfEditor;

import java.beans.PropertyEditorSupport;

/**
 * @author sulingfeng
 * @title: AddressPropertyEditor
 * @projectName spring
 * @description: TODO
 * @date 2021/7/30 16:03
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setTown(s[0]);
		address.setCity(s[1]);
		address.setProvince(s[2]);
		this.setValue(address);
	}
}
