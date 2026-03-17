package computerandProcessor;
class Processor{
	String processorName,speed;
}
class Computer {
	String brand, model;
	Processor pro;
	public Computer(String brand, String model, Processor pro) {
		super();
		this.brand = brand;
		this.model = model;
		this.pro = pro;
	}

	void computerDatils() {
		System.out.println("CBrand: "+brand+", CModel: "+", Processor Name: "+pro.processorName+", Processor Speed: "+pro.speed);
	}
}
public class Main {
	public static void main(String[] args) {
		Processor p=new Processor();
		p.processorName="G25";
		p.speed="3.2GH";
		Computer c=new Computer("Lenovo","Idea3",p);
		c.computerDatils();
	}

}
