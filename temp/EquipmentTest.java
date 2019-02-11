
public class EquipmentTest {
	
	public void ConstructorTest() throws AssertException {
		
		Equipment equi = new Equipment("hammer/4,20.0,10.0,cool hammer");  // calling the full constructor
		
		Assert.assertEquals("hammer", equi.getName());			// testing constructor, getters, toString
		Assert.assertEquals(4, equi.getCount());
		Assert.assertEquals(20.0, equi.getTotalWeight());
		Assert.assertEquals(10.0, equi.getTotalPrice());
		Assert.assertEquals("cool hammer", equi.getDescription());
		Assert.assertEquals("Name: hammer, Number: 4, Weight: 20.0 lbs, Price: $10.0 - cool hammer", equi.toString());
		
	}

}
