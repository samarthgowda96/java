class sort{
    public static void main(String agrs[]) {
        int a[]= {22,56,11,30,67};
       
        int n= a.length;
        System.out.print("given array=");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.print("\n ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }
        System.out.print("sorted array=");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }

        
    }
    

}