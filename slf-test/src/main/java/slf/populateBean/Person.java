package slf.populateBean;

import slfEditor.Address;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author sulingfeng
 * @title: Person
 * @projectName spring
 * @description: TODO
 * @date 2021/9/9 9:34
 */
public class Person {

	private int id;

	private String name = "zhangsan";

	private int age;

	private String gender;

	private Address address;

	private String[] hobbies;

	private List<Book> books;

	private Set<Integer> sets;

	private Map<String, Object> maps;

	private Properties properties;

	public Person() {
	}

	public Person(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Set<Integer> getSets() {
		return sets;
	}

	public void setSets(Set<Integer> sets) {
		this.sets = sets;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
