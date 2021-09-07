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

    public void init(){
		System.out.println("执行init()");
	}

	public void destroy(){
		System.out.println("执行destroy()");
	}

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
