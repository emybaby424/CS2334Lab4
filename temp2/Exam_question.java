
public class Exam_question {
	private int x;
	private int y;
	
	
	public Exam_question() {
		x = 0;
		y = 0; 
	}
	
	public Exam_question(int x, int y) {
		this.x = x;
		this.y = y;
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	
	public String toString() {
		
		return null;
		
	}	
}
// In the codes above, how could you make .toString() return in the format "(number of x) + (number of y) = (sum)"?
// Fill your code in place of null

//A. System.out.print(x + " + " + y + " = " + (x+y) );

//B. String.format("%d + %d = %d", x, y, x + y);

//C. String.format(x + y = z, x, y, x+y);
