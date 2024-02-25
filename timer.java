import java.util.*;

public class Main {
    public static void main(String args[]) throws InterruptedException {
      int mins=0,sec=0,hour=0;
        for(int i=0;i<61;i++)
          {
            for(int j=0;j<61;j++)
              {
                for(int k=0;k<61;k++)
                  {
                    sec=k;
                    System.out.print("\r hour: "+ hour+" minute: "+ mins+" seconds: "+sec);
                    Thread.sleep(1000);
                  }
                mins+=1;
              }
            hour+=1;
          }
        }
    }

