package Enums;

enum Size_using_Return {
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	public String getSize() {
		switch(this) {
		case SMALL:
			return "small";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "XL";
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The size of the pizza is "+Size_using_Return.SMALL.getSize());
	}
}
