package za.co.wethinkcode.service;

import za.co.wethinkcode.model.Coworker;
import za.co.wethinkcode.model.Employee;
import za.co.wethinkcode.brownfield.LegacyDoorSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class WorkspaceManager {

    // TODO: declare private fields
    private final List<Coworker> coworkers;
    private final List<Employee> employees;
    private final LegacyDoorSystem doorSystem;
    private final String hubName;

    // TODO: implement constructor
    public WorkspaceManager(String hubName) {
        this.hubName = hubName;
        this.coworkers = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.doorSystem = new LegacyDoorSystem();
    }

    // TODO: implement coworker management methods
    public void addCoworker(Coworker coworker) {
        coworkers.add(coworker);
    }

    // TODO: implement employee management methods

    // TODO: implement calculateTotalRevenue()

    // TODO: implement printAllRoles()

    // TODO: implement hubName()

}
