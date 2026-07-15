package za.co.wethinkcode;

import za.co.wethinkcode.model.*;
import za.co.wethinkcode.service.WorkspaceManager;

public class Main {

    public static void main(String[] args) {

        WorkspaceManager hub = new WorkspaceManager("Jozi Tech Hub");

        hub.registerCoworker(new DayPassCoworker("John", "Doe", "john@email.com", "C001"));
        hub.registerCoworker(new ResidentCoworker("Jane", "Smith", "jane@email.com", "C002", "Desk-42"));

        hub.registerEmployee(new CommunityManager("Alice", "Dlamini", "alice@hub.com", "E001", 160));

        System.out.println("=== " + hub.hubName() + " ===");
        System.out.println("\n-- All Roles --");
        hub.printAllRoles();

        System.out.println("\nTotal monthly revenue: R" + hub.calculateTotalRevenue());
    }
}
