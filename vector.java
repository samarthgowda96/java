import java.util.*;
class vector {
    public static void main(String args[]) {
        Vector list = new Vector();
        int len= args.length;
        for(int i=0;i<len;i++){
            list.addElement(args[i]);
        }
        list.insertElementAt("ball",0);

        int size = list.size();
        String listArray[]= new String[size];

        list.copyInto(listArray);
        System.out.println(listArray);
        for(int i=0;i<size;i++){
            System.out.println(listArray[i]);
        }
  
        
    }
    
}
