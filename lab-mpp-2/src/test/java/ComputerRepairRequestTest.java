import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class ComputerRepairRequestTest {
    
    @Test
    @DisplayName("Test 1")
    public void test1(){
        ComputerRepairRequest request = new ComputerRepairRequest();
        assertEquals("", request.getOwnerName());
        request.setOwnerName("cheia1");
        assertEquals("cheia1", request.getOwnerName());
    }

    @Test
    @DisplayName("Test 2")
    public void test2(){
        assertEquals(100, 100, "Numere egale");
        assertNotEquals(100, 101, "Numbere inegale");
    }
      
}
