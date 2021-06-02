
package Queue;

public class AntrianApp {
    public static void main (String[]args){
    Antrian antrian= new Antrian (5);
    antrian.enqueue(43);
    antrian.display();
    antrian.enqueue(33);
    antrian.display();
    antrian.peek();
    antrian.enqueue(60);
    antrian.display();
        System.out.println("Yang diambil dari antrian = "+ antrian.dequeue());
        System.out.println ("yang diambil dari antrian = " + antrian.dequeue());
    antrian.enqueue(54);
    antrian.display();
    antrian.peek();
    }
    
}
