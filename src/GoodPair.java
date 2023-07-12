import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter a Integer:");
        int B= scanner.nextInt();
        System.out.println(pairCheck(array,B));
    }
    public static int pairCheck(int array[],int B)
    {
        for(int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                   if(array[i]+array[j]==B)
                   {
                       return 1;
                   }
            }
        }
       return 0;
    }
}
