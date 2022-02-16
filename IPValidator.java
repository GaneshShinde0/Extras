import java.util.Arrays;
import java.util.Scanner;
public class IPValidator {
    public static void main(String[] args) {
        System.out.println("Enter IP Address in format : 0-255.0-255.0-255.0-255");
        Scanner inp=new Scanner(System.in);
        String x=inp.nextLine(); //Reads Input from command-line
        //inp.close();
        String[] indiv=x.split("\\.",-1);//to get individual bit of IP
        
        System.out.println("You Entered :"+x);
        // System.out.println(Arrays.toString(indiv));
        System.out.println("Establishing Connection to :"+x+"\n"+validateip(indiv));
        
    }
    public static String validateip(String[] ip){
        String[] result=new String[ip.length];
        //System.out.println();
        
        for(int i=0;i<ip.length;i++){
            int l=Integer.valueOf(ip[i]);
            //System.out.println(l);
            if (0<=l && l<256){
                result[i]=Integer.toString(l);
            }
            else{
                result[i]="invalid";
            }
        }
        String res=String.join(".",result);
        if (res.contains("invalid")|| ip.length!=4){
            return "Sorry You Entered Invalid IP Please Enter Proper IP!!!";
        }
        return res;
    }
}
/*
Output for correct IP:
Enter IP Address in format : 0-255.0-255.0-255.0-255
66.99.65.25
You Entered :66.99.65.25
Establishing Connection to :66.99.65.25
66.99.65.25

Output for Incorrect IP 1:
Enter IP Address in format : 0-255.0-255.0-255.0-255
22.99.33.897
You Entered :22.99.33.897
Establishing Connection to :22.99.33.897
Sorry You Entered Invalid IP Please Enter Proper IP!!!

Output for Incorrect IP 2:
Enter IP Address in format : 0-255.0-255.0-255.0-255
1.2.3
You Entered :1.2.3
Establishing Connection to :1.2.3
Sorry You Entered Invalid IP Please Enter Proper IP!!!

Output for Incorrect IP 3:
Enter IP Address in format : 0-255.0-255.0-255.0-255
2.3.4.6.9
You Entered :2.3.4.6.9
Establishing Connection to :2.3.4.6.9
Sorry You Entered Invalid IP Please Enter Proper IP!!!
*/
