
public class EquipmentTest {
	
	
	public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
    	String strg = " /0,0.0,0.0, ";
		
    	
        String[] tokens = strg.split(",");
        String[] idinfo = tokens[0].split("/");
        String name = idinfo[0];
        int count = Integer.parseInt(idinfo[1]);
        double totalWeight = Double.parseDouble(tokens[1]);
        double totalPrice = Double.parseDouble(tokens[2]);
        String description = tokens[3];
        
        // The name should be "noname", number weight price 0, description.
        Assert.assertEquals(" ", name);
        Assert.assertEquals(0, count);
        Assert.assertEquals(0.0, totalWeight);
        Assert.assertEquals(0.0, totalPrice);
        Assert.assertEquals(" ", description);
       
        }
	
	
	public void ConstructorTest() throws AssertException {
		
		Equipment equi = new Equipment("hammer/4,20.0,10.0,cool hammer");  // calling the full constructor
		Equipment equi2 = new Equipment("hammer/4,20.0,10.0,cool hammer");
		Equipment equi3 = new Equipment("hammer/4,20.0,10.0,bad hammer");
		
		Assert.assertEquals("hammer", equi.getName());			// testing constructor, getters, toString
		Assert.assertEquals(4, equi.getCount());
		Assert.assertEquals(20.0, equi.getTotalWeight());
		Assert.assertEquals(10.0, equi.getTotalPrice());
		Assert.assertEquals("cool hammer", equi.getDescription());
		Assert.assertEquals("Name: hammer, Number: 4, Weight: 20.00 lbs, Price: $10.00 - cool hammer", equi.toString());
		
		Assert.assertEquals(equi.equals(equi2), true);
		Assert.assertEquals(equi2.equals(equi3), false);
	}

}
