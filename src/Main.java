import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("lets play rock papper and scisser game");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 for rock, 2 for page , 3 for scisser");
        int gamecount=0;
        int aslam_score=0;
        int ahmed_score=0;

         while (gamecount<=5) {
             int aslam= 1+(int)(3*Math.random()); // it generate 3 random number sometime 1 or 2 or 3
             int ahmed = sc.nextInt();

             if (aslam == 1 && ahmed == 1 || aslam == 2 && ahmed == 2 || aslam == 3 && ahmed == 3) {
                 System.out.println("tie");
             } else if (aslam == 1 && ahmed == 2) {
                 System.out.println("ahmed wins");
                 ahmed_score=ahmed_score+1;
             } else if (aslam == 1 && ahmed == 3) {
                 System.out.println("aslam wins");
                 aslam_score=aslam_score+1;
             } else if (aslam == 2 && ahmed == 1) {
                 System.out.println("aslam wins");
                 aslam_score=aslam_score+1;
             } else if (aslam == 3 && ahmed == 1) {
                 System.out.println("aslam wins");
                 aslam_score=aslam_score+1;
             } else if (aslam == 2 && ahmed == 3) {
                 System.out.println("ahmed wins");
                 ahmed_score=ahmed_score+1;
             } else if (aslam == 3 && ahmed == 2) {
                 System.out.println("aslam wins");
                 aslam_score=aslam_score+1;
             }

             gamecount=gamecount+1;

         }
            System.out.println("ahmed sore="+ahmed_score);
            System.out.println("aslam score= "+aslam_score);
    }
}