# 🏢 Tech Hub Workspace System — Java OOP Practice

## Overview
In this assessment, you will design a management system for a modern tech co-working space. The system manages two branches of people: **Coworkers** (people who pay to use the space) and **Employees** (people who run the space), through a shared class hierarchy rooted at `HubUser`.

You will also interact with a **Brownfields** legacy system (`LegacyDoorSystem`) to grant access to users.

### Class Hierarchy
HubUser  (abstract)
 ├── Coworker  (abstract)
 │   ├── DayPassCoworker
 │   └── ResidentCoworker
 └── Employee  (abstract)
     └── CommunityManager

### Implementation Steps

#### Step 1 — Implement `HubUser` (Abstract)
*   **Fields:** `firstName` (String, immutable), `lastName` (String, immutable), `email` (String, private).
*   **Methods:** Getters for all fields, setter for email. `fullName()` returns first and last name. `role()` is abstract.

#### Step 2 — Implement `Coworker` (Abstract)
*   **Extends:** `HubUser`
*   **Fields:** `coworkerId` (String, immutable), `isActive` (boolean, defaults to true).
*   **Methods:** Getters/setters for active status. `monthlyRate()` and `deskType()` are abstract.

#### Step 3 — Implement `DayPassCoworker` & `ResidentCoworker`
*   **DayPassCoworker:** Rate is R250.00. Desk type is "Hot Desk in Open Area". Role is "Day Pass User".
*   **ResidentCoworker:** Rate is R3500.00. Has an extra immutable field `deskNumber` (String). Desk type is "Dedicated Desk: " + deskNumber. Role is "Resident".

#### Step 4 — Implement `Employee` & `CommunityManager`
*   **Employee (Abstract):** Extends `HubUser`. Fields: `employeeId` (String), `hoursWorked` (int). `calculatePay()` is abstract.
*   **CommunityManager:** Extends `Employee`. Hourly rate is R150.00. Pay is `hoursWorked * 150.00`. Role is "Community Manager".

#### Step 5 — The Brownfields Integration
*   The package `za.co.wethinkcode.brownfield` contains a pre-written class `LegacyDoorSystem` that you must not modify.
*   In `WorkspaceManager`, when you add a Coworker, you must call the legacy system to generate an access badge.

## Comprehension Questions (Answer in `answers.txt`)
**Question 1: OOP Pillars (10 marks)**
Identify one place in your code where you used Polymorphism and one place where you used Encapsulation. Explain why they were used.

**Question 2: Testing & TDD (10 marks)**
Explain the Red-Green-Refactor cycle. Why is it beneficial to write the test *before* the implementation?

**Question 3: Brownfields Engineering (10 marks)**
You had to integrate `LegacyDoorSystem` without modifying it. Explain what a Brownfields project is, and why developers often have to wrap or adapt legacy code rather than deleting and rewriting it.

**Question 4: Agile Methodology (10 marks)**
During an Agile Sprint, what is the purpose of the Daily Stand-up? What are the three questions every team member should answer?

**Question 5: Systems Design (10 marks)**
If this Workspace System grew to manage 500 locations globally, a single server would crash (Vertical Scaling limit). Explain the concept of Horizontal Scaling and how a Load Balancer would help solve this problem.