package Generic;

class Test1<T>{
	T obj;
	Test1(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
}

public class UserDefinedGeneric {

	public static void main(String[] args) {
		Test1<Integer> iObj = new Test1<>(15);
		System.out.println(iObj.getObject());
		Test1<String> sObj = new Test1<>("GeeksForGeeks");
		System.out.println(sObj.getObject());
	//	iObj=sObj;
	}

}
