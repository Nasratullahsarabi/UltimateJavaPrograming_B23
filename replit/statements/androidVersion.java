package statements;

public class androidVersion {
    public static void main(String[] args) {

      double version = 11.1;


      if (version==1.5){
          System.out.println("Cupcake");
      }
      if (version==1.6){
          System.out.println("Donut");
      }
      if(version == 2.1){
          System.out.println("Eclair");

          }
        if(version !=1.5 && version !=1.6 && version !=2.1){
            System.out.println("Sorry, I don't know this version");
        }

      }
    }

