
public class Runner {
    
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        
        list.insert(55);
        list.insert(555);
        list.insertAtStart(5);
        list.insertAtIndex(1, 10);
        list.delete(0);
        
        
        // [5, 10, 55, 555]
        
        list.print();
        
    }
    
}
 