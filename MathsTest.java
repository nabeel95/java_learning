import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MathsTest {
  @Test
  public void sum() {
    Maths calculator = new Maths();
    int sum = calculator.addition("1+2+3");
    assertEquals(6, sum);
  }

  @Test
  public void factorial() {
    Maths math = new Maths();
    int fact = math.factorial(5);
    assertEquals(120,fact);
  }

  @Test
  public void square(){
  	Maths math = new Maths();
  	int result = math.square(5);
  	assertEquals(25,result);
  }

  @Test
  public void cube(){
  	Maths math = new Maths();
  	int result = math.cube(5);
  	assertEquals(125,result);
  }

  @Test
  public void tryT(){
  	int[][] multi = new int[5][];
	multi[0] = new int[10];
	multi[1] = new int[10];
	multi[2] = new int[10];
	multi[3] = new int[10];
	multi[4] = new int[10];
	multi[0][0]=10;
	multi[0][1]=12;
  	System.out.println(multi[0][0]);
  	System.out.println(multi[0][1]);

  }


}