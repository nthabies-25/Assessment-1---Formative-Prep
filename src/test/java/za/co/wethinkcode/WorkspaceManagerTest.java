package za.co.wethinkcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.wethinkcode.model.*;
import za.co.wethinkcode.service.WorkspaceManager;

import static org.junit.jupiter.api.Assertions.*;

class WorkspaceManagerTest {

    private WorkspaceManager manager;
    private DayPassCoworker dayPass;
    private ResidentCoworker resident;

    @BeforeEach
    void setUp() {
        manager = new WorkspaceManager("Jozi Tech Hub");
        dayPass = new DayPassCoworker("John", "Doe", "john@email.com", "C001");
        resident = new ResidentCoworker("Jane", "Smith", "jane@email.com", "C002", "Desk-42");
    }

    @Test
    void revenueCalculatesCorrectly() {
        manager.registerCoworker(dayPass);
        manager.registerCoworker(resident);
        assertEquals(3750.00, manager.calculateTotalRevenue(), 0.001);
    }

    @Test
    void inactiveCoworkersExcludedFromRevenue() {
        resident.setActive(false);
        manager.registerCoworker(dayPass);
        manager.registerCoworker(resident);
        assertEquals(250.00, manager.calculateTotalRevenue(), 0.001);
    }
}
