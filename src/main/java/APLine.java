public class APLine
{
  private int num1; 
  private int num2;
  private int num3;
  
 public APLine(int a, int b, int c){
  num1 = a;
   num2 = b;
   num3 = c;
 }

  public double getSlope(){
    return (double)-num1/num2;
  }

  public boolean isOnLine(int x, int y){
    if(num1 * x + num2 * y + num3 == 0){
      return true;
    }
    return false;
  }
}
