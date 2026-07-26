import java.util.Scanner;
public class arrey {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                System.out.println(i+1);
            }
        }
        
    }
       
       
}
