
class Room
{
    float length;
    float breadth;

    void getData(float a, float b){
        length = a;
        breadth = b;
    }

    public static void main(String args[]) 
    {
        float area;
        Room room1= new Room();
        room1.getData(3, 4);
        area= room1.length*room1.breadth;
        System.out.println("Area="+area);
        
    }
}
