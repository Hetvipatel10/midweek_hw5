package midweek_hw5;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        String name;
        int roll, math , phy,eng;
        Scanner SC=new Scanner(System.in);
        System.out.println("                        10th marksheet                ");
        System.out.println("======================================================");
        System.out.println("       Enter name:");
        name=SC.nextLine();
        System.out.println("    Enter roll number:");
        roll=SC.nextInt();
        System.out.println(" Enter marks in maths,physics and english");
        math=SC.nextInt();
        phy=SC.nextInt();
        eng=SC.nextInt();

        int total=math+eng+phy;
        float perc=(float)total/300*100;

        System.out.println("Roll Number:" + roll + "\tName: "+name);
        System.out.println("Marks (maths,physics,english): " +math+ ","+phy+","+eng);
        System.out.println("Total: "+total +"\tPercentage: "+perc);


    }
}
