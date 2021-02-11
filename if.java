public class weight{
    public static void main(String args[]) {
        int i,count=0,count1=0,count2=0;
        float[] weight={45.05F,55.05F,3.05F};
        float[] height={173.56F,345.56F,67.56F};
        for(i=0;i<=2;i++){
            if(weight[i]>=45.05F && height[i]<= 173.56F){
                count= count+1;
            }
            count1=count1+1;
        }
        count2=count1-count;
        System.out.println("res"+count);
        System.out.println("others"+count2);
        
    }
}