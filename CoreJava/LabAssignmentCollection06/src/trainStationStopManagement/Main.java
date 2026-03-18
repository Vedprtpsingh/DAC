package trainStationStopManagement;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StationManagement sm=new StationManagement();
		Station s1=new Station(101,"JamiTavi","01:00");
		Station s2=new Station(102,"Katra","02:00");
		Station s3=new Station(103,"Chandighad","03:09");
		Station s4=new Station(104,"New Delhi","04:30");
		Station s5=new Station(105,"Ghaziabad","06:00");
		Station s6=new Station(106,"Aligadh","08:30");
		Station s7=new Station(107,"Kanpur","10:00");
		Station s8=new Station(108,"Prayagraj","11:50");
		Station s9=new Station(109,"Pakistan","00:20");
		Station s10=new Station(110,"Bhilai","13:10");
		sm.addStation(s1);
		sm.addStation(s2);
		sm.addStation(s3);
		sm.addStation(s4);
		sm.addStation(s5);
		sm.addStation(s6);
		sm.addStation(s7);
		sm.addStation(s8);
		sm.displayStations();
		System.out.println("---------------Add Station at first:--------------- ");
		sm.addStationatBeginning(s9);
		
		sm.displayStations();
		System.out.println("---------------Add Station at Last:--------------- ");
		
		sm.addStationatEnd(s10);
		sm.displayStations();
		System.out.println("---------------Remove Station:--------------- ");
		sm.removeStation(106);
		sm.displayStations();
	}
}
