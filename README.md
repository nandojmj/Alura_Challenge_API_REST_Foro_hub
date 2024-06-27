# Open Challenge Backend ONE - API REST Foro Hub
 ***ONE | Fase 3 - Especialización Back-End  G6 Alura - Oracle Next Education***

[![Alura Latam](https://img.shields.io/badge/Alura-Latam-blue?style=flat)](https://www.aluracursos.com/)
[![Static Badge](https://img.shields.io/badge/ONE-Oracle_Next_Education-orange?style=flat&logo=oracle&logoColor=orange)](https://www.oracle.com/co/education/oracle-next-education/) [![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) [![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Spring_Boot-%236DB33F?logo=Spring&logoColor=white)](#) [![Static Badge](https://img.shields.io/badge/MySQL-RDBMS-%234479A1?logo=mysql&logoColor=white)](#)

![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)
![Static Badge](https://img.shields.io/badge/Swagger-valid%2F3.0-green?logo=swagger)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)
[![Static Badge](https://img.shields.io/badge/test-status-%23009929?logo=github)](#)
[![Static Badge](https://img.shields.io/badge/license-MIT-blue)](#)
![Endpoint Badge](https://img.shields.io/endpoint?url=https%3A%2F%2Fhits.dwyl.com%2Fnandojmj%2FAlura_Challenge_Literatura.json&style=flat&logo=github&color=brightgreen)


Este es un desafío de la Especialización __Back-End G6 Alura - Oracle Next Education.__ El proyecto se llama "API REST Foro Hub"

<p>Un foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos. 
  Aquí en Alura Latam, los estudiantes utilizan el foro para sacar sus dudas sobre los cursos y proyectos en los que participan. 
  Este lugar mágico está lleno de mucho aprendizaje y colaboración entre estudiantes, profesores y moderadores.
</p>
<p>
  Ya sabemos para qué sirve el foro y conocemos su aspecto, ¿pero sabemos cómo funciona detrás de escena? Es decir, ¿dónde se almacenan las informaciones? 
¿Cómo se tratan los datos para relacionar un tópico con una respuesta, o cómo se relacionan los usuarios con las respuestas de un tópico?

Este es nuestro desafío, llamado ForoHub: en él, vamos a replicar este proceso a nivel de back end y, para eso, crearemos una API REST usando Spring.

</p>

<p>
  Nuestra API se centrará específicamente en los tópicos, y debe permitir a los usuarios:
</p>
<ul>
  <li>
    Crear un nuevo tópico;
  </li>
  <li>
    Mostrar todos los tópicos creados;
  </li>
  <li>
    Mostrar un tópico específico;
  </li>
  <li>
    Mostrar un tópico específico;
  </li>
  <li>
    Actualizar un tópico;
  </li>
  <li>
    Eliminar un tópico.
  </li>
</ul>

<p>
  Es lo que normalmente conocemos como CRUD* (CREATE, READ, UPDATE, DELETE) y es muy similar a lo que desarrollamos en LiterAlura, pero ahora de forma completa, 
agregando las operaciones de UPDATE y DELETE, y usando un framework que facilitará mucho nuestro trabajo.
</p>

<p>
  *Traducción libre (en orden): Crear, Consultar, Actualizar y Eliminar.
</p>

<p>
  En resumen, nuestro objetivo con este challenge es implementar una API REST con las siguientes funcionalidades:
</p>

<ol>
  <li>
    API con rutas implementadas siguiendo las mejores prácticas del modelo REST;
  </li>
  <li>
    Validaciones realizadas según las reglas de negocio;
  </li>
  <li>
    Implementación de una base de datos relacional para la persistencia de la información;
  </li>
  <li>
    Servicio de autenticación/autorización para restringir el acceso a la información.
  </li>
</ol>

Los pasos solicitados para completar este desafío:

1.  Configurando el entorno Java y Spring
2.	Construcción de la base de datos
3.	Registro de un nuevo tópico
4.	Mostrar todos los tópicos
5.	Detallando un tópico
6.	Actualizar un tópico
7.	Eliminar un tópico
8.	Pruebas a la API
9.	Autenticación con Spring Security
10.	Generar un token con JWT
11.	Autenticación con JWT
12. Hacer un Readme.md
13. Extra (Opcional)
- 13.1 Implementa otras rutas en tu aplicación - (Opcional)
- 13.2 Documentación con Swagger - (Opcional)

     
&nbsp;

> [!NOTE]
> En este Challenge se solicita primero crear el repositorio del proyecto en GitHub.  
> El siguiente material te ayudará con esta actividad: [Git - Configurando Git por primera vez](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Configurando-Git-por-primera-vez) y [Como subir mi proyecto en GitHub](https://www.youtube.com/watch?v=bhKkeOMysuw)  

&nbsp;

### 1. Configurando el entorno Java  

[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Git-Github-blue?style=flat&logo=GitHub)](https://github.com/)
[![Static Badge](https://img.shields.io/badge/Mysql-%234479A1?logo=mysql&logoColor=white)](#)
![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)
![Static Badge](https://img.shields.io/badge/Swagger-valid%2F3.0-green?logo=swagger)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)
[![Static Badge](https://img.shields.io/badge/app-Trello-%231466c3?style=flat&logo=trello)](https://trello.com/)

En esta primera fase, nos piden que se lleve a cabo la instalación y la configuración del entorno de desarrollo Java para nuestro desafío de construcción del desafio Literatura en un proyecto Spring. Asegúrate de contar con los siguientes programas, archivos y versiones:

- IntelliJ IDEA Community Edition
- Java JDK: versión: 17 en adelante
- Maven: versión 4 en adelante
- Spring: versión 3.3.1 - https://start.spring.io/
- MySQL: versión 16 en adelante
- Git y GitHub 
- Insomnia
- Trello

Dependencias para agregar al crear el proyecto en Spring Initializr:

- Spring Data JPA
- Lombok
- Spring Web
- Spring Boot DevTools
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security
- Springdoc

  ![springiforo](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/b8bb1535-5bb2-4eed-be30-f5524295caa8)

  

&nbsp;

### 2. Construcción de la base de datos
[![Static Badge](https://img.shields.io/badge/Configuracion_del_entorno-%230067ff?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)
[![Static Badge](https://img.shields.io/badge/Flyway-Database%20Migrations-%23CC0200?logo=Flyway&logoColor=%23CC0200)](#)


Para integrar una base de datos a nuestro proyecto Spring, nos solicitaron agregar algunas dependencias en nuestro pom.xml (en caso de que aún no las hayas agregado al configurar el entorno Java y Spring):

- Validation
- MySQL Driver
- Spring Data JPA
- Flyway Migration

Además, también es importante recordar la configuración necesaria en nuestro application.properties con los datos de url, nombre de usuario y contraseña de nuestra base de datos, lo que implica definir el driver de la base de datos, así como los datos de inicio de sesión con usuario y contraseña.

> [!NOTE]
> Antes de pasar a la etapa de migraciones del proyecto, te sugerimos crear la base de datos y configurarla según se mencionó anteriormente. 

#### Migración en el proyecto
Las migraciones son comandos en lenguaje SQL para la configuración de la base de datos creada.

Es necesario definir las migraciones, por ejemplo, para la construcción de las tablas de tu proyecto en archivos con extensión .sql. Además, es importante reforzar el uso de las anotaciones @‌PostMapping y @‌Transactional en tu clase controladora para realizar la persistencia de los datos.

> [!IMPORTANTE]
> Recuerda siempre pausar/detener la ejecución del proyecto Spring para crear/cambiar las migraciones.
 
![MIGRATION](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/ae47f591-2925-4b58-89c2-a05695444a36)


Formato para crear archivo sql para Flyway Migration:
```java
V1__create-table-usuarios.sql
V2__create-table-.........sql
V3__create-table-.........sql
.
.
.
```
Tabla creadas en la base de datos, con registro de verciones Flyway Migration
```java
forohub_alura.flyway_schema_history
```
y observamos el contenido de la tabla: 

![MIGRATION2](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/78768f63-1996-4bd9-8041-facd1ac4e02b)

&nbsp;

### 3. Registro de un nuevo tópico

[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Consumo_de_la_API-%23009929?style=flat)](#)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)



La API debe contar con un `endpoint` (punto final) para el registro de tópicos, y debe aceptar solicitudes del tipo POST para la URI /tópicos.
Los datos del tópico (título, mensaje, autor y curso) deben ser enviados en el cuerpo de la solicitud, en formato JSON.

> [!NOTE]
>  No olvides utilizar la anotación `@RequestBody` para que tu proyecto Spring reciba correctamente los datos del cuerpo de la solicitud.
> Además, recuerda que el tópico debe ser guardado en la base de datos construida para el proyecto, así que aquí tienes el recordatorio de utilizar el método save del JpaRepository para realizar la persistencia de los datos del tópico creado.

**Sugerencia:** para ayudar en la validación de los datos, intenta utilizar la anotación Java integrada en Spring `@Valid.`

#### Reglas de negocio
Todos los campos son obligatorios, por lo tanto, es necesario verificar si todos los campos se están ingresando correctamente.
La API no debe permitir el registro de tópicos duplicados (con el mismo título y mensaje).

&nbsp;

*En este fragmento de código, de la Class "ConsumoAPI", se crea una instancia de `HttpClient` utilizando el método estático `newHttpClient()`:*
```java
public class ConsumoAPI {
    // Método para obtener datos desde una URL
    public String obtenerDatos(String url){
        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        
         // Resto del código omitido...
```
&nbsp;


### 4.	Mostrar todos los tópicos
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Consumo_de_la_API-%23009929?style=flat)](#)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)



#### Listado de tópicos
La API debe contar con un punto final para el listado de todos los tópicos, y debe aceptar solicitudes del tipo GET para la URI /tópicos.

Los datos de los tópicos (título, mensaje, fecha de creación, estado, autor y curso) deben ser devueltos en el cuerpo de la respuesta, en formato JSON.

> [!IMPORTANT]
> → Recordando que al tratar con el CRUD es necesario trabajar con JpaRepository asociado al tópico, especialmente en la lista de datos de la base de datos utilizamos el método findAll.  

*Fragmento de codigo utilizado en la ConvierteDatos.java*
```java
 public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper();
    // Método para obtener un objeto de tipo T a partir de un JSON
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            // Parsea el JSON a un JsonNode
            JsonNode rootNode = objectMapper.readTree(json);

            // Obtiene el array de resultados
            JsonNode resultsArray = rootNode.get("results");

            // Si el array de resultados no es nulo y tiene al menos un elemento
            if (resultsArray != null && resultsArray.size() > 0) {
                // Obtiene el primer objeto en el array de resultados
                JsonNode firstResult = resultsArray.get(0);
                // Convierte el primer resultado a la clase especificada
                return objectMapper.treeToValue(firstResult, clase);
            } else {
                // Maneja el caso donde no se encontraron resultados
                throw new RuntimeException("No se encontraron resultados en el JSON.");
            }
        // Resto del código omitido...
```

&nbsp;

### 5. Detallando un tópico
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Consumo_de_la_API-%23009929?style=flat)](#)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)
[![Static Badge](https://img.shields.io/badge/Java_Library-Gson_%2F_Json-blue?style=flat&logo=json)](https://mvnrepository.com/artifact/com.google.code.gson/gson)


#### 6. Detalle de tópicos
La API debe contar con un endpoint (punto final) para el listado de todos los tópicos, y debe aceptar solicitudes del tipo GET para la URI /tópicos/{id}.

Los datos de los tópicos (título, mensaje, fecha de creación, estado, autor y curso) deben ser devueltos en el cuerpo de la respuesta, en formato JSON.

→ Recuerda utilizar la anotación `@‌PathVariable` en tu código para recibir el campo de ID de la solicitud GET.

Reglas de negocio

Solicitar el campo ID para realizar la consulta es una acción obligatoria, ya que tu usuario necesita poder visualizar los detalles de un tópico solicitando una consulta a los datos en la base de datos. En este caso, es necesario verificar si el campo ID se ingresó correctamente.


### 7. Actualizar un tópico
#### Actualización de tópico
a API debe contar con un endpoint (punto final) para la actualización de los datos de un determinado tópico, y debe aceptar solicitudes del tipo PUT para la URI /tópicos/{id}.

Observación: las mismas reglas de negocio del registro de un tópico deben aplicarse también en su actualización.

Dado que estamos realizando una consulta en la base de datos para luego actualizar un tópico, es necesario solicitar y verificar el campo ID de su solicitud.

En el código del proyecto, sugerimos, al igual que en la tarjeta de Detalle de Tópicos, el uso de la anotación `@PathVariable` para obtener el ID de la solicitud `PUT`.

→ Recuerda verificar si el tópico existe en la base de datos para realizar su actualización. En este caso, sugerimos utilizar el método `isPresent()` de la clase Java llamada Optional.
Esta interfaz define métodos para convertir datos de JSON a objetos Java.


&nbsp;


### 8. Eliminar un tópico
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)


La API debe contar con un endpoint para la eliminación de un tópico específico, el cual debe aceptar solicitudes del tipo `DELETE` para la URI `/tópicos/{id}`.

Dado que estamos realizando una consulta en la base de datos para luego actualizar un tópico, es necesario solicitar y verificar el campo ID de su solicitud.

En el código del proyecto, sugerimos, al igual que en la tarjeta de Detalle de Tópicos, el uso de la anotación `@PathVariable` para obtener el ID de la solicitud PUT.

→ Recuerda verificar si el tópico existe en la base de datos antes de realizar su actualización. En este caso, sugerimos el uso del método `isPresent()` de la clase Java llamada Optional.

Por último, al tratarse de la eliminación de un elemento específico de la base de datos, es importante destacar la importancia del uso del método `deleteById` del JpaRepository.

  &nbsp

```java
 // Resto del código omitido...
   **
 * Clase principal de la aplicación Spring Boot.
 */

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {
	@Autowired
	private LibroRepository libRepository;

	@Autowired
	private AutorRepository autRepository;

	/**
	 * Método principal para iniciar la aplicación Spring Boot.
	 * @param args Argumentos de la línea de comandos.
	 */

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	/**
	 * Método para ejecutar la aplicación una vez iniciada.
	 * @param args Argumentos de la línea de comandos.
	 * @throws Exception Excepción que puede ocurrir durante la ejecución.
	 */
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libRepository, autRepository);
		principal.muestraElMenu();

	}
 // Resto del código omitido...
```
&nbsp;


### 9. Pruebas de la API
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)

Las pruebas de las funcionalidades de la API pueden realizarse utilizando alguna herramienta de pruebas de API, como Postman o Insomnia.

Insomnia: https://insomnia.rest

&nbsp;


  ### 10. Autenticación con Spring Security
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)


#### Autenticación
A partir de ahora, solo los usuarios autenticados pueden interactuar con la API.

Implementa un mecanismo de autenticación en la API para que los usuarios puedan autenticarse y enviar solicitudes a ella.

> [!NOTE]
> Recuerda agregar la dependencia "Spring Security" en tu archivo pom.xml (si aún no lo has hecho en la etapa de configuración del entorno Java y Spring).  


##### Configuración de seguridad
Para configurar la autenticación en tu proyecto, es necesario definir tu clase SecurityConfigurations con información para el acceso a través de solicitudes http, utilizando anotaciones como @Configuration y @EnableWebSecurity, así como la clase spring HttpSecurity.

> [!NOTE]
> Te dejamos como sugerencia la documentación oficial de Spring Security (recuerda que el contenido está en inglés, pero puedes traducir la página gracias al atajo de Google Traductor en tu navegador): Spring Security


##### Autenticación en el código Java
El proceso de autenticación en la API se realiza con la implementación de un controller responsable de recibir las solicitudes de inicio de sesión. Asegúrate de utilizar las anotaciones @RestController y @RequestMapping para definir la URL del controller.

Además, utilizamos una clase DTO (en el curso implementada como instancia Record en Java) para recibir los datos de inicio de sesión y contraseña, y luego autenticar al usuario en el método AuthenticationManager presente en la clase SecurityConfigurations.


> [!NOTE]
> Recuerda utilizar las anotaciones @PostMapping, @RequestBody y @Valid para recibir y validar los datos de la solicitud.  

*Fragmento de codigo utilizado en la clase `DatosLibro.java`:*
```java
 // Resto del código omitido...

/**
 * Clase que representa los datos de un autor obtenidos de una fuente externa.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") int fechaNacimiento,
        @JsonAlias("death_year") int fechaFallecimiento) {
}

 // Resto del código omitido...

```

&nbsp;

 

### 11. Generar un token con JWT
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)

#### Token JWT
Para agregar mayor seguridad a tu aplicación, una opción muy ventajosa es requerir tokens para autenticación. El JWT (JSON Web Token) es un estándar utilizado para compartir información entre cliente y servidor que será muy útil en esta tarea.

> [!NOTE]
> Para poder utilizar el JWT es necesario agregar su biblioteca en nuestro pom.xml como dependencia. Accede al sitio para obtener la biblioteca en Java de Auth0: JWT.IO

Esta biblioteca es importante precisamente para poder generar el token en el estándar JWT y así agregarlo en la configuración de seguridad de nuestro proyecto, creando una clase DTO UsernamePasswordAuthenticationToken para recibir el nombre de usuario y contraseña.

#### Generar y validar token
Además, es necesaria la construcción de una clase de servicio, TokenService, para aislar la generación y validación del token.

En la clase, se ha implementado el método "generarToken()", utilizando la biblioteca JWT para crear un token con el algoritmo HMAC256 y una contraseña. También se ha añadido la funcionalidad de configurar la fecha de expiración del token.

Dentro de esta clase, se debe implementar el método "generarToken()" que utiliza la biblioteca JWT para generar el token con el algoritmo HMAC256 y una contraseña secreta. Además, también es importante definir la fecha de expiración del token.

Por último, es necesario inyectar esta clase en tu controlador de autenticación, y así obtener el token retornado en la respuesta de la solicitud de inicio de sesión.

> [!NOTE]
> [IMPORTANTE] Al insertar un libro en la base también deberás insertar su autor y así mantener una relación entre los dos objetos vía atributo de identificación (o como lo llamamos, el famoso ID).

*Fragmento de codigo utilizado en la clase `LibroRepository.java`:*
```java

/**
 * Repositorio para realizar operaciones relacionadas con la entidad Libro en la base de datos.
 */
public interface LibroRepository extends JpaRepository<Libro,Long> {

    /**
     * Busca un libro por su título, ignorando mayúsculas y minúsculas.
     *
     * @param nombreLibro Título del libro a buscar.
     * @return Una instancia de Libro envuelta en un Optional.
     */

    Optional<Libro> findByTituloContainingIgnoreCase(String nombreLibro);
}

 // Resto del código omitido...

```

&nbsp;

### 12. **Hacer un README:** [![Static Badge](https://img.shields.io/badge/status-OK-gree)](#)
Uno de los pasos más importantes al participar en una selección de trabajo es resolver un desafío propuesto por la empresa con la información de la resolución, y generalmente esto debe estar en el README. ¿Y qué es el README? Es un archivo con extensión .md y es un documento con la descripción del proyecto. 
Este mismo archivo que se esta leyendo fue el resultado del README para el Challenge.

&nbsp;
### 13.	**Implementa otras rutas en tu aplicación - (Opcional)** [![Static Badge](https://img.shields.io/badge/status-OK-gree)](#)

#### Implementa otras rutas en tu aplicación

Para nuestro foro estar completo deberíamos tener otras rutas o endopints que nos permitirán crear, listar, actualizar y eliminar otras informaciones además de los tópicos como:

- /usuario
- /respuestas
&nbsp;

### 14. Documentación con Swagger - (Opcional) ![Static Badge](https://img.shields.io/badge/Swagger-valid%2F3.0-green?logo=swagger)
 [![Static Badge](https://img.shields.io/badge/status-OK-gree)](#)

  Ahora es el momento de documentar tu API con SpringFox Swagger. Swagger es una herramienta extremadamente ventajosa para tu API, ya que ofrece una interfaz amigable y accesible, así como una forma de documentación automática generada simultáneamente con el desarrollo de la API.
  
```java
    
    // Método para buscar autores nacidos después de una fecha en la base de datos
    public void buscarAutoresNacidosDespuesDeFecha() {
        try {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("------------ Búsqueda de autores nacidos después de un año específico ------------");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("Ingrese el año para buscar autores nacidos después de: ");
            int fechaLimite = Integer.parseInt(teclado.nextLine());

            List<Autor> autores = autorRepository.findByFechaNacimientoAfter(fechaLimite);

            if (autores.isEmpty()) {
```
    
&nbsp;
 
### 14. Ejecución del Proyecto

Para ejecutar el proyecto, sigue estos pasos:

* Clona o descarga desde Github el repositorio en tu disco local.
* Importa el proyecto en tu IDE de Java (este proyecto se realizo en IntelliJ IDEA).
* Configura las dependencias y ajusta la configuración según sea necesario.
* Corre la aplicación para interactuar con consola.


### 14. Video Y Capturas de pantalla

&nbsp;
![gutendexgeneral](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/51186fd4-403d-466f-9baf-6c8a12ddb378)
&nbsp;

![Captura](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/5c211392-b33f-49c2-a588-36cafdf82f12)


![1](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/a8d60904-3d5a-41fb-9eac-f35dc739e0dc)

![2](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/70528498-d91e-4d69-8ec0-6cf2a16360c3)

![3](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/7a41aa97-8f3e-4897-8519-686dd002d8db)

![5](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/7b6aaf16-f314-46aa-a0a6-4159fb7a756e)

![6](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/a8e42a5c-bde8-4442-94ab-9ee23466d081)

![7](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/cb5655bb-1251-4ae4-882a-f5f1b21570a2)

![8](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/b2bc4a2f-31e3-49ad-a03b-2edd4186fab7)

![9](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/bc1abd48-677d-4416-b949-3ea37787d7bf)

![10](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/f01a39e3-2190-4dea-9974-11bfb268eefe)


&nbsp;
![consultaliteraturapostgresql](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/4432d9d9-4227-4e17-b202-2b198a29d7d9)

&nbsp;

![BDLIBROS](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/92ae3f05-4e19-4177-8888-a17a70131b3c)

&nbsp;

![BDAUTORES](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/770e1719-34c0-44a9-8ae2-036a6a35429d)


&nbsp;


![Literatura_postman_ingles](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/7ecfd3be-a9c2-4162-8837-a732b538f4ca)

&nbsp;
![gutendexflow3](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/c8b69f59-933a-459a-afe4-bee38c48d157)


&nbsp;

![Literatura_postman_Español](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/af2e8e92-517d-4bc9-a9bd-3b020c64ce46)

&nbsp;

![pg1francesl](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/73fb0446-bf88-439e-acbb-7212bd580368)





### Glossary [![Static Badge](https://img.shields.io/badge/status-under%20construction-%2393a8ac)](#)

- **DTO (Data Transfer Object)**: Objetos utilizados para transferir datos entre el backend y el frontend.
- **JPA (Java Persistence API)**: API estándar de Java para mapear objetos a una base de datos relacional.
- **Hibernate**: Framework de mapeo objeto-relacional para Java.
- **API (Application Programming Interface)**: Conjunto de reglas y definiciones que permite a las aplicaciones interactuar entre sí.
- **DTO (Data Transfer Object)**: Patrón de diseño que se utiliza para transferir datos entre subsistemas de un software. En este contexto, se utilizan para transferir datos entre el backend y el frontend de la aplicación.
- **JPA (Java Persistence API)**: API estándar de Java para el mapeo objeto-relacional. Permite mapear objetos de dominio a tablas de base de datos y viceversa.
- **Hibernate**: Framework de mapeo objeto-relacional para Java. Facilita el trabajo con JPA y proporciona funcionalidades adicionales para interactuar con la base de datos.
- **Spring Boot**: Framework de desarrollo de aplicaciones Java que facilita la creación de aplicaciones basadas en Spring con una configuración mínima. Proporciona un conjunto de bibliotecas y herramientas que simplifican el desarrollo de aplicaciones empresariales.
- **PostgreSQL**: Sistema de gestión de bases de datos relacional de código abierto y potente. Se utiliza en este proyecto como el motor de base de datos para almacenar los libros y autores.
- **Maven**: Herramienta de gestión de proyectos de software que se utiliza para construir y gestionar proyectos Java. Facilita la gestión de dependencias, la compilación y la ejecución de pruebas, entre otras tareas.
- **DataSource**: Configuración que define la conexión a la base de datos, incluyendo la URL, el nombre de usuario y la contraseña.
- **Hibernate Dialect**: Configuración que especifica el dialecto SQL que Hibernate debe utilizar para interactuar con la base de datos. En este caso, se utiliza el dialecto de HSQL.
- **Spring Data JPA**: Parte del ecosistema de Spring que simplifica el acceso a datos en aplicaciones basadas en Spring. Proporciona una abstracción sobre JPA y facilita la implementación de repositorios de datos.
- **CascadeType**: Enumeración que define las operaciones de cascada que deben aplicarse a las relaciones entre entidades. Por ejemplo, si se elimina un autor, las operaciones en cascada pueden eliminar automáticamente los libros asociados a ese autor.
- **FetchType**: Enumeración que define cómo se cargan los datos asociados a una relación entre entidades. FetchType.EAGER indica que los datos deben cargarse de forma inmediata, mientras que FetchType.LAZY indica que los datos deben cargarse solo cuando sean necesarios.
- **Principal**: En el contexto de este proyecto, se refiere a la clase principal que coordina las operaciones principales de la aplicación, como la consulta y el almacenamiento de datos.
- **Estructura del Proyecto**: Organización y disposición de los archivos y paquetes que componen el proyecto. Una estructura de proyecto bien definida facilita la comprensión y el mantenimiento del código.
- **Diagrama de Estructura del Proyecto**: Representación visual de la estructura del proyecto, que muestra cómo se relacionan los diferentes componentes y cómo fluye la información a través de ellos. Ayuda a comprender la arquitectura y el diseño del proyecto.


### MIT License

```sql

Copyright (c) [2024] [Hernando Muñoz J]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```

```sql

Copyright (c) [2024] [Hernando Muñoz J]

Se concede permiso, de forma gratuita, a cualquier persona que obtenga una copia
de este software y de los archivos de documentación asociados (el "Software"), para tratar
con el Software sin restricciones, incluyendo sin limitación los derechos
para usar, copiar, modificar, fusionar, publicar, distribuir, sublicenciar y/o vender
copias del Software, y para permitir a las personas a las que se les proporcione el Software
para hacerlo, sujeto a las siguientes condiciones:

El aviso de copyright anterior y este aviso de permiso se incluirán en todas las
copias o porciones sustanciales del Software.

EL SOFTWARE SE PROPORCIONA "TAL CUAL", SIN GARANTÍA DE NINGÚN TIPO, EXPRESA O
IMPLÍCITA, INCLUYENDO PERO NO LIMITADO A LAS GARANTÍAS DE COMERCIABILIDAD,
IDONEIDAD PARA UN PROPÓSITO PARTICULAR Y NO INFRACCIÓN. EN NINGÚN CASO LOS
AUTORES O TITULARES DE DERECHOS DE AUTOR SERÁN RESPONSABLES DE CUALQUIER RECLAMO, DAÑOS U OTROS
RESPONSABILIDAD, YA SEA EN UNA ACCIÓN DE CONTRATO, AGRAVIO O DE OTRO MODO, QUE SURJA DE,
FUERA O EN RELACIÓN CON EL SOFTWARE O EL USO U OTROS TRATOS EN EL
SOFTWARE.

```
### Insignia Exclusiva para este Challenge - Entregado

![badge literalura](https://github.com/nandojmj/Alura_Challenge_Literatura/assets/156966097/a1cc98e3-3046-4996-b631-d6b76477a898)

