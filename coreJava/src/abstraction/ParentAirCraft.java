package abstraction;

public abstract class ParentAirCraft {
	
	/*
	 * 1. Interface contains only abstract methods
	 * 2. Access specifiers for methods in interface must be public
	 * 3. Variables defined must be public, static, final
	 * 4. To implement an interface we use implements keyword
	 */
	
	/*
	 * 1. Abstract class can contain abstract methods, concrete methods or both
	 * 2. Except private we can have any access specifier for methods in abstract class
	 * 3. Except private variables, methods can have any access specifiers
	 * 4. To implement an interface we use extends
	 *  keyword
	 */

	public void engine() {
		System.out.println("Follow Engine Guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow Saferty Guidelines");
	}
	
	public abstract void bodyColor();

}
