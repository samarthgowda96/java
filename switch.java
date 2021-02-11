public class cityguide{
    public static void main(String args[]) {
        char choice;
        System.out.println("M--->Madras");
        System.out.println("B--->bombay");
        System.out.println("C--->Calcutta");
        System.out.print("Choice--->");
        System.out.flush();
        try{
            switch (choice=(char)System.in.read()) {
                case 'M':
                case 'm':System.out.println("Madras");
                         break;
                case 'B':
                case 'b':System.out.println("Bombay");
                         break;
                case 'C':
                case 'c':System.out.println("chennai");
                        break;
            
                default: System.out.println("Inavlid Choice (IC)");
                    break;
            }
        }
        catch(Exception e){
            System.out.print("I/O error");
        }
        
    }
}