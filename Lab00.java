public class Lab00
{
   public static void main(String[] args) {
      int x = 5;
      String y = "hello";
      float z = 9.8f;

      System.out.println("x: " + x + " y: " + y +" z: " + z);

      int[] Num = {3, 6, -1, 2};
      int l = Num.length;
      int i;
      for (i = 0; i < l; i++) {
         System.out.println(Num[i]);
      }
      char r = 'l';
      int numFound = char_count(y, r);
      System.out.println("Found: "+ numFound);
      int k;
      for (k = 0; k <11; ++k){
         System.out.print(k + " ");
      }
   }
   public static int char_count(String s, char c){
      int i;
      int count = 0;
      for (i = 0; i < s.length(); i++){
         char t = s.charAt(i);
         if (t == c){
            count = count + 1;
         }
      }
      return count;
   }
   }
