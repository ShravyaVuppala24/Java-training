package interviewprograms;
import java.util.*;
public class BinarySearch {

    public static int binary(ArrayList<Integer> ar, int x)
    {
        int low =0;
        int hi =ar.size()-1;
        int ans =-1;

        while(low<=hi)
        {
            int mid =(low+hi)/2;

            if (ar.get(mid)==x)
            {
                ans=mid;
                break;
            }
            else if (ar.get(mid)<x)
            {
                low=mid+1;
            }
            else
            {
                hi=mid-1;
            }

        }

        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the array size");
        int s = sc.nextInt();
        System.out.println("Enter Elements");
        ArrayList <Integer> ar = new ArrayList<>();

        for (int i=0;i<s;i++)
        {
            ar.add(sc.nextInt());
        }

        Collections.sort(ar);
        System.out.println("Enter Element to Search");
        int ele = sc.nextInt();
        int res = binary(ar,ele);
        if (res!=-1)
        {
            System.out.println("Element present");
        }
        else {
            System.out.println("Element not present");
        }




    }
}
