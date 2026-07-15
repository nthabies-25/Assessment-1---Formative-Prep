#!/bin/bash

echo "🚀 Scaffolding WeThinkCode Maven Architecture..."

# Create the main source directories
mkdir -p src/main/java/za/co/wethinkcode/model
mkdir -p src/main/java/za/co/wethinkcode/service
mkdir -p src/main/java/za/co/wethinkcode/brownfield

# Create the test directories
mkdir -p src/test/java/za/co/wethinkcode

# Create the pom.xml and Main.java
touch pom.xml
touch src/main/java/za/co/wethinkcode/Main.java

# Create Model classes
touch src/main/java/za/co/wethinkcode/model/HubUser.java
touch src/main/java/za/co/wethinkcode/model/Coworker.java
touch src/main/java/za/co/wethinkcode/model/DayPassCoworker.java
touch src/main/java/za/co/wethinkcode/model/ResidentCoworker.java
touch src/main/java/za/co/wethinkcode/model/Employee.java
touch src/main/java/za/co/wethinkcode/model/CommunityManager.java

# Create Brownfields class
touch src/main/java/za/co/wethinkcode/brownfield/LegacyDoorSystem.java

# Create Service class
touch src/main/java/za/co/wethinkcode/service/WorkspaceManager.java

# Create Test classes
touch src/test/java/za/co/wethinkcode/HubUserTest.java
touch src/test/java/za/co/wethinkcode/WorkspaceManagerTest.java

# Create answers file for theory
touch answers.txt

echo "✅ WeThinkCode Maven Architecture Scaffolding Complete!"