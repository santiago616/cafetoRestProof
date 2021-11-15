# cafetoRestProof
This is a concept proof about REST with JAX-RS to Cafeto 

In this project you can find all the requirements requested for the evaluation test

Requirements
-Build a webapp in any servlet container (preferably Tomcat).
-Write a build script in maven or gradle (preferably Gradle) to create a war file.
-The web application must be executed from the war file.
-Have a REST endpoint using an implementation of JAX-RS (preferably Jersey, but spring is also an option) that returns HTTP status code 200 if
a system property is set to true, or HTTP status code 404 otherwise.
-Write unit tests for the new REST endpoint.
-Deliver the project in a source control repository, preferably a local git folder. Github is not recommended in this case, we'd rather don't make your
results public.


The war has been created in maven
The war run in Tomcat
You can found the war in this route "CafetoRest\target"
You can go the end point with the nex request "http://localhost:8080/cafetorest/rest/service/proof/santiago" to get a 200 Status OK or "http://localhost:8080/cafetorest/rest/service/proof/andres" to get a 404 Status no found.



