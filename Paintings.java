import java.util.Scanner;
public class Paintings {
    public static void main(String [] args) {

        Painting[] obj = new Painting[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print("Enter Artist Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Painting Title: ");
            String title = sc.nextLine();

            switch (name){
                case "Degas":
                case "degas":
                case "DEGAS":
                case "Monet":
                case "monet":
                case "MONET":
                case "Picasso":
                case "picasso":
                case "PICASSO":
                case "rembrandt":
                case "Rembrandt":
                case "REMBRANDT":
                    obj[i] = new FamousPainting(title,name);
                    break;

                default:
                    obj[i] = new Painting(title,name);
                    break;
            }
        }

        for(int i = 0; i < 10; i++){
            obj[i].display();
        }


    }

}

 

