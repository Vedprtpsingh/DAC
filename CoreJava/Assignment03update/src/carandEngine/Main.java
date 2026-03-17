package carandEngine;
class Engine{
	String engineNumber, engineType;
}
class Car{
	String carModel, brand;
	Engine eng;
	public Car(String carModel, String brand, Engine eng) {
		this.carModel = carModel;
		this.brand = brand;
		this.eng = eng;
	}
	void displayEng(){
		System.out.println(", ENumber: "+eng.engineNumber+", EType: "+eng.engineType);
	}
	void carDatils() {
		System.out.print("Car Model: "+carModel+", Car Brand: "+brand);
		displayEng();
	}
}
public class Main {
	public static void main(String[] args) {
		Engine eng=new Engine();
		eng.engineNumber="A788767";
		eng.engineType="des";
		Car c=new Car("TS20", "TATA", eng);
		c.carDatils();
		
	}

}
