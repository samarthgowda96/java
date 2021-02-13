import java.io.*;


public class vectorstringsinttypecover {
        public static void main(String args[]) {
            Float principalAmount= new Float(0);
            Float interest= new Float(0);
            int numYears= 0;
            try{
                DataInputStream in= new DataInputStream(System.in);
                System.out.print("enter the principal amt=");
                System.out.flush();
                String principalString= in.readLine();
                principalAmount= Float.valueOf(principalString);
                System.out.print("enter the interest amt=");
                System.out.flush();
                String interestString= in.readLine();
                interest= Float.valueOf(interestString);
                System.out.print("enter the years ");
                System.out.flush();
                String yearsString= in.readLine();
                numYears= Integer.parseInt(yearsString);

            }

            catch(IOException e){
                System.out.print("I/O Error");
                System.exit(1);

                
            }
        }
        float value= loan(principalAmount.floatValue(),interest.floatValue(),numYears);
            static float loan(float p, float r, int y){
                int year=1;
                float sum= p;
                while(year<=y){
                    sum=sum *(1+r);
                    year=year+1;

                }
                return sum;
            }
            


        
            
        
}
