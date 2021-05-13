import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    }

    @Test
    void find1() {
        studentDetails.find1("bongisa");

    }

    @Test
    void remove1() {

       studentDetails.remove1("");
    }


    // Add,Remove and Find Test for Set
    @Test
    void add2() {
        studentDetails.add2("bongisa");
    }

    @Test
    void find2() {
        studentDetails.find2("bongisa");
    }

    @Test
    void remove2() {

        studentDetails.remove2("");
    }


    // Add,Remove and Find Test for List
    @Test
    void add3() {
        studentDetails.add3("bongisa");
    }

    @Test
    void find3() {
        studentDetails.find3("bongisa");
    }

    @Test
    void remove3() {

        studentDetails.remove3("bongisa");
    }


    // Add,Remove and Find Test for Map

    @Test
    void add4() {
        studentDetails.add4(0,"bora");
    }

    @Test
    void find4() {
        studentDetails.find4(0);
    }

    @Test
    void delete4() {
        studentDetails.delete4("");
    }
}