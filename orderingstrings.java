public class orderingstrings {


        static String name []={"bengaluru","karnataka","newyork","san francisco"};

    public static void main(String args[]) {

        int size= name.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                String temp = null;
                if(name[j].compareTo(name[i])<0){
                    temp= name[i];
                    name[i]=name[j];
                    temp=name[j];
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(name[i]);
        }
    }
}
