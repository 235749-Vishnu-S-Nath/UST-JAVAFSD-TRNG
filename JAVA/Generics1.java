package Generic;

public class Generics1 {

	public static void main(String[] args) {
		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println("Generic Class returns: "+intObj.getData());
		GenericsClass<String> strObj = new GenericsClass<>("JavaProgrammin");
		System.out.println("Generic Class returns: "+strObj.getData());
	}

}

class GenericsClass<T>{
	private T data;
	GenericsClass(T data){
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}
}