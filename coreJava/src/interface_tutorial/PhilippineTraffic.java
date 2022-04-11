package interface_tutorial;

public class PhilippineTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic obj = new PhilippineTraffic(); // creating object to Phi to implement the methods present to CentralTraffic class
		obj.redStop();
		obj.greenGo();
		obj.yellowFlash();
		
		PhilippineTraffic obj2 = new PhilippineTraffic();
		obj2.walkingSymbol(); // We declare a new obj that is specific to Phi for us to call the walkingSymbol method since it is not part of CentralTraffic
		
		ContinentalTraffic obj3 = new PhilippineTraffic();
		obj3.TrainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Red stop implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Green go implementation");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Yellow flash implementation");
	}
	
	public void walkingSymbol() {
		System.out.println("Just walk");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		
	}

}
