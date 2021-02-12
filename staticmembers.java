class math{
    static float mul(float x, float y){
        return(x*y);
    }
    static float div(float x, float y){
        return(x/y);
    }
    public static void main(String args[]){
        float a= math.mul(10,2);
        float b = math.div(10,2);

        System.out.println("mul = "+a);
        System.out.println("div = "+b);
    }
}