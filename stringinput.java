class whiletest{
    public static void main(String args[]) {
        StringBuffer string= new StringBuffer();
        char c;
        System.out.println("enter the string");
        try{
            while((c=(char)System.in.read())!='\n'){
                string.append(c);
            }
        }
        catch(Exception e){
            System.out.println("error");
            
        }
        System.out.println("you have entered..");
        System.out.println(string);
    }
}