package electricityBillGenerator;

public class ElectricityApp {
	public static void main(String[] args) {
		ElectricityConnection ec=new ElectricityConnection(1001, "Abhi", 402);
		ElectricityConnection.BillCalculator inner=ec.new BillCalculator();
		System.out.println(inner.calculator(ec.getUnitsConsumed()));
	}
}
