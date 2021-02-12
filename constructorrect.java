class rect{
    int lenght, width;
    
    rect(int x, int y){
        lenght=x;
        width=y;

    }
    int calarea(){
        int area= lenght*width;
        return (area);
    }



    public static void main(String args[ ]) {
        int area1,area2;
        rect rect1= new rect(10,16);
        //rect rect2= new rect();
       

        area1=rect1.calarea();
        //area2= rect2.calarea();

        System.out.println("react1="+area1);
        //System.out.println("react2="+area2);

        
    }
}