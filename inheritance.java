public class Room
{
    int length;
    int breadth;

    Room(int x, int y){
        length=x;
        breadth=y;
    }

    int area(){
        return (length*breadth);
    }
    public static void main(String args[]) {
        bedroom bed= new bedroom(14,12,10);
        int vol =bed.volume();
        System.out.print("vol : "+vol);   
    }
}


class bedroom extends Room{
    int height;
    bedroom(int x, int y, int z){
        super(x,y);
        height=z;
    }
    int volume(){
        return (length*breadth*height);
    }

}
    
