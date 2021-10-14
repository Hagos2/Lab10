package AssignmentLab10;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number for sizes:");
        int N= input.nextInt();
        int[]arraySD=new int[N];
        int sum=0;
        double average,s,var;
        for(int i=0;i<N;i++) {
            arraySD[i] = i;
            sum += arraySD[i];
        }
        average=sum/arraySD.length;
        double sum2=0;
        for(int i=0;i<N;i++){
            sum2=(i-average)*(i-average);
        }
        System.out.println(sum2);
        var=sum2/(arraySD.length);
        s=Math.sqrt(var);
        System.out.print(s);
    }
}
