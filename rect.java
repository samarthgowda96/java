class rect{
    int lenght, width;
    
    void getData(int x, int y){
        lenght=x;
        width=y;

    }
    int calarea(){
        int area= lenght*width;
        return (area);
    }



    public static void main(String args[ ]) {
        int area1,area2;
        rect rect1= new rect();
        rect rect2= new rect();
        rect1.lenght=10;
        rect1.width=15;

        area1= rect1.lenght*rect1.width;

        rect2.getData(10,16);
        area2= rect2.calarea();

        System.out.println("react1="+area1);
        System.out.println("react2="+area2);

        
    }
}