package electricityBillGenerator;

public class ElectricityConnection {
	int consumerId;
	String consumerName;
	int unitsConsumed;
	public ElectricityConnection(int consumerId, String consumerName, int unitsConsumed) {
		super();
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.unitsConsumed = unitsConsumed;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	class  BillCalculator{

		public float calculator(int unitsConsumed) {
			// TODO Auto-generated method stub
			float total=0;
			if(unitsConsumed<=100) {
				total=unitsConsumed*5;
			}else if(unitsConsumed<=200){
				total=500+(unitsConsumed%100)*7;
			}else {
				total=1200+(unitsConsumed-200)*10;
			}
			
			return total;
		}
		
		
	}
	
}
