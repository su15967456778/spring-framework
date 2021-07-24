package slf;

/**
 * @author sulingfeng
 * @title: B
 * @projectName demo
 * @description: TODO
 * @date 2021/7/5 14:41
 */
public class B {

    private A a;

    public B() {
        System.out.println("B 创建了");
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
