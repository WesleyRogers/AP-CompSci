/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate(); //This one looks really creepy. o_o
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBottomToTop();
    //testMyCollage();
    //testSuperEdgeDetection();
  }

  public static void testKeepOnlyBlue() {
    // TODO Auto-generated method stub
    Picture splat = new Picture("splatoon.jpg");
    splat.keepOnlyBlue();
    splat.explore();
  }
  
  public static void testNegate(){
    Picture splat = new Picture("splatoon.jpg");
    splat.negate();
    splat.explore();
  }
  
  public static void testGrayscale(){
      Picture splat = new Picture("splatoon.jpg");
      splat.grayscale();
      splat.explore();
  }
  
  public static void testMirrorVerticalRightToLeft(){
      Picture splat = new Picture("splatoon.jpg");
      splat.mirrorVerticalRightToLeft();
      splat.explore();
  }
  
  public static void testMirrorHorizontal(){
      Picture splat = new Picture("splatoon.jpg");
      splat.mirrorHorizontal();
      splat.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop(){
      Picture splat = new Picture("splatoon.jpg");
      splat.mirrorHorizontalBottomToTop();
      splat.explore();
  }
  
  public static void testCopy2(){
      Picture splat = new Picture("splatoon.jpg");
      Picture swan = new Picture("beach.jpg");
      
      splat.copy(swan, 0, 0, 300, 300);
      splat.explore();
  }
  
  public static void testMyCollage(){
      Picture splat = new Picture("splatoon.jpg");
      splat.myCollage();
      splat.explore();
  }
  
  public static void testSuperEdgeDetection(){
      Picture splat = new Picture("splatoon.jpg");
      Picture splat2 = new Picture("splatoon.jpg");
      splat.superEdgeDetection(10);
      splat.explore();

  }
}