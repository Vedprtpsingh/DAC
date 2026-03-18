package javaCityApp;
interface PowerConsumer {
	void consumeEnergy(int watts);
}
abstract class Building{
	String address;
	public Building(String address) {
		this.address = address;
	}
}
class ShopingMall extends Building implements PowerConsumer{
	public ShopingMall(String address) {
		super(address);
	}
	@Override
	public void consumeEnergy(int watts) {
		if(watts >1000) {
			System.out.println( "High usage warning!");
		}
		else {
			System.out.println("Usage still in limits");
		}
	}
}
class TinyHouse implements PowerConsumer{
	@Override
	public void consumeEnergy(int watts) {
		System.out.println("Powering the lights.");
	}
	
}










