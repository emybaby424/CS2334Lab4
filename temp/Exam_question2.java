import java.util.Scanner;

public class Exam_question2 {
	private int x;
	private int y;
	private int z;
	
	public Exam_question2() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	
	public Exam_question2(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}
	
}

// If we are calling this constructor with Exam_question(10, 90, z); what are the values of x,y,z respectively?
// 
//A. (10, 90, z)
//B. (10, 90, 0)
//C. (0, 0, 0)
//D. Error
