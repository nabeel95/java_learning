public class Maths {
  public int addition(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }

  public static int factorial(int num){
  	int result=1;
  	for(int i=1;i<=num;i++){
  		result=result*i;
  	}
  	return result;
  }

  public static int square(int num){
  	return num*num;
  }

  public static int cube(int num){
  	return num*num*num;
  }
}