package libraryFineCalculationSystem;
class LibraryFine{
	void calculateFine(int numberoflatedays){
		System.out.println(numberoflatedays+" Late days for fine 10/Days:  Total Fine: " +numberoflatedays*10);
	}
	void calculateFine(int latedays ,int  fineperday){
		System.out.println(latedays+" Late days for fine "+fineperday+"/Days: " +" Total Fine: " +latedays*fineperday);
	}
	void calculateFine(int latedays,int fineperday ,int additionalpenalty){
		System.out.println(latedays+" Late days for fine "+fineperday+"/Days: "+" Additional Penalty: "+ additionalpenalty +" Total Fine: " +(latedays*fineperday+additionalpenalty));
		
	}
}
public class Main {
	public static void main(String[] args) {
		LibraryFine lb=new LibraryFine();
		lb.calculateFine(4,7,400);
	}

}
