import java.util.ArrayList;
import java.util.Collection;

public class CollectionClass {

    Collection<String> EmployeeNames = new ArrayList<>() ;

    public void add (String object){
        System.out.println("===========Add Names======");
        EmployeeNames.add(object);
        System.out.println(EmployeeNames);
    }

    public  String find (String object){
        System.out.println("=====Finding Names=====");
        if (EmployeeNames.contains(object)){
            System.out.println("====Finding....====");
            System.out.println(object);
        }else{
            System.out.println("No Results");
        }
        return object;
    }

    public void remove (String object){
        System.out.println("Remove name");
        EmployeeNames.remove (object);

        System.out.println("Object is being removed");
        System.out.println(EmployeeNames);
    }



}
