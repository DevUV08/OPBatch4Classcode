// wrtie a java program to find all even numbers and return in terms of array list
import java.util.ArrayList;
public class Practice1 {
public static void main(String[] args) 
    {
        int[] nums={10,1,3,0,5,40,6,79};
        ArrayList <Integer> arrayList=new ArrayList<>();
        if(nums.length == 0) System.out.println("Invalid Input");
        else
        {
            for(int i=0;i< nums.length;i++)
            {
                if (nums[i]!=0 && nums[i]%2==0) arrayList.add(nums[i]);
            }
            System.out.println(arrayList);
        }
    }
}

