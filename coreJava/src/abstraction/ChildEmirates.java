package abstraction;

public class ChildEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		
		/*
		 * Sa interface hindi tayo makakagawa ng obj kung hindi galing sa parent ang instantiation
		 * while sa abstract since nakaextend lang sya lahat ng method makikita natin kahit hindi sya
		 * naka-instantiate sa parent
		 * 
		 * Note: Hindi pwede mag instantiate gamit ang parent sa abstraction
		 * 
		 */
		
		ChildEmirates c = new ChildEmirates();
	
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
