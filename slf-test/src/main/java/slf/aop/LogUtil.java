package slf.aop;

import org.aopalliance.intercept.Joinpoint;

public class LogUtil {

	public void before(){
		System.out.println("before!");
	}

	public void around(){
		System.out.println("around!");
	}

	public void after(){
		System.out.println("after!");
	}

	public void afterReturning(Object result){
		System.out.println("afterReturning!");
	}

	public void afterThrowing(Exception e){
		System.out.println("afterThrowing!");
	}

}
