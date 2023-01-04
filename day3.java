import java.io.*;
import java.util.*;
public class day3 {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("rucksacks.txt"));
      String com = "";
      while(f.hasNextLine()){
         String s = f.nextLine();
         //System.out.print(s.length());
         String s1 = s.substring(0, (s.length()/2));
         String s2 = s.substring(s.length()/2);
         boolean b = false;
         for(char c: s1.toCharArray()){
            for(char c2: s2.toCharArray()){
               if(c==c2){
                  com+= c;
                  b = true;
                  break;
               }
            }
            if(b){
               break;
            }
         }
      }
      int n = 0;
      for(char c: com.toCharArray()){
         if((int)c>96){
            n+= (int)c - 96;
         }else{
            n+= (int)c - 38;
         }
      } 
      System.out.print(n+""); 
   }
}