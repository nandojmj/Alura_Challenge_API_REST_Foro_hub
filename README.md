
[![BG_ZOOM_ONE_ESP_(1) 1](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/156160d0-e44d-48a5-bb3e-214732caacf1)](#)

## Open Challenge Backend ONE - API REST Foro Hub
 ***ONE | Fase 3 - Especialización Back-End  G6 Alura - Oracle Next Education***

[![Alura Latam](https://img.shields.io/badge/Alura-Latam-blue?style=flat)](https://www.aluracursos.com/)
[![Static Badge](https://img.shields.io/badge/ONE-Oracle_Next_Education-orange?style=flat&logo=oracle&logoColor=orange)](https://www.oracle.com/co/education/oracle-next-education/) 
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Spring_Boot-%236DB33F?logo=Spring&logoColor=white)](#) 
[![Static Badge](https://img.shields.io/badge/Spring%20Initializr%20-application-%236DB33F?logo=Spring&logoColor=%236DB33F)](#)
[![Static Badge](https://img.shields.io/badge/MySQL-RDBMS-%234479A1?logo=mysql&logoColor=white)](#)
[![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)](#)
[![Static Badge](https://img.shields.io/badge/Swagger-valid%2F3.0-green?logo=swagger)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)
[![Static Badge](https://img.shields.io/badge/test-status-%23009929?logo=github)](#)
[![Static Badge](https://img.shields.io/badge/license-MIT-blue)](#)
[![Endpoint Badge](https://img.shields.io/endpoint?url=https%3A%2F%2Fhits.dwyl.com%2Fnandojmj%2FAlura_Challenge_API_REST_Foro_hub.json&style=flat&logo=github&color=brightgreen)](#)


Este es un Challenge de la Especialización __Back-End G6 Alura - Oracle Next Education.__ 

<p>El Challenge consiste en un foro, el cual es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos. 
 
Este desafío, llamado ForoHub: vamos a replicar este proceso a nivel de back end y, para eso, crearemos una **API REST** usando Spring.

Nuestra API se centrará específicamente en los tópicos, y debe permitir a los usuarios:

- Crear un nuevo tópico;
- Mostrar todos los tópicos creados;
- Mostrar un tópico específico;
- Actualizar un tópico;
- Eliminar un tópico.

Es lo que normalmente conocemos como ***CRUD (CREATE, READ, UPDATE, DELETE)**.

***En resumen, nuestro objetivo con este challenge es implementar una API REST con las siguientes funcionalidades:***

- API con rutas implementadas siguiendo las mejores prácticas del modelo REST;
- Validaciones realizadas según las reglas de negocio;
- Implementación de una base de datos relacional para la persistencia de la información;
- Servicio de autenticación/autorización para restringir el acceso a la información.

&nbsp;
### **Los pasos solicitados para completar este challenge fueron los siguientes:**

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

      13.1 Implementa otras rutas en tu aplicación - (Opcional)
   
      13.2 Documentación con Swagger - (Opcional)
     
&nbsp;

> [!NOTE]
> En este Challenge se solicita primero crear el repositorio del proyecto en GitHub.  
> El siguiente material te ayudará con esta actividad: [Git - Configurando Git por primera vez](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Configurando-Git-por-primera-vez) y [Como subir mi proyecto en GitHub](https://www.youtube.com/watch?v=bhKkeOMysuw)  

&nbsp;

## 1. Configurando el entorno Java  

[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Git-Github-blue?style=flat&logo=GitHub)](https://github.com/)]
[![Static Badge](https://img.shields.io/badge/Spring%20Initializr%20-application-%236DB33F?logo=Spring&logoColor=%236DB33F)](#)
[![Static Badge](https://img.shields.io/badge/Mysql-%234479A1?logo=mysql&logoColor=white)](#)
[![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)](#)
[![Static Badge](https://img.shields.io/badge/Swagger-valid%2F3.0-green?logo=swagger)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)
[![Static Badge](https://img.shields.io/badge/app-Trello-%231466c3?style=flat&logo=trello)](https://trello.com/)

En esta primera fase, nos piden que se lleve a cabo la instalación y la configuración del entorno de desarrollo Java. Antes de comenzar, asegúrese de tener instalado o contar con herramientas como:

- Trello
- Git y GitHub 
- IntelliJ IDEA Community Edition
- Java JDK: versión: 17 en adelante
- Spring Initializr  - [https://start.spring.io/](https://start.spring.io/)
- MySQL relational database management system (RDBMS)
- MySQL Workbench: SQL Development
- Insomnia o Postman

**Dependencias para agregar al crear el proyecto en Spring Initializr:**

- Spring Data JPA
- Lombok
- Spring Web
- Spring Boot DevTools
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security
- Springdoc

[![springiforo](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/b8bb1535-5bb2-4eed-be30-f5524295caa8)](#)

  

&nbsp;

## 2. Construcción de la base de datos
[![Static Badge](https://img.shields.io/badge/Configuracion_del_entorno-%230067ff?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)](#)
[![Static Badge](https://img.shields.io/badge/Flyway-Database%20Migrations-%23CC0200?logo=Flyway&logoColor=%23CC0200)](#)


Para integrar una base de datos a nuestro proyecto Spring, nos solicitaron agregar algunas dependencias en nuestro pom.xml :

- Validation
- MySQL Driver
- Spring Data JPA
- Flyway Migration
  
&nbsp;
#### Base de datos MySQL (Nombre de esquema utilizado en este Challenge: *forohub_alura*)

*Diagrama implementado para crear base de datos:*

![BD3](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/a659d376-8fa9-4b26-be3c-8a3441d26581)

> [!NOTE]
> Antes de pasar a la etapa de migraciones del proyecto, te sugerimos crear la base de datos y configurarla según se mencionó anteriormente. 

### Migración en el proyecto
Las migraciones son comandos en lenguaje SQL para la configuración de la base de datos creada.

> [!IMPORTANTE]
> Recuerda siempre pausar/detener la ejecución del proyecto Spring para crear/cambiar las migraciones.

 
![MIGRATION3](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/280ed66a-c136-47ab-a11d-1e6a364fbe2a)
*Formato para crear archivo sql para Flyway Migration:*

```java
V1__create-table-usuarios.sql
V2__create-table-cursos.sql
V3__create-table-topicos.sql
V3__create-table-********.sql
.
.
```
Tabla creadas en la base de datos, con registro de versiones Flyway Migration
```java
forohub_alura.flyway_schema_history
```
y observamos el contenido de la tabla: 

![MIGRATION4](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/f03e1a73-6c21-4b17-86a7-2bef94716d0d)

&nbsp;

## 3. Registro de un nuevo tópico

[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Consumo_de_la_API-%23009929?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)


La API debe contar con un `endpoint` (punto final) para el registro de tópicos, y debe aceptar solicitudes del tipo POST para la URI /tópicos.
Los datos del tópico (título, mensaje, autor y curso) deben ser enviados en el cuerpo de la solicitud, en formato JSON.

> [!NOTE]
>  No olvides utilizar la anotación `@RequestBody` para que tu proyecto Spring reciba correctamente los datos del cuerpo de la solicitud.

**Sugerencia:** para ayudar en la validación de los datos, intenta utilizar la anotación Java integrada en Spring `@Valid.`

&nbsp;

*Fragmento de código de la Class "TopicoController":*
```java

  // Resto del código omitido...

    @PostMapping
    @Transactional
    @Operation(summary = "Registra un tópico en la base de datos")
    public ResponseEntity<DatosRespuestaTopico> registrar(
            @RequestBody @Valid DatosRegistroTopico datosRegistro,
            UriComponentsBuilder uri) {
        Usuario autor = usuarioRepository.getReferenceById(datosRegistro.autorId());
        Curso curso = cursoRepository.getReferenceById(datosRegistro.cursoId());
        Topico topico = topicoRepository.save(new Topico(datosRegistro, autor, curso));
  // Resto del código omitido...
    
       
```
&nbsp;


## 4.	Mostrar todos los tópicos
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Consumo_de_la_API-%23009929?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)

### Listado de tópicos
La API debe contar con un punto final para el listado de todos los tópicos, y debe aceptar solicitudes del tipo GET para la URI /tópicos.

Los datos de los tópicos (título, mensaje, fecha de creación, estado, autor y curso) deben ser devueltos en el cuerpo de la respuesta, en formato JSON.

> [!IMPORTANT]
> → Recordando que al tratar con el CRUD es necesario trabajar con JpaRepository asociado al tópico, especialmente en la lista de datos de la base de datos utilizamos el método `findAll`.  

*Fragmento de código de la Class "TopicoController.java":*
```java
  /**
     * Obtiene todos los tópicos activos en la base de datos paginados.
     *
     * @param paginacion La configuración de paginación para la consulta.
     * @return ResponseEntity con una página de tópicos listados.
     */
    @GetMapping
    @Operation(summary = "Consulta todos los tópicos en la base de datos")
    public ResponseEntity<Page<DatosListadoTopico>> listar(
            @PageableDefault(size = 10) Pageable paginacion) {
        Page<Topico> paginaTopicos = topicoRepository.findAll(paginacion);
        Page<DatosListadoTopico> paginaDTO = paginaTopicos.map(DatosListadoTopico::new);
        return ResponseEntity.ok(paginaDTO);
    }
        // Resto del código omitido...
```

&nbsp;

## 5. Detallando un tópico
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Consumo_de_la_API-%23009929?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)
[![Static Badge](https://img.shields.io/badge/Java_Library-Gson_%2F_Json-blue?style=flat&logo=json)]](#)


La API debe contar con un endpoint (punto final) para el listado de todos los tópicos, y debe aceptar solicitudes del tipo GET para la URI /tópicos/{id}.

> Before you begin, ensure Recuerda utilizar la anotación `@‌PathVariable` en tu código para recibir el campo de ID de la solicitud GET.

**Reglas de negocio**

Solicitar el campo ID para realizar la consulta es una acción obligatoria, ya que tu usuario necesita poder visualizar los detalles de un tópico solicitando una consulta a los datos en la base de datos. En este caso, es necesario verificar si el campo ID se ingresó correctamente.

*Fragmento de código de la Class "TopicoController.java":*
```java
   /**
     * Consulta un tópico por su ID en la base de datos.
     *
     * @param id El ID del tópico a consultar.
     * @return ResponseEntity con los datos del tópico consultado.
     */
    @GetMapping("/{id}")
    @Operation(summary = "Consulta un tópico por ID en la base de datos")
    public ResponseEntity<DatosRespuestaTopicoId> retornaDatos(
            @PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        DatosRespuestaTopicoId datosRespuesta = new DatosRespuestaTopicoId(topico);
        return ResponseEntity.ok(datosRespuesta);
    }
        // Resto del código omitido...
```
&nbsp;

## 6. Actualizar un tópico

la API debe contar con un endpoint (punto final) para la actualización de los datos de un determinado tópico, y debe aceptar solicitudes del tipo PUT para la URI /tópicos/{id}.

Dado que estamos realizando una consulta en la base de datos para luego actualizar un tópico, es necesario solicitar y verificar el campo ID de su solicitud.

*Fragmento de código de la Class "TopicoController.java":*
```java
/**
     * Actualiza un tópico en la base de datos.
     *
     * @param datosActualizar Los datos actualizados del tópico.
     * @return ResponseEntity con los datos del tópico actualizado.
     */
    @PutMapping
    @Transactional
    @Operation(summary = "Actualiza un tópico en la base de datos")
    public ResponseEntity<DatosRespuestaTopico> actualizar(
            @RequestBody @Valid DatosActualizarTopico datosActualizar) {
        Usuario autor = usuarioRepository.getReferenceById(datosActualizar.autorId());
        Curso curso = cursoRepository.getReferenceById(datosActualizar.cursoId());
        Topico topico = topicoRepository.getReferenceById(datosActualizar.id());
        topico.actualizarDatos(datosActualizar, autor, curso);
        DatosRespuestaTopico datosRespuesta = new DatosRespuestaTopico(topico);
        return ResponseEntity.ok(datosRespuesta);
    }
        // Resto del código omitido...
```
&nbsp;


## 7. Eliminar un tópico
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)


La API debe contar con un endpoint para la eliminación de un tópico específico, el cual debe aceptar solicitudes del tipo `DELETE` para la URI `/tópicos/{id}`.

→ Recuerda verificar si el tópico existe en la base de datos antes de realizar su actualización. En este caso, sugerimos el uso del método `isPresent()` de la clase Java llamada Optional.

  &nbsp

```java
 // Resto del código omitido...

  @DeleteMapping("/eliminar/{id}")
    @Transactional
    @Operation(summary = "Elimina un tópico por ID en la base de datos. Solo perfil ADMIN",
              description = "Para esta solicitud el usuario debe tener derechos de administrador (PERFIL ADMIN)")
    public ResponseEntity eliminarTopico(@PathVariable Long id) {
        Optional<Topico> topicoOptional = topicoRepository.findById(id);
        if (topicoOptional.isPresent()) {
            Topico topico = topicoOptional.get();
            topicoRepository.deleteById(topico.getId());
            return ResponseEntity.ok().body("El topico se eliminó exitosamente");
        }
        return ResponseEntity.noContent().build();
        // RETORNA 204  No Content
    }
 // Resto del código omitido...
```
&nbsp;


## 8. Pruebas de la API
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/MySQL_Workbench-SQL%20Development%20Tool-blue?logo=mysql&logoColor=white)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)

Las pruebas de las funcionalidades de la API pueden realizarse utilizando alguna herramienta de pruebas de API, como Postman o Insomnia.

En este caso utilizamos: Insomnia: `https://insomnia.rest` para probar la API, como por ejemplo:


***Obtener Usuarios registrados en la base de datos:***

![insomnia2](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/b37993f0-8468-4bb4-a55e-8fe703264e1c)


***Crear Usuario:***

![insomnia3](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/f6b1f82a-d941-4f0f-ae78-2fda443ae1e9)


***Eliminar Usuario:***

![insomnia5](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/4e8956f8-55aa-4ea1-b544-882723b893fc)


***Obtener Topicos registrados en la base de datos:***

![insomnia6](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/e04eb2c3-e9df-4483-bfd7-425adfdb649f)


***Crear Topicos:***

![insomnia7](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/2cb9942a-4118-447e-8080-bb327c4bb676)


***Eliminar Topicos (Cerrar Topico, no se elina de la BD, eliminacion logicamente):***

![insomnia10](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/95df003d-cdb1-4bdc-b3c6-9741582a9ca5)

&nbsp;


## 9. Autenticación con Spring Security
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)

Implementa un mecanismo de autenticación en la API para que los usuarios puedan autenticarse y enviar solicitudes a ella. A partir de ahora, solo los usuarios autenticados pueden interactuar con la API.

> [!NOTE]
> Recuerda agregar la dependencia `Spring Security` en tu archivo pom.xml (si aún no lo has hecho en la etapa de configuración del entorno Java y Spring).

### Configuración de seguridad

Para configurar la autenticación en tu proyecto, es necesario definir tu clase SecurityConfigurations con información para el acceso a través de solicitudes http, utilizando anotaciones como `@Configuration` y `@EnableWebSecurity`, así como la clase spring `HttpSecurity`.


*Fragmento de Codigo de la clase SecurityConfigurations:*
```java
 // Resto del código omitido...
 /**
 * Configuración de seguridad para la aplicación.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfigurations {

    // Lista de rutas que se permiten sin autenticación
    private static final String[] AUTH_WHITELIST = {
            "/usuarios/**",
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/swagger-ui.html"
    };

    // Inyección del filtro de seguridad personalizado
    @Autowired
    private SecurityFilter securityFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable()) // Desactiva la protección CSRF para APIs RESTful
                .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) // Configura la política de sesión como stateless
                .authorizeHttpRequests(auth -> auth
                        // Permitir todas las solicitudes POST al endpoint /login
                        .requestMatchers(HttpMethod.POST, "/login").permitAll()
                        // Permitir las rutas en AUTH_WHITELIST sin autenticación
                        .requestMatchers(AUTH_WHITELIST).permitAll()
                        // Permitir el registro de usuarios
                        .requestMatchers(HttpMethod.POST, "/usuario/register").permitAll()
                        // Proteger las rutas /admin/** solo para usuarios con el rol ADMIN
                        .requestMatchers("/admin/**").hasAuthority(ADMIN.name())
                        .requestMatchers(HttpMethod.POST, "/cursos/**").hasAuthority(ADMIN.name())
 // Resto del código omitido...
```
&nbsp;


### Autenticación en el código Java

El proceso de autenticación en la API se realiza con la implementación de un controller responsable de recibir las solicitudes de inicio de sesión. Asegúrate de utilizar las anotaciones `@RestController` y `@RequestMapping` para definir la URL del controller.

Además, utilizamos una clase DTO (en el curso implementada como instancia Record en Java) para recibir los datos de inicio de sesión y contraseña, y luego autenticar al usuario en el método `AuthenticationManager` presente en la clase SecurityConfigurations.


> [!NOTE]
> Recuerda utilizar las anotaciones @PostMapping, @RequestBody y @Valid para recibir y validar los datos de la solicitud.  

*Fragmento de codigo utilizado en la clase `CursoController.java:*
```java
 // Resto del código omitido...

@RestController
@RequestMapping("/cursos")
@SecurityRequirement(name = "bearer-key")
@Tag(name = "Cursos", description = "Crear, Consultar, Actualizar y Eliminar Cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    @Operation(summary = "Registra un curso en la base de datos")
    public ResponseEntity<DatosRespuestaCurso> registrarCurso(
            @RequestBody @Valid DatosRegistroCursos datosRegistroCursos,
            UriComponentsBuilder uriComponentsBuilder) {

        // Guarda el curso en la base de datos y obtiene el curso guardado
        Curso curso = cursoRepository.save(new Curso(datosRegistroCursos));

        // Construye la URL de la ubicación del nuevo curso registrado
        URI url = uriComponentsBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();

 // Resto del código omitido...

```

*Fragmento de codigo utilizado en la clase `AuthenticationManager.java:*
```java
 // Resto del código omitido...
  @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
 // Resto del código omitido...

```

&nbsp;

 

## 10. Generar y validar un token con JWT
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)

Para agregar mayor seguridad a tu aplicación, una opción muy ventajosa es requerir tokens para autenticación. El JWT (JSON Web Token) es un estándar utilizado para compartir información entre cliente y servidor que será muy útil en esta tarea.

> [!NOTE]
> Para poder utilizar el JWT es necesario agregar su biblioteca en nuestro pom.xml como dependencia. Accede al sitio para obtener la biblioteca en Java de Auth0: JWT.IO

Esta biblioteca es importante precisamente para poder generar el token en el estándar JWT y así agregarlo en la configuración de seguridad de nuestro proyecto, creando una clase DTO UsernamePasswordAuthenticationToken para recibir el nombre de usuario y contraseña.

&nbsp;

Además, es necesaria la construcción de una clase de servicio, TokenService, para aislar la generación y validación del token.

En la clase, se ha implementado el método "generarToken()", utilizando la biblioteca JWT para crear un token con el algoritmo HMAC256 y una contraseña. También se ha añadido la funcionalidad de configurar la fecha de expiración del token.

Por último, es necesario inyectar esta clase en tu controlador de autenticación, y así obtener el token retornado en la respuesta de la solicitud de inicio de sesión.

*Fragmento de codigo utilizado en la clase `TokenService.java`:*
```java
 // Resto del código omitido...

@Service
public class TokenService {

    // Inyecta el valor del secreto API desde las propiedades de la aplicación.
    @Value("${api.security.secret}")
    private String apiSecret;

    /**
     * Genera un token JWT para un usuario dado.
     *
     * @param usuario El usuario para el cual se genera el token.
     * @return El token JWT generado.
     */
    public String generarToken(Usuario usuario) {
        try {
            // Crea el algoritmo HMAC256 utilizando el secreto API.
            Algorithm algorithm = Algorithm.HMAC256(apiSecret);

            // Construye y firma el token JWT con las siguientes reclamaciones:
            // - Emisor (issuer)
            // - Sujeto (subject), que es el email del usuario
            // - ID del usuario
            // - Perfil del usuario
            // - Fecha de expiración
            return JWT.create()
                    .withIssuer("foro alura")
                    .withSubject(usuario.getEmail())
                    .withClaim("id", usuario.getId())
                    .withClaim("perfil", usuario.getPerfil().name()) // Agrega el perfil como claim
                    .withExpiresAt(generarFechaExpiracion())
                    .sign(algorithm);
        } catch (JWTCreationException exception) {
            // Maneja la excepción si ocurre un error al crear el token.
            throw new RuntimeException("Error al generar el token JWT", exception);
        }
    }

 // Resto del código omitido...

```
&nbsp;

## 11. Autenticación con JWT
[![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) 
[![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Insomnia-REST%20Client-%234000BF?logo=Insomnia&logoColor=%234000BF)](#)
[![Static Badge](https://img.shields.io/badge/Pruebas_finales-%2340a5ff?style=flat)](#)

### Control de acceso
Después de la generación del token JWT, este debe ser utilizado para autenticar la gestión de registros de los tópicos, incluyendo acciones como creación, consulta, actualización o eliminación. La API debe ser configurada para responder con el resultado de cada solicitud, siempre y cuando el token proporcionado sea válido.

Antes de configurar más detalles del control de acceso, es válido agregar una nueva solicitud con una URL y un archivo JSON que contenga el nombre de usuario y contraseña para la generación del token. "http://localhost:8080/login"?

En principio, debemos mapear las URLs y validar los tokens en nuestro controlador. Recomendamos crear una clase separada para validar los tokens y llamarla antes de las solicitudes en el controlador para evitar la repetición de código.

> [!NOTE]
> Destacamos la importancia de almacenar y enviar el token junto con las próximas solicitudes.
> Reforzamos la necesidad de crear un filter o interceptor en el proyecto para validar el token en cada solicitud.

*Fragmento de codigo utilizado en la clase `AutenticacionService`:*
```java
 // Resto del código omitido...
  @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(username);
    }
  public DatosRespuestaUsuario autenticarUsuario(DatosAutenticacionUsuario datosAutenticacion) {
        // Validar los datos de autenticación
        validadores.forEach(v-> v.validar(datosAutenticacion));
        // Buscar y devolver los datos del usuario autenticado
        return new DatosRespuestaUsuario((Usuario) usuarioRepository.findByEmail(datosAutenticacion.email()));
    }

 // Resto del código omitido...
```
&nbsp;

*Fragmento de codigo utilizado en la clase `AutenticacionController`:*
```java
 // Resto del código omitido...
@RestController
@RequestMapping("/login")
@Tag(name = "Autenticación - Login", description = "Gestionar la creación y verificación de tokens JWTO para el login de usuario")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;  // Gestor de autenticación de Spring Security

    @Autowired
    private TokenService tokenService;  // Servicio para la generación y validación de tokens JWT

    @Autowired
    private AutenticacionService autenticacionService;  // Servicio de autenticación personalizado



 // Resto del código omitido...
```
&nbsp;

## 11. **Hacer un README:** [![Static Badge](https://img.shields.io/badge/status-OK-gree)](#)
Uno de los pasos más importantes al participar en una selección de trabajo es resolver un desafío propuesto por la empresa con la información de la resolución, y generalmente esto debe estar en el README. ¿Y qué es el README? Es un archivo con extensión .md y es un documento con la descripción del proyecto. 
Este mismo archivo que se esta leyendo fue el resultado del README para el Challenge.

&nbsp;
## 13.	**Implementa otras rutas en tu aplicación - (Opcional)** [![Static Badge](https://img.shields.io/badge/status-OK-gree)](#)

### Implementa otras rutas en tu aplicación

Para nuestro foro estar completo deberíamos tener otras rutas o endopints que nos permitirán crear, listar, actualizar y eliminar otras informaciones además de los tópicos como:

- /usuario
- /respuestas
&nbsp;

### 14. Documentación con Swagger - (Opcional) ![Static Badge](https://img.shields.io/badge/Swagger-valid%2F3.0-green?logo=swagger)
 [![Static Badge](https://img.shields.io/badge/status-OK-gree)](#)

Se nos solicito documentar nuestra  API con Spring Swagger. Swagger es una herramienta extremadamente ventajosa para tu API, ya que ofrece una interfaz amigable y accesible, así como una forma de documentación automática generada simultáneamente con el desarrollo de la API. Es una herramienta basada en el estándar OpenAPI que nos permite documentar y probar nuestros Web APIs,

```
http://localhost:8080/swagger-ui/index.html
```

Accediendo a la interfaz gráfica - Swagger UI
Una vez realizada la configuración, ya podremos acceder a la interfaz gráfica de Swagger desde la dirección /swagger. El resultado inicial (sin documentación) sería el siguiente:

 ![swagger_login](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/b7f3fffa-e829-4ca2-927d-d164132a84a1)

 Además, se ha incluido un botón [ Authorize ] en la interfaz, que nos permitirá añadir un Token JWT a la cabecera de las peticiones HTTP que realicemos hacia los Controladores de Web API

 ![swagger_login2](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/4b49472b-faaa-4286-b938-8292bf43ed72)

![swagger_login3](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/7527cbf0-e147-4906-8717-042ecce35d4b)

![swagger_login4](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/1bdfcc17-4280-42dd-8f7d-eb9004f4ea28)


![swagger_cursos](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/3cb64e34-7b50-4e06-8eee-79c604381bf5)

![swagger_topicos](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/6bc6380c-b1df-454f-a26b-8cd54eddc351)

![swagger_topicosid](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/432b19ea-b4f7-44f3-9fd9-deab10dc3ada)

![swagger_topicosestado1](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/17c26356-619e-4e44-9527-79c017ff6ff7)

![swagger_topicosestado2](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/e78653ab-ef87-4309-aba4-0e9a279de89c)

![swagger_respuestas](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/29089e15-b16e-416e-bc52-1e33be9eac81)

![swagger_admin](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/b12f1da5-1195-43ba-bc65-307f251b1e91)



    
&nbsp;
 
## 14. Ejecución del Proyecto

Para ejecutar el proyecto, sigue estos pasos:

* Clona o descarga desde Github el repositorio en tu disco local.
* Importa el proyecto en tu IDE de Java (este proyecto se realizo en IntelliJ IDEA).
* Configura las dependencias y ajusta la configuración según sea necesario.
* Corre la aplicación para interactuar con la base de datos y alguna herramienta de pruebas de API, como Postman o Insomnia.


## 14. Video Y Capturas de pantalla  [![Static Badge](https://img.shields.io/badge/status-under%20construction-%2393a8ac)](#)



## Glossary [![Static Badge](https://img.shields.io/badge/status-under%20construction-%2393a8ac)](#)

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


## MIT License

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
## Insignia Exclusiva para este Challenge - Entregado

![Badge-Spring](https://github.com/nandojmj/Alura_Challenge_API_REST_Foro_hub/assets/156966097/6ce0ba25-323f-4a30-a4a1-eee0791d1ad0)


