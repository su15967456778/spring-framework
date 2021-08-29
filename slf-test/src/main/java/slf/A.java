package slf;

/**
 * @author sulingfeng
 * @title: A
 * @projectName demo
 * @description: TODO
 * @date 2021/7/5 14:41
 */

public class A {

    private B b;

	public A(B b) {
		this.b = b;
	}

	public A() {
        System.out.println("A 创建了");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
