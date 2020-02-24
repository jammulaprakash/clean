import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
        Scanner sc=new Scanner(System.in);
        output.print("Enter principal");
        double principal=sc.nextDouble();
        output.print("Enter time");
        double time=sc.nextDouble();
        output.print("Enter rate_of_interest");
        double rate_of_interest=sc.nextDouble();
        output.print("is automated?");
        boolean automated=sc.nextBoolean();
        output.print("Enter material");
        String material=sc.next();
        output.print("Enter area");
        double area=sc.nextDouble();

        sim_in s=new sim_in(principal,time,rate_of_interest);
        double simple_interest=s.cal();
        output.print("/nsimple interest:"+simple_interest);

        com_in c=new com_in(principal,time,rate_of_interest);
        double compound_interest=c.cal();
        output.print("/ncompound interest:"+compound_interest);

        construction con=new construction(automated,material,area);
        double cost=con.construct();
        output.print("/ntotal cost:"+cost);
    }
}
