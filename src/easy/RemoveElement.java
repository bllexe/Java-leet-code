package easy;

public class RemoveElement {

    public static void main(String[] args) {
       
        int [] arr={0,1,2,2,3,0,4,2};
        int val=2;
        int ans=removeElement(arr,val);
        System.out.println(ans);
    }

    private static int removeElement(int[] num, int val) {

        int j=0;
        for(int i=0;i<num.length;i++){

            if(num[i] !=val){
                num[j]=num[i];
                j++;
            }
        }
        return j;
    }
}
