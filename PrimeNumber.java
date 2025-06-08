import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter n value");
        int n=snr.nextInt(),sum=0,count=0;
	System.out.println("The prime numbers present till "+ n + " are: ");
        for(int i=2;i<n;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    
                }
            }
            if(flag==0){
                sum=sum+i;
                System.out.print(i+" ");
                count++;
            }
        }
	System.out.println();
        System.out.println("The sum of all prime numbers is: "+ sum);
        System.out.println("The average of all prime numbers is: "+sum/count);
    }
}