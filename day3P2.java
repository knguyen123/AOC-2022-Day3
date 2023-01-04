import java.io.*;
import java.util.*;
public class day3P2 {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("rucksacks.txt"));
      String com = "";
      while(f.hasNextLine()){
         String s1 = f.nextLine();
         String s2 = f.nextLine();
         String s3 = f.nextLine();
         boolean b = false;
         for(char c: s1.toCharArray()){
            for(char c2: s2.toCharArray()){
               for(char c3: s3.toCharArray()){
                  if(c==c2&&c2==c3){
                     com+= c;
                     b = true;
                     break;
                  }
               }
               if(b){
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