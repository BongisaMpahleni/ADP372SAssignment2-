import java.util.HashMap;
import java.util.Map;


public class MapClass {


     Map EmployeeNames = new HashMap();



        public void add(int index, String value) {
            EmployeeNames.put(index, value);
            //  EmployeeNames.put(2 ,"Sino");
            //EmployeeNames.put(1, "Limi");

            System.out.println(EmployeeNames);
        }

        public void find(int index) {
            System.out.println("===Search");
            try {
                EmployeeNames.get(index);
                System.out.println("Finding....");
                System.out.println(index);

            } catch (Exception e) {
                System.out.println("No results");
            }


            System.out.println(EmployeeNames.get(index)+" was found ");

        }

        public void delete(String object) {
            System.out.println("===Removed===");
            EmployeeNames.remove(object);
            System.out.println("===object has been removed");
            System.out.println(EmployeeNames);
        }


    }




