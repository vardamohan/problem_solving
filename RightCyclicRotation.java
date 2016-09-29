public class RightCyclicRotation{
  private static int[] getRightCyclicRotation(int[] A, int K){
      if(A == null || A.length == 0)
          return A;
      if(K>A.length)
          K = K % A.length;
      int[] rotated = new int[A.length];
      for(int i=0; i<K; i++){
          rotated[i] = A[A.length-K+i];   
      }
      int j = 0;
      for(int i=K; i<A.length; i++){
          rotated[i] = A[j];
          j++;
      }
      return rotated;
  }
  
  public static void main(String...args){
    int arr[] = {4, 8, 9, 6, 4};
    int noOfRotations = 3;
    System.out.println("Before Rotation");
    System.out.println(Arrays.toString(array));
    System.out.println("After Rotation");
    System.out.println(Arrays.toString(getRightCyclicRotation(arr, noOfRotations));
  }
}
