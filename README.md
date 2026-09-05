# Mini Hospital Emergency System

## 1. Project Title

**Mini Hospital Emergency System**

---

## 2. Project Description

The **Mini Hospital Emergency System** is a console-based Java application developed to demonstrate the practical use of different data structures in a hospital environment.

The system provides basic functionality for managing patients, emergency patients, treatment records, and patient visit history.

The project is implemented using **Java 21** and developed in **Eclipse IDE**.

Different data structures are used for different hospital management requirements:

* **Binary Search Tree** – Patient management
* **Queue** – Emergency patient management
* **Stack** – Treatment record management
* **Linked List** – Patient visit history

The project also includes a test file to verify the functionality of the main data structures and operations.

---

# 3. Objectives

The main objectives of this project are:

1. To develop a simple hospital management system using Java.
2. To demonstrate the practical use of data structures.
3. To implement a Binary Search Tree for patient management.
4. To implement a Queue for emergency patient management.
5. To implement a Stack for treatment records.
6. To implement a Linked List for patient visit history.
7. To apply object-oriented programming concepts.
8. To provide meaningful Git commits during development.
9. To create a test program to verify system functionality.
10. To develop and run the project using Eclipse IDE.

---

# 4. Technologies Used

The following technologies and tools are used in this project.

| Technology / Tool                  | Purpose                   |
| ---------------------------------- | ------------------------- |
| Java 21                            | Main programming language |
| Eclipse IDE                        | Development environment   |
| Git                                | Version control           |
| GitHub                             | Repository hosting        |
| Java Collections / Data Structures | Data management           |
| Console                            | User interface            |

---

# 5. Package Name

The Java package used in this project is:

```java
package hospital;
```

All main Java classes are located inside the `hospital` package.

---

# 6. Data Structures

The project demonstrates four major data structures.

```text
+------------------------+
| Mini Hospital System   |
+------------------------+
           |
     +-----+-----+---------+----------+
     |           |         |          |
     v           v         v          v
    BST        Queue      Stack    Linked List
     |           |         |          |
     v           v         v          v
 Patients    Emergency  Treatment   Visit
             Patients    Records     History
```

Each data structure has a specific purpose.

---

# 7. Binary Search Tree

## Purpose

The **Binary Search Tree (BST)** is used to manage patient records.

The class responsible for this functionality is:

```text
PatientBST.java
```

Patients are organized using their patient ID.

For example:

```text
              100
             /   \
           50     150
          / \     / \
        25  75  125 175
```

Each patient ID is placed according to the Binary Search Tree rules.

## Operations

The Patient BST supports:

* Insert
* Search
* Delete
* Display

### Insert

Adds a new patient into the Binary Search Tree.

Example:

```text
Patient ID: 100
```

The patient is inserted into the correct position.

### Search

Searches for a patient using the patient ID.

Example:

```text
Search Patient ID: 100
```

The tree is traversed until the patient is found or determined not to exist.

### Delete

Removes a patient from the Binary Search Tree.

Example:

```text
Delete Patient ID: 100
```

The tree is rearranged if necessary after deletion.

### Display

The patients can be displayed using **in-order traversal**.

The traversal follows:

```text
Left → Root → Right
```

This allows patients to be displayed in ascending order of patient ID.

---

# 8. Queue

## Purpose

The **Queue** is used to manage emergency patients.

The class responsible for this functionality is:

```text
EmergencyQueue.java
```

The Queue follows the principle:

```text
FIFO
First In, First Out
```

This means that the patient who enters the emergency queue first will be treated first.

Example:

```text
Patient 101 → Patient 102 → Patient 103
     ↑
  First patient
```

After treating Patient 101:

```text
Patient 102 → Patient 103
```

## Operations

The Emergency Queue supports:

* Enqueue
* Dequeue
* Display
* Check if empty

### Enqueue

Adds an emergency patient to the end of the queue.

### Dequeue

Removes the patient at the front of the queue.

### Display

Displays all patients currently waiting for emergency treatment.

### Empty Check

Checks whether there are currently any patients waiting.

---

# 9. Stack

## Purpose

The **Stack** is used to manage treatment records.

The class responsible for this functionality is:

```text
TreatmentStack.java
```

The Stack follows:

```text
LIFO
Last In, First Out
```

This means that the most recently added treatment record is removed first.

Example:

```text
Treatment 3  ← Top
Treatment 2
Treatment 1
```

If a treatment is removed, Treatment 3 is removed first.

## Operations

The Treatment Stack supports:

* Push
* Pop
* Display
* Check if empty

### Push

Adds a new treatment record to the stack.

### Pop

Removes the most recently added treatment record.

### Display

Displays treatment records stored in the stack.

### Empty Check

Checks whether the stack contains any treatment records.

---

# 10. Linked List

## Purpose

The **Linked List** is used to maintain patient visit history.

The class responsible for this functionality is:

```text
VisitHistory.java
```

A linked list connects records together.

Example:

```text
Visit 1 → Visit 2 → Visit 3 → null
```

Each visit can contain information such as:

* Patient ID
* Visit date
* Reason for visit
* Other visit details

## Operations

The Visit History supports:

* Add visit
* Search visit
* Remove visit
* Display visit history

### Add Visit

Adds a new visit to a patient's history.

### Search Visit

Searches for a particular visit.

### Remove Visit

Removes a visit from the linked list.

### Display

Displays the patient's visit history.

---

# 11. Object-Oriented Programming

The project also demonstrates important Object-Oriented Programming concepts.

## Classes and Objects

The system is divided into different classes.

Examples:

```text
Patient
Visit
TreatmentRecord
PatientBST
EmergencyQueue
TreatmentStack
VisitHistory
```

Objects are created from these classes to represent real hospital data.

## Encapsulation

Patient information and other records are kept inside their respective classes.

For example:

```text
Patient
 ├── patientId
 ├── name
 ├── age
 ├── contact
 └── condition
```

Methods are used to access or modify the information.

## Separation of Responsibilities

Each class has a specific responsibility.

For example:

```text
Patient.java
    ↓
Stores patient information

PatientBST.java
    ↓
Manages patients

EmergencyQueue.java
    ↓
Manages emergency patients

TreatmentStack.java
    ↓
Manages treatments

VisitHistory.java
    ↓
Manages visits
```

This makes the project easier to understand and maintain.

---

# 12. Project Structure

The Eclipse project has the following structure:

```text
MiniHospitalEmergencySystem
│
├── src
│   │
│   ├── module-info.java
│   │
│   └── hospital
│       │
│       ├── Main.java
│       ├── Patient.java
│       ├── PatientBST.java
│       ├── EmergencyQueue.java
│       ├── TreatmentRecord.java
│       ├── TreatmentStack.java
│       ├── Visit.java
│       ├── VisitHistory.java
│       └── HospitalTest.java
│
├── .classpath
└── .project
```

---

# 13. Class Descriptions

## Main.java

`Main.java` is the main entry point of the application.

It provides the menu and allows the user to select different hospital operations.

The main program connects the different data structures together.

---

## Patient.java

`Patient.java` represents a patient.

It contains patient-related information such as:

```text
Patient ID
Name
Age
Contact
Medical Condition
```

---

## PatientBST.java

`PatientBST.java` implements the Binary Search Tree used for patient management.

Main operations include:

```text
Insert
Search
Delete
Display
```

---

## EmergencyQueue.java

`EmergencyQueue.java` manages emergency patients using a Queue.

Main operations include:

```text
Enqueue
Dequeue
Display
isEmpty
```

---

## TreatmentRecord.java

`TreatmentRecord.java` represents a treatment record.

It stores information related to treatment provided to a patient.

---

## TreatmentStack.java

`TreatmentStack.java` manages treatment records using a Stack.

Main operations include:

```text
Push
Pop
Display
isEmpty
```

---

## Visit.java

`Visit.java` represents a hospital visit.

It contains information related to a patient's visit.

---

## VisitHistory.java

`VisitHistory.java` maintains patient visit records using a Linked List.

Main operations include:

```text
Add
Search
Remove
Display
```

---

## HospitalTest.java

`HospitalTest.java` is the test program for the project.

It is used to check whether the main data structure operations work correctly.

---

# 14. Main System Features

The system provides the following major features.

## Patient Management

```text
1. Register Patient
2. Search Patient
3. Delete Patient
4. Display All Patients
```

## Emergency Management

```text
5. Add Emergency Patient
6. Treat Next Patient
7. Display Emergency Queue
```

## Treatment Management

```text
8. Add Treatment Record
9. Remove Latest Treatment
10. Display Treatment History
```

## Visit Management

```text
11. Add Patient Visit
12. Search Patient Visit
13. Remove Patient Visit
14. Display Patient Visit History
```

## Exit

```text
0. Exit
```

---

# 15. Main Menu

When the application starts, the following menu is displayed:

```text
========================================
      MINI HOSPITAL EMERGENCY SYSTEM
========================================

1. Register Patient
2. Search Patient
3. Delete Patient
4. Display All Patients

5. Add Emergency Patient
6. Treat Next Patient
7. Display Emergency Queue

8. Add Treatment Record
9. Remove Latest Treatment
10. Display Treatment History

11. Add Patient Visit
12. Search Patient Visit
13. Remove Patient Visit
14. Display Patient Visit History

0. Exit

Enter your choice:
```

The user enters a number to select an operation.

---

# 16. Example Patient

A patient can contain information such as:

```text
Patient ID: 101
Name: Kamal
Age: 35
Contact: 0712345678
Medical Condition: Fever
```

The patient is then stored in the Patient Binary Search Tree.

---

# 17. Example Emergency Queue

Suppose three patients arrive for emergency treatment:

```text
Patient 101
Patient 102
Patient 103
```

They are stored as:

```text
Front
  ↓
Patient 101 → Patient 102 → Patient 103
                                      ↑
                                     Rear
```

Patient 101 will be treated first.

After treatment:

```text
Front
  ↓
Patient 102 → Patient 103
```

---

# 18. Example Treatment Stack

Suppose the following treatments are added:

```text
Treatment 1
Treatment 2
Treatment 3
```

The stack becomes:

```text
Top
 ↓
Treatment 3
Treatment 2
Treatment 1
```

When the latest treatment is removed:

```text
Treatment 3
```

is removed first.

---

# 19. Example Visit History

A patient can have several visits.

Example:

```text
Patient ID: 101

Visit 1: Fever
Visit 2: Follow-up
Visit 3: General Checkup
```

The linked list can represent this as:

```text
Visit 1 → Visit 2 → Visit 3 → null
```

---

# 20. How to Run the Project in Eclipse

## Step 1: Open Eclipse

Start Eclipse IDE.

## Step 2: Import the Project

Select:

```text
File
 ↓
Import
 ↓
Existing Projects into Workspace
```

Select the project folder.

## Step 3: Check Java Version

Make sure the project uses:

```text
Java 21
```

## Step 4: Open Main.java

Navigate to:

```text
src
 └── hospital
      └── Main.java
```

## Step 5: Run the Application

Right-click:

```text
Main.java
```

Then select:

```text
Run As
    ↓
Java Application
```

The application will start in the Eclipse Console.

---

# 21. How to Run the Test File

Open:

```text
src
 └── hospital
      └── HospitalTest.java
```

Right-click the file and select:

```text
Run As
    ↓
Java Application
```

The test results will appear in the Eclipse Console.

---

# 22. Testing

Testing is included to verify the main operations of the system.

The test program checks:

### Patient BST

* Patient insertion
* Patient search
* Patient deletion
* Patient display

### Emergency Queue

* Adding patients
* Removing patients
* Displaying the queue
* Empty queue handling

### Treatment Stack

* Adding treatments
* Removing treatments
* Displaying treatments
* Empty stack handling

### Visit History

* Adding visits
* Searching visits
* Removing visits
* Displaying visit history

---

# 23. Example Test Results

A successful test can produce output similar to:

```text
===== Hospital System Tests =====

Testing Patient BST...
PASS - Patient inserted
PASS - Patient found
PASS - Non-existing patient not found
PASS - Patient deleted

Testing Emergency Queue...
PASS - Patient added to queue
PASS - First patient treated correctly

Testing Treatment Stack...
PASS - Treatment added
PASS - Latest treatment removed correctly

Testing Visit History...
PASS - Visit added
PASS - Visit found
PASS - Visit removed

===== All Tests Completed =====
```

The exact output depends on the implementation of the test file.

---

# 24. Git Version Control

Git is used to manage the development history of the project.

Instead of making one large commit containing the entire application, the project is divided into meaningful development steps.

This makes it easier to identify when each feature was added.

---

# 25. Meaningful Git Commits

Example commit history:

```text
1. Implement patient model
2. Add patient BST insertion
3. Add BST search and traversal
4. Implement BST deletion
5. Create emergency queue
6. Add emergency enqueue operation
7. Add queue dequeue and display
8. Create treatment record model
9. Implement treatment stack
10. Add treatment pop and display
11. Create patient visit model
12. Implement visit history linked list
13. Add visit search and removal
14. Create hospital main menu
15. Integrate hospital management operations
16. Add hospital test file
17. Update README documentation
```

Each commit represents a meaningful change to the project.

---

# 26. Why Meaningful Commits Are Important

Meaningful commits provide a clear development history.

For example:

```text
Patient Model
      ↓
BST
      ↓
Emergency Queue
      ↓
Treatment Stack
      ↓
Visit History
      ↓
Main Menu
      ↓
Testing
      ↓
Documentation
```

A lecturer can use the Git history to see how the project was developed.

Good commit messages describe **what was changed**.

Example:

```text
Add patient BST search
```

This is better than:

```text
Update files
```

because it clearly explains the change.

---

# 27. System Workflow

The general workflow of the system is:

```text
              Start
                |
                v
          Display Menu
                |
       +--------+--------+
       |        |        |
       v        v        v
   Patients  Emergency  Treatment
       |        |        |
       v        v        v
      BST     Queue     Stack
       |
       v
 Visit History
 Linked List
       |
       v
   Continue?
    /      \
  Yes       No
   |         |
   +----<    v
           Exit
```

---

# 28. Patient Workflow

```text
Enter Patient Details
        |
        v
Create Patient Object
        |
        v
Insert into Patient BST
        |
        v
Patient Stored
```

For searching:

```text
Enter Patient ID
        |
        v
Search Patient BST
        |
   +----+----+
   |         |
 Found     Not Found
   |         |
   v         v
Display    Display
Patient    Error
```

---

# 29. Emergency Workflow

```text
Emergency Patient Arrives
          |
          v
Add to Queue
          |
          v
Wait for Treatment
          |
          v
Dequeue First Patient
          |
          v
Treat Patient
```

This follows FIFO.

---

# 30. Treatment Workflow

```text
Treatment Created
       |
       v
Push to Stack
       |
       v
Treatment Stored
       |
       v
Remove Latest Treatment
       |
       v
Pop from Stack
```

This follows LIFO.

---

# 31. Visit Workflow

```text
Patient Visit
     |
     v
Create Visit
     |
     v
Add to Linked List
     |
     +----------+
     |          |
     v          v
   Search     Remove
     |          |
     +----------+
          |
          v
      Display
```

---

# 32. Advantages

The project has several advantages.

### Easy to Understand

The console-based menu is simple and straightforward.

### Demonstrates Data Structures

The project demonstrates four important data structures:

```text
BST
Queue
Stack
Linked List
```

### Modular Design

Different responsibilities are separated into different classes.

### Easy to Test

The project includes a dedicated test file.

### Git History

Meaningful commits provide a clear development history.

### Educational Value

The project demonstrates how theoretical data structures can be applied to a real-world scenario.

---

# 33. Limitations

The current system is a small educational project and has some limitations.

### No Database

Patient information is stored in memory.

When the application closes, the data is lost.

### No Graphical User Interface

The system currently uses the console.

### No Authentication

There is no login system for doctors, nurses, or administrators.

### No Online Access

The system is not connected to an online server.

### No Multi-user Support

Multiple users cannot access the system simultaneously.

### Limited Validation

More advanced input validation could be added.

---

# 34. Future Improvements

The system can be improved in the future by adding:

## Database

A database such as MySQL could be used to permanently store:

* Patient information
* Treatments
* Visits
* Appointments

## Graphical User Interface

JavaFX could be used to create a graphical interface.

## Doctor Management

The system could manage:

* Doctor details
* Specializations
* Doctor availability

## Appointment Management

Patients could book appointments with doctors.

## Billing System

The system could calculate and store patient bills.

## Authentication

Different users could have different access levels.

For example:

```text
Administrator
Doctor
Nurse
Receptionist
```

## Automated Testing

JUnit could be added for more comprehensive automated tests.

---

# 35. Security Considerations

If this system were developed for real hospital use, additional security would be required.

Possible security features include:

* User authentication
* Password protection
* Role-based access
* Data encryption
* Secure database storage
* Audit logs
* Access control

The current project is intended for educational purposes and should not be used as a production hospital information system.

---

# 36. Performance Considerations

Different data structures provide different performance characteristics.

## Binary Search Tree

Searching can be efficient when the tree is reasonably balanced.

Average-case search complexity:

```text
O(log n)
```

However, an unbalanced BST can become:

```text
O(n)
```

## Queue

Adding and removing elements can be performed efficiently.

Typical operations:

```text
Enqueue → O(1)
Dequeue → O(1)
```

## Stack

Typical operations:

```text
Push → O(1)
Pop  → O(1)
```

## Linked List

Adding or removing nodes can be efficient when the required position/node is already known.

Searching generally requires traversing the list:

```text
O(n)
```

---

# 37. Error Handling

The system should handle invalid situations such as:

* Searching for a patient that does not exist
* Deleting a patient that does not exist
* Treating a patient when the emergency queue is empty
* Removing a treatment when the stack is empty
* Searching for a visit that does not exist
* Removing a visit that does not exist
* Entering an invalid menu option

The application should display suitable messages instead of terminating unexpectedly.

---

# 38. Example Error Messages

Examples include:

```text
Patient not found.
```

```text
Emergency queue is empty.
```

```text
No treatment records available.
```

```text
Visit not found.
```

```text
Invalid menu option.
```

These messages help the user understand what happened.

---

# 39. Educational Concepts Demonstrated

This project demonstrates the following programming concepts:

* Java programming
* Classes and objects
* Encapsulation
* Methods
* Constructors
* Object-oriented programming
* Binary Search Tree
* Queue
* Stack
* Linked List
* Searching
* Insertion
* Deletion
* Traversal
* Exception/error handling
* Testing
* Git version control
* Meaningful commits
* Eclipse project development

---

# 40. Project Architecture

The project can be viewed as several layers of responsibility.

```text
+-----------------------------------+
|           Main.java               |
|       User Interface/Menu         |
+----------------+------------------+
                 |
                 v
+-----------------------------------+
|       Hospital Data Structures    |
+-----------------------------------+
| PatientBST                        |
| EmergencyQueue                    |
| TreatmentStack                    |
| VisitHistory                      |
+-----------------------------------+
                 |
                 v
+-----------------------------------+
|             Models                |
+-----------------------------------+
| Patient                           |
| TreatmentRecord                   |
| Visit                             |
+-----------------------------------+
```

This structure keeps the application organized.

---

# 41. Example Complete System Scenario

A typical hospital scenario can work as follows.

### Step 1: Register Patient

The receptionist enters:

```text
Patient ID: 101
Name: Kamal
Age: 35
Contact: 0712345678
Condition: Fever
```

The patient is stored in the BST.

### Step 2: Add Emergency Patient

If the patient requires emergency treatment, the patient is added to the emergency queue.

```text
Patient 101
```

### Step 3: Treat Patient

The first patient in the queue is removed and treated.

### Step 4: Add Treatment

A treatment record is added to the treatment stack.

```text
Treatment: Fever medication
```

### Step 5: Add Visit

The patient's visit is stored in the visit history.

```text
Date: 2026-09-05
Reason: Fever
```

The system can later search or display the patient's visit history.

---

# 42. Testing Strategy

The testing strategy focuses on testing individual operations.

## BST Tests

```text
Insert patient
Search existing patient
Search non-existing patient
Delete existing patient
Delete non-existing patient
Display patients
```

## Queue Tests

```text
Add patient
Remove patient
Check empty queue
Display queue
```

## Stack Tests

```text
Add treatment
Remove treatment
Check empty stack
Display treatments
```

## Linked List Tests

```text
Add visit
Search visit
Remove visit
Display visits
```

This helps verify that each data structure behaves as expected.

---

# 43. Project Requirements

To run the project, the computer should have:

```text
JDK 21
Eclipse IDE
```

Git is recommended if the project is being submitted through GitHub.

---

# 44. Recommended Eclipse Configuration

The project should use:

```text
Java Compiler: Java 21
JRE System Library: JavaSE-21
```

The source files should be located under:

```text
src/hospital
```

and should contain:

```java
package hospital;
```

---

# 45. Conclusion

The **Mini Hospital Emergency System** is a Java-based educational project that demonstrates how data structures can be applied to a real-world hospital scenario.

The system uses different data structures according to the requirements of each operation:

```text
Binary Search Tree
        ↓
Patient Management


Queue
        ↓
Emergency Patient Management


Stack
        ↓
Treatment Records


Linked List
        ↓
Patient Visit History
```

The project also demonstrates object-oriented programming, testing, Eclipse development, and Git version control.

The use of meaningful commits provides a clear development history and makes it easier to understand how the application was built.

Overall, the project provides a practical demonstration of how fundamental computer science concepts can be combined to create a simple hospital management application.

---

# 46. Author

**Mini Hospital Emergency System**

Java Data Structures Project

**Package:**

```text
hospital
```

**Java Version:**

```text
Java 21
```

**Development Environment:**

```text
Eclipse IDE
```

---

# 47. License

This project is developed for **educational and academic purposes**.

It may be modified and extended for learning purposes.
