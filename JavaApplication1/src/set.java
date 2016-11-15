import java.util.*;

public class set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet gunSet = new HashSet();
        HashSet backup = new HashSet();
        HashSet another = new HashSet();
        
        gunSet.add("Glock");
        gunSet.add("Remington");
        gunSet.add("M&P");
        gunSet.add("Springfield");
        gunSet.add("Mossberg");
        gunSet.add("Taurus");  
        gunSet.add("Kel-Tec"); 
        gunSet.add("Colt"); 
        
        backup.addAll(gunSet);
        
        System.out.println();
        System.out.println("Elements in the gunSet Set ");
        if(gunSet.isEmpty()) {
            System.out.println("The gunSet is empty");
        }
        else {
            System.out.println(gunSet);
        }
        
        System.out.println();
        System.out.println("Elements in the backupt Set ");
        if(backup.isEmpty()) {
            System.out.println("The backup is empty");
        }
        else {
            System.out.println(backup);
        }
        
        System.out.println();
        
        System.out.println("Elements in the another Set ");
        if(another.isEmpty()) {
            System.out.println("The another is empty");
        }
        else {
            System.out.println(backup);
        }
        
        System.out.println();
        
        Iterator aLinkedSet = gunSet.iterator();
        while (aLinkedSet.hasNext()) {
            System.out.println(aLinkedSet.next());
            
            }
        System.out.println();
    }
    
}
