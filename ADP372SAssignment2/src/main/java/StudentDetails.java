import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import  java.util.Set;
import java.util.List;


public class StudentDetails {


    Collection<String> studentDetail1 = new ArrayList<>();

    public void add1(String object) {
        System.out.println("Please enter a student name: ");
        studentDetail1 .add(object);
        System.out.println(studentDetail1);
    }

    public void remove1(String object) {
        System.out.println("Remove name");
        studentDetail1 .remove(object);

        System.out.println("Object is being removed");
        System.out.println(studentDetail1 );
    }


    public String find1(String object) {
        System.out.println("student name check");
        if (studentDetail1 .contains(object)) {

            System.out.println("Student Exist" + object);
        } else {
            System.out.println("No Results");
        }
        return object;
    }





    Set <String> studentDetail2 = new HashSet<>();

        public void add2(String name) {
            studentDetail2.add(name);
            System.out.println(studentDetail2);
        }



        public void remove2(String object) {
        studentDetail2.remove(object);
        System.out.println(studentDetail2);
         }


        public String find2(String object) {
            studentDetail2.contains(object);
            System.out.println(studentDetail2);
            return object;
         }



    List<String> studentDetail3 = new ArrayList<>();

        public void add3(String name) {
            studentDetail3.add(name);
            System.out.println(studentDetail3);
        }

    public void remove3(String object) {
        studentDetail3.remove(object);
        System.out.println(studentDetail3);
    }


    public String find3(String object) {
            studentDetail3.contains(object);
            System.out.println(studentDetail3);
            return object;
        }


    Map studentDetail4 = new HashMap();

    public void add4(int index, String value) {
        studentDetail4.put(index, value);

        System.out.println(studentDetail4);
    }

    public void find4(int index) {
        System.out.println("===Search");
        try {
            studentDetail4.get(index);
            System.out.println("Finding....");
            System.out.println(index);

        } catch (Exception e) {
            System.out.println("No results");
        }


        System.out.println(studentDetail4.get(index)+" was found ");

    }

    public void delete4(String object) {
        System.out.println("===Removed===");
        studentDetail4.remove(object);
        System.out.println("===object has been removed");
        System.out.println(studentDetail4);
    }




}
