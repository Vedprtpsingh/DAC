package javaCityApp;

public class CityController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c1=new Citizen("Ved", 23, 777, "Ved123");
		c1.showCitizen();
		Citizen c=new Citizen("Ved", 23, 777, "Ved123");
		c.showCitizen();
		Citizen c5=new Citizen("Ved", 23, 777, "Ved123");
		c5.showCitizen();
		c1.setAge(2);
		c1.showCitizen();
		System.out.println(c1.changePassword("Ved1253", "new"));
		
		
		Vehicles v=new Vehicles(12, 2);
		v.soundHorn();
		v.move();
		
		
		ShopingMall mall =new ShopingMall("MG Road");
        TinyHouse house = new TinyHouse();
        mall.consumeEnergy(10000);
        house.consumeEnergy(200);
        

        
        
		Animal[] animal=new Animal[4];
		animal[0]=new Dog();
		animal[1]=new Dog();
		animal[2]=new Cat();
		animal[3]=new Cat();
		for(Animal a:animal) {
			a.makeSound();
		}
		
		
		
        SmartRoom room = new SmartRoom(new Speaker(), new LightBulb());

        room.pressWallSwitch();
        room.pressWallSwitch();

        room.partyMode();
		
	}
}
