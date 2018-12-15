public class Pattern {
    public static void main(String[] args) {
       /* for(int i=1;i<=6;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */
       /*
       for(char i=65;i<=67;i++)
       {
           for (char j=65;j<=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }
       */
       for (int i=1;i<=4;i++) {
           for (int j = 1; j <= 4; j++) {
               if(i==2 && j==2|| i==3 && j==3|| i==2&&j==3||i==3&&j==2)
                   System.out.print("\t");
               else
                   System.out.print("$\t");
           }
           System.out.println();
       }
    }

}
