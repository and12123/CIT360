
import java.util.*;

public class list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List gunList = new ArrayList();
        List list2 = new ArrayList();
        
        gunList.add("Glock");
        gunList.add("Remington");
        gunList.add("M&P");
        gunList.add("Springfield");
        gunList.add("Mossberg");
        gunList.add("Taurus");  
        gunList.add("Kel-Tec"); 
        gunList.add("Colt"); 
        
        System.out.println("\t" + gunList);
         
        for(int i = 0; i < gunList.size(); i++) {
            Object obj = gunList.get(i);
            list2.add(obj);
        }
        System.out.println();  
        System.out.println("\t" + list2);
             
        for(int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            System.out.println(obj);
        }
        
        System.out.println("Let's remove Kel-Tec from the list");
        
        for (int i = 0; i < gunList.size(); i++) {
            Object obj = gunList.get(i);
            if (obj == "Kel-Tec") {
                gunList.remove("Kel-Tec");
            }
        }
        System.out.println("\t" + gunList);
        
        System.out.println("Let's add Kel-Tec from the list");
        
        for (int i = 0; i < gunList.size(); i++) {
            Object obj = gunList.get(i);
            if (obj != "Kel-Tec") {
                gunList.add("Kel-Tec");
            }
        }
        System.out.println("\t" + gunList);
        
        List newLinkedList = new LinkedList();
        
        for (int i = 0; i < gunList.size(); i++){
            Object obj = gunList.get(i);
            newLinkedList.add(obj);
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("newLinkedList");
        System.out.println("\t" + newLinkedList);
        
        Iterator newList = newLinkedList.iterator();
        
        System.out.println();
        
        System.out.println("newList");
        System.out.println("\t" + newList);
        
        System.out.println();
        
        System.out.println("newList");
        
        System.out.print("      [ ");
        
        while (newList.hasNext()) {
            Object print = newList.next();
            System.out.print(print + " ");
        }
        System.out.print("]");
        System.out.println();
        
    }   
}
