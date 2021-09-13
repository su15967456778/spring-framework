package slf.aop;

public class MyCaculate {

	public Integer add(Integer i,Integer j){
		return i+j;
	}

	public Integer sub(Integer i,Integer j){
		return i-j;
	}

	public Integer mul(Integer i,Integer j){
		return i*j;
	}

	public Integer div(Integer i,Integer j){
		return i/j;
	}


	public void show(Integer i){
		System.out.println(i);
	}



}
