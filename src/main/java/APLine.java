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

  public int getSlope(){
    return (double)-a/b;
  }

  public boolean isOnLine(int x, int y){
    if(a * x + b * y + c == 0){
      return true;
    }
    return false;
  }
}
