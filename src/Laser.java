public class Laser {
   private int row, column, direction;
   public static final int UP    = 0;
   public static final int RIGHT = 1;
   public static final int DOWN  = 2;
   public static final int LEFT  = 3;

   public Laser(char station) {
      if (station >= 'a' && station <= 'j') {
         row = 1;
         column = (int) (station - 'a') + 1;
         direction = DOWN;
      } else if (station >= 'A' && station <= 'J') {
         row = 10;
         column = (int) (station - 'A') + 1;
         direction = UP;
      } else if (station >= 'k' && station <= 't') {
         row = (int) (station - 'k') + 1;
         column = 1;
         direction = RIGHT;
      } else   //if(station>='K' && station<='T')
      {
         row = (int) (station - 'K') + 1;
         column = 10;
         direction = LEFT;
      }
   }
}
