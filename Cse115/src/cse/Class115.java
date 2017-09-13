package cse;

public class Class115 {
	//reminder: tell brandon you can run methods other than main as first only on special occasions
	public static void main(String[] args) {
		System.out.println(asd(2));
		System.out.println("The mighty Niagara" + "6" + "million cubic feet every " + "minute");
		System.out.println("The mighty Niagara spills " + "6" + " million cubic feet every " + "minute" + ".");
		begin();
	}
	
	private static int asd(int i) {
		return (i-3)*2;
	}
	
	public static void begin() {
		int x;
		x = 5;
		int y = 3 +(x+1);
		String name;
		name = "Sally";
		int total = totalCost(x,y);
//		System.out.println(totalCost(2,3));
//		System.out.println(total);
//		System.out.println(name + " has $" + totalCost(x,y));
		boolean z;
		z = true;
		System.out.println(z);
	}
	
	private static int totalCost(int howMany, int unitCost) {
		return howMany*unitCost;
	}
}