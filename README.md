# cucumberJvm
Practice automation testing using cucumber JVM

Run test as Maven Build using configuration below+
  Base directory: ${project_loc:CucumberBdd}
  Goals: clean install -Dcucumber.options="--tags @BookHotel,@CreateCustomer"
