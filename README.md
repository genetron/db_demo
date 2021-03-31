# Rdbms and Nosql embedded servers in single application

There are two embedded servers. H2 for rdbms and flapdoodle for embedded mongo.

## **How to use**

1. Start the server.
2. Use endpoint : http://localhost:8080/rdbms/version for using h2 embedded server. This API will save a hardcoded response in db and retrieve it back using Spring data JPA.
3. Use Endpoint : http://localhost:8080/nosql/version for using embedded mongo. This API will save a hardcoded response in db and retrieve it back using Spring data MongoDB.
