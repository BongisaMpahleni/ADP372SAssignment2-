import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.collection.IsMapContaining;


class StudentDetailsTest {
    private StudentDetails studentDetails;


    @BeforeEach
    void setUp() {
        studentDetails = new StudentDetails();
    }


    // Add,Remove and Find Test for Collection
    @Test
    void add1() {

        studentDetails.add1("bongisa");
        assertTrue(studentDetails.studentDetail1.containsAll(Arrays.asList("bongisa")));

        //assertNotNull(studentDetails.studentDetail1);
        //assertFalse(studentDetails.studentDetail1.isEmpty());
    }

    @Test
    void remove1() {

        studentDetails.remove1("");

        assertTrue(studentDetails.studentDetail1.isEmpty());


    }


    @Test
    void find1() {
        studentDetails.find1("bongisa");
        assertFalse(studentDetails.studentDetail1.containsAll(Arrays.asList("bongisa")));

    }


    // Add,Remove and Find Test for Set
    @Test
    void add2() {
        studentDetails.add2("bongisa");
        assertTrue(studentDetails.studentDetail2.containsAll(Arrays.asList("bongisa")));
    }

    @Test
    void remove2() {

        studentDetails.remove2("");
        assertTrue(studentDetails.studentDetail2.isEmpty());
    }

    @Test
    void find2() {
        studentDetails.find2("bongisa");
        assertFalse(studentDetails.studentDetail2.containsAll(Arrays.asList("bongisa")));
    }


    // Add,Remove and Find Test for List
    @Test
    void add3() {
        studentDetails.add3("bongisa");
        assertTrue(studentDetails.studentDetail3.containsAll(Arrays.asList("bongisa")));
    }

    @Test
    void remove3() {

        studentDetails.remove3("bongisa");
        assertTrue(studentDetails.studentDetail3.isEmpty());
    }


    @Test
    void find3() {
        studentDetails.find3("bongisa");
        assertFalse(studentDetails.studentDetail3.containsAll(Arrays.asList("bongisa")));
    }


    // Add,Remove and Find Test for Map

    @Test
    void add4() {
        studentDetails.add4("0","bora");
        assertThat(studentDetails.studentDetail4, IsMapContaining.hasEntry("0", "bora"));
    }

    @Test
    void remove4() {
        studentDetails.remove4();
        assertNotNull(studentDetails.studentDetail4);
        assertTrue(studentDetails.studentDetail4.isEmpty());
    }

    @Test
    void find4() {
        studentDetails.find4("0", "bora");
        assertThat(studentDetails.studentDetail4, not(IsMapContaining.hasEntry("0", "bora")));
    }


}