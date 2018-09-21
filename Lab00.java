public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello";
      double z = 9.8;   
       
      System.out.println("x: " + x + " y: " + y + " z: " + z);

      int[] nums = {3, 6, -1, 2};

      // a list (make and array in java)
      for (int val : nums)
      {
        System.out.println(val);
      } // for

      // call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found:" + numFound);

      // a counting for loop
      for (int i = 0 ; i < 11 ; i++)
      {
        System.out.print(i);
        System.out.print(" ");
      }
      System.out.println();
   

   }

   public static int char_count(String s, char c)
   {
     int count = 0;
     for (int ch : s.toCharArray())
     {
       if (ch == c)  count++;
     }
     return count;
   }
}
