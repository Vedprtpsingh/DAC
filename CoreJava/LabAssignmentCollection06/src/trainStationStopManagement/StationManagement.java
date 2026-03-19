package trainStationStopManagement;

import java.util.LinkedList;

public class StationManagement {
	LinkedList<Station> ll=new LinkedList<Station>();
	
	void addStation(Station st) {
	ll.add(st);	
	}
	void displayStations() {
		for(Station s:ll) {
			System.out.println(s.stationId+" "+s.stationName+" "+s.arrivalTime);
		}
	}
	void addStationatBeginning(Station st) {
		ll.addFirst(st);
	}
	void addStationatEnd(Station st) {
		ll.addLast(st);
	}
	void removeStation(int id) {
		int i=0;
		for (Station s:ll) {
			if(s.stationId==id) {
				i=ll.indexOf(s);
				break;
			}
		}
		if(i>0) {
			ll.remove(i);
		}
	}

}
