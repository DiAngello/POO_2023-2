package application;
import entities.tv_a1;
import entities.tv_c137;
import entities.tv_crystal;

public class programa {
	public static void main(String[] args) {
		tv_a1 tv1 = new tv_a1();
		tv_c137 tv2 = new tv_c137();
		tv_crystal tv3 = new tv_crystal();
		
		tv1.desligar();
		System.out.println(tv1);
		tv2.ligar();
		System.out.println(tv2);
		tv3.desligar();
		System.out.println(tv3);
	}

}
