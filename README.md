# PROYECTO SPRINGBOOT

## EJERCICIO

mvn clean install

Ejecutar el proyecto desde

`src/main/java/org/example/restservice/RestServiceApplication.java`

### Parte GET

En un navegador ir a http://localhost:8080/greeting y obtendrá la respuesta

`{"id":1,"content":"Hello, World!"}`

Si va a http://localhost:8080/greeting?name=User obtendrá la respuesta

`{"id":2,"content":"Hello, User!"}`

### Parte POST

Si ejecuta un curl (o utiliza un postman así:

`curl -X POST http://localhost:8080/greeting/add --data {}`

Obtendrá una respuesta

`{"id":1,"content":"Bienvenido parcero"}`

## REFERENCIAS

La parte GET se tomó de https://spring.io/guides/gs/rest-service/

La parte POST fue invención para resolver el ejercicio