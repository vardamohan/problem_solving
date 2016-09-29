public class MaxBinaryGap{
  
  public static void main(String args[]){
    int num = 105;
    System.out.println("Maximum Binary Gap for number "+num+" is "+ getMaxBinaryGap(num));
  }
 
  private static int getMaxBinaryGap(int num) {
      int maxBinaryGap = 0;
    	int rightMostBit = 0;
    	int counter = -1;     
    	while (num > 0) {		
    		rightMostBit = num & 1;//get right significant bit
    		num = num >> 1;//shift one bit right     
    		if (rightMostBit == 0 && counter >= 0) {
    			counter++;
    		}     
    		if (rightMostBit == 1) {
    			maxBinaryGap = counter > maxBinaryGap ? counter : maxBinaryGap;
    			counter = 0;
    		}
    	} 
    	return maxBinaryGap;
    }
  
}
