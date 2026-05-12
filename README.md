# 🏋️‍♂️ Zona Fit - Sistema de Gestión de Clientes

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.2-brightgreen?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-Database-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![PrimeFaces](https://img.shields.io/badge/PrimeFaces-Web%20UI-purple?style=for-the-badge)
![JSF](https://img.shields.io/badge/JSF-XHTML-lightgrey?style=for-the-badge)
![Swing](https://img.shields.io/badge/Java%20Swing-Desktop%20GUI-yellow?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![Lombok](https://img.shields.io/badge/Lombok-Clean%20Code-pink?style=for-the-badge)

---

## 📌 Descripción del proyecto

**Zona Fit** es un sistema de gestión de clientes para gimnasio desarrollado con **Java Spring Boot**.

El proyecto inició como una aplicación de consola, posteriormente fue mejorado con una interfaz gráfica de escritorio utilizando **Java Swing**, y finalmente se agregó una versión web desarrollada con **JoinFaces, JSF y PrimeFaces**.

El sistema permite realizar operaciones CRUD completas sobre los clientes del gimnasio, manteniendo una arquitectura organizada por capas y una conexión a base de datos mediante **Spring Data JPA** y **MySQL**.

---

## 🚀 Funcionalidades principales

✅ Registrar nuevos clientes  
✅ Listar clientes almacenados  
✅ Editar información de clientes existentes  
✅ Eliminar clientes del sistema  
✅ Visualizar clientes en una tabla  
✅ Gestionar clientes desde consola  
✅ Gestionar clientes desde interfaz gráfica Swing  
✅ Gestionar clientes desde una interfaz web con PrimeFaces  
✅ Uso de base de datos MySQL  
✅ Arquitectura por capas  
✅ Separación entre modelo, repositorio, servicio, controlador y vista  

---

## 🧩 Versiones del proyecto

| Versión | Descripción |
|------|-------------|
| Consola | Permite gestionar clientes mediante un menú interactivo desde terminal |
| Escritorio | Permite gestionar clientes mediante una interfaz gráfica con Java Swing |
| Web | Permite gestionar clientes desde el navegador usando JSF, JoinFaces y PrimeFaces |

---

## 🛠️ Tecnologías utilizadas

| Tecnología | Descripción |
|----------|-------------|
| Java 21 | Lenguaje principal del proyecto |
| Spring Boot 3.1.2 | Framework principal de la aplicación |
| Spring Data JPA | Persistencia y operaciones CRUD |
| MySQL | Base de datos relacional |
| Maven | Gestión de dependencias y construcción del proyecto |
| Lombok | Reducción de código repetitivo |
| Java Swing | Interfaz gráfica de escritorio |
| FlatLaf | Tema oscuro para la versión Swing |
| Spring Web | Soporte para aplicación web |
| JoinFaces | Integración de JSF con Spring Boot |
| PrimeFaces | Componentes visuales para la interfaz web |
| JSF / XHTML | Construcción de vistas web |
| SLF4J Logger | Registro de eventos en consola |

---

## 📂 Estructura del proyecto

```text
src/main/java/st/zona_fit
│
├── ZonaFitApplication.java
├── ZonaFitSwing.java
├── ZonaFitWeb.java
│
├── controlador
│   └── IndexControlador.java
│
├── gui
│   └── ZonaFitForma.java
│
├── modelo
│   └── Cliente.java
│
├── repositorio
│   └── ClienteRepositorio.java
│
└── servicio
    ├── IClienteServicio.java
    └── ClienteServicio.java
```

---

## 🧱 Arquitectura del sistema

El proyecto está organizado bajo una arquitectura por capas para mantener el código más limpio, ordenado y fácil de mantener.

### 1. Capa principal

Contiene las clases encargadas de iniciar las diferentes versiones del sistema.

- `ZonaFitApplication`: aplicación de consola.
- `ZonaFitSwing`: aplicación de escritorio con Java Swing.
- `ZonaFitWeb`: aplicación web con Spring Boot, JoinFaces y PrimeFaces.

### 2. Capa modelo

Contiene las entidades del sistema.

- `Cliente`: representa a un cliente del gimnasio.

### 3. Capa repositorio

Contiene la interfaz encargada de comunicarse con la base de datos.

- `ClienteRepositorio`: extiende de `JpaRepository` para realizar operaciones CRUD.

### 4. Capa servicio

Contiene la lógica de negocio del sistema.

- `IClienteServicio`: define las operaciones disponibles.
- `ClienteServicio`: implementa las operaciones de gestión de clientes.

### 5. Capa controlador

Contiene la lógica que conecta la vista web con la capa de servicio.

- `IndexControlador`: administra la carga, creación, actualización y eliminación de clientes desde la interfaz web.

### 6. Capa GUI

Contiene la interfaz gráfica de escritorio.

- `ZonaFitForma`: ventana principal desarrollada con Java Swing.

---

## 👤 Modelo Cliente

La entidad `Cliente` representa la información principal de cada cliente registrado en el gimnasio.

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Integer | Identificador único del cliente |
| nombre | String | Nombre del cliente |
| apellido | String | Apellido del cliente |
| membresia | Integer | Número de membresía del cliente |

---

## 🖥️ Versión de consola

La primera versión del proyecto funciona mediante un menú interactivo en consola.

```text
*** Aplicacion Zona Fit (GYM) ***

1. Listar Clientes
2. Buscar Clientes
3. Agregar Clientes
4. Modificar Clientes
5. Eliminar Clientes
6. Salir

Elige una opcion:
```

Desde este menú se pueden realizar las operaciones principales del sistema.

---

## 🪟 Versión de escritorio con Java Swing

La segunda versión del proyecto incluye una interfaz gráfica de escritorio desarrollada con **Java Swing**.

Esta versión permite gestionar clientes desde una ventana visual, utilizando campos de texto, botones y una tabla.

### Funcionalidades de la versión Swing

✅ Mostrar clientes en una tabla  
✅ Agregar nuevos clientes  
✅ Seleccionar un cliente desde la tabla  
✅ Editar clientes existentes  
✅ Eliminar clientes seleccionados  
✅ Limpiar el formulario  
✅ Aplicar modo oscuro con FlatLaf  

### Elementos principales de la interfaz Swing

```text
-------------------------------------------------
|                 Zona Fit                      |
-------------------------------------------------
| ID | Nombre | Apellido | Membresía             |
-------------------------------------------------
| 1  | Juan   | Pérez    | 1001                  |
| 2  | Ana    | López    | 1002                  |
-------------------------------------------------

Nombre:     [________________]
Apellido:   [________________]
Membresía:  [________________]

[ Guardar ]   [ Eliminar ]   [ Limpiar ]
```

---

## 🌐 Versión web con PrimeFaces

La versión más reciente del proyecto incluye una interfaz web desarrollada con **JoinFaces, JSF y PrimeFaces**.

Esta versión permite administrar los clientes desde el navegador mediante una interfaz moderna con tabla, botones de acción y mensajes visuales.

### Funcionalidades de la versión web

✅ Interfaz web con PrimeFaces  
✅ Tabla de clientes  
✅ Botón para agregar nuevo cliente  
✅ Botón para editar clientes  
✅ Botón para eliminar clientes  
✅ Mensajes de confirmación  
✅ Actualización de datos mediante AJAX  
✅ Integración con Spring Boot  
✅ Conexión con la misma capa de servicio  
✅ Persistencia en MySQL usando Spring Data JPA  

---

## 🖼️ Vista previa de la versión web

La interfaz web muestra una tabla con los clientes registrados y opciones para administrar cada registro.

```text
-------------------------------------------------------------
| Inicio        + Nuevo Cliente                              |
-------------------------------------------------------------

                    Zona Fit (GYM)

-------------------------------------------------------------
| Id | Nombre  | Apellido | Membresía | Acciones             |
-------------------------------------------------------------
| 1  | Gabriel | Flores   | 100       | Editar | Eliminar    |
| 11 | Juana   | Banana   | 200       | Editar | Eliminar    |
-------------------------------------------------------------
```

---

## 📋 Operaciones implementadas

| Operación | Descripción |
|---------|-------------|
| Listar clientes | Muestra todos los clientes registrados |
| Buscar cliente | Permite consultar un cliente por ID |
| Agregar cliente | Registra un nuevo cliente |
| Modificar cliente | Actualiza los datos de un cliente existente |
| Eliminar cliente | Elimina un cliente del sistema |
| Limpiar formulario | Limpia los campos del formulario |
| Actualizar tabla | Refresca la información mostrada en pantalla |

---

## ⚙️ Configuración de base de datos

Antes de ejecutar el proyecto, se debe configurar la conexión a la base de datos en el archivo:

```text
src/main/resources/application.properties
```

Ejemplo de configuración con MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/zona_fit
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

> Nota: Debes crear previamente la base de datos `zona_fit` en MySQL o adaptar la configuración según tu entorno.

---

## 📦 Dependencias principales

El proyecto utiliza dependencias como:

```xml
<dependency>
    <groupId>org.joinfaces</groupId>
    <artifactId>primefaces-spring-boot-starter</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <scope>provided</scope>
</dependency>

<dependency>
    <groupId>com.formdev</groupId>
    <artifactId>flatlaf</artifactId>
    <version>3.0</version>
</dependency>
```

---

## ▶️ Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/Sadeths/zona-fit.git
```

### 2. Entrar a la carpeta del proyecto

```bash
cd zona-fit
```

### 3. Compilar el proyecto

```bash
mvn clean compile
```

---

## ▶️ Ejecutar versión de consola

```bash
mvn spring-boot:run -Dspring-boot.run.main-class=st.zona_fit.ZonaFitApplication
```

---

## ▶️ Ejecutar versión de escritorio Swing

```bash
mvn spring-boot:run -Dspring-boot.run.main-class=st.zona_fit.ZonaFitSwing
```

También puedes ejecutar directamente la clase:

```text
st.zona_fit.ZonaFitSwing
```

desde tu IDE, como IntelliJ IDEA o VS Code.

---

## ▶️ Ejecutar versión web

```bash
mvn spring-boot:run -Dspring-boot.run.main-class=st.zona_fit.ZonaFitWeb
```

Luego abre el navegador en:

```text
http://localhost:8080
```

---

## 🚀 Flujo de uso de la versión web

### Agregar cliente

1. Presionar el botón **Nuevo Cliente**.
2. Ingresar el nombre.
3. Ingresar el apellido.
4. Ingresar el número de membresía.
5. Guardar el registro.
6. El cliente aparecerá en la tabla.

### Editar cliente

1. Presionar el botón **Editar** en el registro deseado.
2. Modificar los datos necesarios.
3. Guardar los cambios.
4. La tabla se actualizará con la nueva información.

### Eliminar cliente

1. Presionar el botón **Eliminar** en el registro deseado.
2. El sistema eliminará el cliente seleccionado.
3. La tabla se actualizará automáticamente.

---

## 🎯 Objetivo del proyecto

El objetivo principal de este proyecto es practicar el desarrollo de aplicaciones con **Java Spring Boot**, implementando un sistema CRUD funcional y ampliándolo progresivamente desde consola hasta una aplicación web.

Este proyecto permite reforzar conocimientos como:

- Programación orientada a objetos
- Arquitectura por capas
- Entidades JPA
- Repositorios con Spring Data JPA
- Servicios e interfaces
- Inyección de dependencias
- Persistencia de datos con MySQL
- Aplicaciones de consola con Spring Boot
- Interfaces gráficas con Java Swing
- Aplicaciones web con JSF y PrimeFaces
- Uso de Maven
- Uso de Lombok
- Manejo de formularios y tablas
- Actualización de componentes con AJAX

---

## 💡 Aprendizajes obtenidos

Durante el desarrollo de este proyecto se aplicaron y reforzaron conocimientos importantes como:

- Crear una aplicación Spring Boot desde cero.
- Definir una entidad con JPA.
- Usar `JpaRepository` para simplificar operaciones CRUD.
- Crear una capa de servicio para separar la lógica del sistema.
- Implementar interfaces para organizar mejor el código.
- Inyectar dependencias con Spring.
- Crear una interfaz gráfica con Java Swing.
- Usar `JTable` para mostrar datos.
- Aplicar un tema oscuro con FlatLaf.
- Integrar JSF con Spring Boot usando JoinFaces.
- Usar PrimeFaces para crear componentes web.
- Manejar eventos desde botones web.
- Actualizar tablas mediante AJAX.
- Conectar una aplicación Java con MySQL.

---

## 📈 Posibles mejoras futuras

🚀 Agregar buscador de clientes por nombre o membresía  
🚀 Agregar validaciones avanzadas en formularios  
🚀 Implementar manejo de excepciones personalizado  
🚀 Crear una API REST para consumir desde frontend moderno  
🚀 Agregar autenticación de usuarios  
🚀 Crear roles de administrador y empleado  
🚀 Agregar reportes de clientes activos  
🚀 Exportar listado de clientes a PDF o Excel  
🚀 Crear dashboard con estadísticas del gimnasio  
🚀 Agregar pruebas unitarias  
🚀 Mejorar el diseño visual de la versión web  
🚀 Desplegar la aplicación en la nube  

---

## 📌 Estado del proyecto

✅ Aplicación de consola funcional  
✅ Interfaz gráfica con Swing agregada  
✅ Versión web con PrimeFaces agregada  
✅ CRUD completo implementado  
✅ Base de datos conectada con MySQL  
✅ Arquitectura por capas aplicada  
✅ Proyecto listo para portafolio en GitHub  

---

## 👨‍💻 Autor

**Samahel Thomas**

Proyecto desarrollado como parte de mi aprendizaje en **Java**, **Spring Boot**, **Spring Data JPA**, **MySQL**, **Swing** y **PrimeFaces**.

- GitHub: [Sadeths](https://github.com/Sadeths)
- LinkedIn: [Samahel Thomas](https://www.linkedin.com/in/samahel-thomas-7330211ba)

---

# 🏋️‍♂️ Zona Fit

Sistema CRUD de gestión de clientes para gimnasio desarrollado con **Java Spring Boot**, **Spring Data JPA**, **MySQL**, **Java Swing**, **JSF**, **JoinFaces** y **PrimeFaces**.
