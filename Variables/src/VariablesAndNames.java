
public class VariablesAndNames 
{
	private static final String Passengers = null;
	private static int avrage_passengers_per_car;

	public static void main(String[] args)
	{
		int cars, drivers , passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car = 0;
		
		cars=100;
		space_in_a_car=4.0;
		drivers=30;
		passengers=90;
		cars_not_driven=cars-drivers;
		cars_driven=drivers;
		carpool_capacity=cars_driven *space_in_a_car;
		avrage_passengers_per_car = passengers/cars_driven;
		
		
		System.out.println("There are " + cars + " cars available");
		System.out.println("There are only " + drivers + " drivers avialable");
		System.out.println("There will be "+ cars_not_driven + " empty cars today");
		System.out.println("We can transport " + carpool_capacity + " People today");
		System.out.println("We have "+ Passengers + " to carpool today");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car");
	}

}
