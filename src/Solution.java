class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int []mm=new int[m];
        for(int i=0;i<m;i++){
            mm[i]=nums1[i];
        }
        int i=0;int j=0;int k=0;
        while(i<m&&j<n){
            if(mm[i]>nums2[j]){
                nums1[k]=nums2[j];
                k++;
                j++;
            }else{
                nums1[k]=mm[i];
                i++;
                k++;
            }
        }
        while(i<m){
            nums1[k]=mm[i];
            i++;
            k++;
        }
        while(j<n){
            nums1[k]=nums2[j];
            j++;
            k++;
        }
        System.out.println(k);
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int []a={1,2,3,0,0,0};
        int[]b={4,5,6};
        merge(a,3,b,3);
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+a[5]);
    }
}