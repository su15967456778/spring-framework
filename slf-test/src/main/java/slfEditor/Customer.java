package slfEditor;

/**
 * @author sulingfeng
 * @title: Cuatomer
 * @projectName spring
 * @description: TODO
 * @date 2021/7/30 16:03
 */
public class Customer {

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
