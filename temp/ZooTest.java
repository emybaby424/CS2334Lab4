
public class ZooTest {
	
	public void defaultConstructorTest() throws AssertException{
		
		Zoo zoo = new Zoo(3);
		
		//Animal(String color, String name, double weight, double height)
		
		Animal ani = new Animal("pink", "Bob", 200.0, 120.0);			// creating Animal objects
		Animal ani2 = new Animal("pink", "Soap", 50.0, 100.0);
		Animal ani3 = new Animal("yellow", "SpongeBob", 20.0, 20.0);
		
		zoo.addAnimal(ani);			// adding the Animals to the animals array
		zoo.addAnimal(ani2);
		zoo.addAnimal(ani3);
		
		Assert.assertEquals(3, zoo.getCapacity());
		Assert.assertEquals(ani, zoo.getAnimals()[0]);			// checking the getAnimal method
		Assert.assertEquals(ani2, zoo.getAnimals()[1]);
		Assert.assertEquals(ani3, zoo.getAnimals()[2]);
		
		Assert.assertEquals(90, zoo.getAverageWeight());
		Assert.assertEquals(125, zoo.getAverageWeight("pink"));		// checking getters
		Assert.assertEquals(240.0, zoo.getTotalHeight());
		Assert.assertEquals("These animals live in the zoo: \n" + ani.toString() + ani2.toString() + ani3.toString(), zoo.toString()); // checking toString
		
		
		
		
		
		
		
	}
}
