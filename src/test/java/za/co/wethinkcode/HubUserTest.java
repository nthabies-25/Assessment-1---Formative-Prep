package za.co.wethinkcode;

import za.co.wethinkcode.model.DayPassCoworker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HubUserTest {

    private DayPassCoworker user;

    @BeforeEach
    void setUp() {
        user = new DayPassCoworker("John", "Doe", "john@email.com", "C001");
    }

    @Test
    void constructorSetsAllFields() {
        assertEquals("John", user.firstName());
        assertEquals("Doe", user.lastName());
        assertEquals("john@email.com", user.email());
    }

    @Test
    void getFullNameReturnsCombinedName() {
        assertEquals("John Doe", user.fullName());
    }
}
