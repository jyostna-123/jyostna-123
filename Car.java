package week1.day1;

public class Car {
public void driveCar() {
System.out.println("Drive Toyota car");	
}
public void applyBrake() {
	System.out.println("apply brake when high speed");
}
public void soundHorn() {
System.out.println("Sound press horn");	
}
public void isPuncture() {
	System.out.println("tyre puncture");
}
public static void main(String[] args) {
	Car sample =new Car();
	sample.driveCar();
	sample.applyBrake();
	sample.soundHorn();
	sample.isPuncture();
}
}



