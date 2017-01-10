# rest-api-schema
Basic springboot project to create REST APIs using JSON schema and Spring Data.
# Usage

* clone this repo.
 
``` git clone https://github.com/sashajo/rest-api-schema.git ```


* Create json schema. You can use http://jsonschema.net/#/ to generate json schema using json object.
* Copy schema to a project <PROJECT_DIR>/src/main/resources/schemas
* Add entity object . See Asset.java.
* Add Repository Interface. see AssetRepo.java
* Build project
``` ./mvnw clean install ```
* Start mongo db locally
* run application
```java -jar target/demo2-0.0.1-SNAPSHOT.jar```

Access hal browser http://localhost:8080/browser/

Enjoy!
