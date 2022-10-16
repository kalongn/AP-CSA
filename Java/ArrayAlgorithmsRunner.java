public class ArrayAlgorithmsRunner 
{
  public static void main(String[] args) 
  {
    int[] testArray = {51,81,49,0,1,13,7,9,2,3,5};
    int[] testArray2 = {55,55,22,33,33,33,4,0,33,22,4,22,5,22,6,22,22};
  
    System.out.println("test array: "+ArrayAlgorithms.print(testArray));
    System.out.println("findMax:"+ArrayAlgorithms.findMax(testArray));
    System.out.println("findMin:"+ArrayAlgorithms.findMin(testArray));
    System.out.println("sum:"+ArrayAlgorithms.sum(testArray));
    System.out.println("average:"+ArrayAlgorithms.average(testArray));
    System.out.println("mode:"+ArrayAlgorithms.mode(testArray2));
    System.out.println("modes:"+ArrayAlgorithms.print(ArrayAlgorithms.modes(testArray2)));
    System.out.println("Search 13:"+ArrayAlgorithms.search(testArray, 13));
    System.out.println("Check if array contain perfect square:"+ArrayAlgorithms.checkPer(testArray));
    System.out.println("Check how many perfect square in array:"+ArrayAlgorithms.checkVPer(testArray));
    System.out.println("Check consecutive:"+ArrayAlgorithms.consecutive(testArray));
    System.out.println("Check Duplicate:"+ArrayAlgorithms.duplicate(testArray));
    System.out.println("Check bigger then 10:"+ArrayAlgorithms.biggerThenTen(testArray));
    ArrayAlgorithms.shiftLeft(testArray);
    System.out.println("shift left:"+ArrayAlgorithms.print(testArray));
    ArrayAlgorithms.reverse(testArray2);
    System.out.println("reverse:"+ArrayAlgorithms.print(testArray2));
    
  }
}