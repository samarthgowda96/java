import java.io.DataInputStream;

class Reading{
    public static void main(String args[]){
        DataInputStream in= new DataInputStream(System.in);
        int num=0;
        float floatnum=0;

        try{
            System.out.println("int= ");
            num= Integer.parseInt(in.readLine());
            System.out.println("float= ");
            floatnum= Float.valueOf(in.readLine()).floatValue();

        }
        catch(Exception e){ }
        System.out.println("intnum= "+num);
        System.out.println("floatnum= "+floatnum);



    }
}