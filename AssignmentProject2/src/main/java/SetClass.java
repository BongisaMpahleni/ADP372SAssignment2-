import java.util.HashSet;
import java.util.Set;

public class SetClass {

        Set<String> EmployeeNames = new HashSet<>() ;

        public void add (String name){
            EmployeeNames.add(name);
            System.out.println(EmployeeNames);
        }
        public  String find (String object){
            EmployeeNames.contains(object);
            System.out.println(EmployeeNames);
            return object;
        }

        public void remove (String object){
            EmployeeNames.remove (object);
            System.out.println(EmployeeNames);
        }

    }


