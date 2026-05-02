# 🏋️‍♂️ Zona Fit - Gestión de Clientes de Gimnasio

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![JPA](https://img.shields.io/badge/Spring%20Data%20JPA-Database-blue?style=for-the-badge)
![Lombok](https://img.shields.io/badge/Lombok-Clean%20Code-pink?style=for-the-badge)

## 📌 Descripción del proyecto

**Zona Fit** es una aplicación de consola desarrollada con **Java Spring Boot**, enfocada en la gestión de clientes de un gimnasio.

El sistema permite realizar operaciones CRUD, es decir: **crear, listar, buscar, modificar y eliminar clientes**.  
Este proyecto fue creado como práctica para reforzar conocimientos de **Spring Boot**, **Spring Data JPA**, **arquitectura por capas**, **entidades**, **repositorios**, **servicios** e **inyección de dependencias**.

---

## 🚀 Funcionalidades principales

✅ Listar todos los clientes registrados  
✅ Buscar un cliente por ID  
✅ Agregar nuevos clientes  
✅ Modificar información de clientes existentes  
✅ Eliminar clientes del sistema  
✅ Menú interactivo desde consola  
✅ Persistencia de datos usando Spring Data JPA  
✅ Separación del proyecto por capas  

---

## 🛠️ Tecnologías utilizadas

| Tecnología | Descripción |
|----------|-------------|
| Java | Lenguaje principal del proyecto |
| Spring Boot | Framework para crear la aplicación |
| Spring Data JPA | Manejo de persistencia y operaciones CRUD |
| Jakarta Persistence | Uso de entidades JPA |
| Lombok | Reducción de código repetitivo |
| Maven | Gestión de dependencias y construcción del proyecto |
| SLF4J Logger | Registro de mensajes en consola |

---

## 📂 Estructura del proyecto

```text
src/main/java/st/zona_fit
│
├── ZonaFitApplication.java
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

El proyecto está organizado bajo una arquitectura por capas:

### 1. Capa principal

Contiene la clase `ZonaFitApplication`, encargada de iniciar la aplicación y mostrar el menú interactivo en consola.

### 2. Capa modelo

Contiene la entidad `Cliente`, que representa la tabla o estructura principal del sistema.

### 3. Capa repositorio

Contiene la interfaz `ClienteRepositorio`, la cual extiende de `JpaRepository` para acceder a operaciones CRUD de forma automática.

### 4. Capa servicio

Contiene la interfaz `IClienteServicio` y su implementación `ClienteServicio`, donde se define la lógica principal para gestionar clientes.

---

## 👤 Modelo Cliente

La entidad `Cliente` contiene los siguientes atributos:

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Integer | Identificador único del cliente |
| nombre | String | Nombre del cliente |
| apellido | String | Apellido del cliente |
| membresia | Integer | Número de membresía del cliente |

---

## 🖥️ Menú de la aplicación

Al ejecutar el programa, se muestra un menú en consola como el siguiente:

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

---

## 📋 Ejemplo de uso

### Agregar un cliente

```text
--- Agregar Cliente ---

Nombre:
Juan

Apellido:
Pérez

Membresia:
1001
```

Resultado esperado:

```text
Cliente agregado: Cliente(id=1, nombre=Juan, apellido=Pérez, membresia=1001)
```

---

### Buscar un cliente

```text
--- Buscar Cliente por ID ---

ID cliente a buscar:
1
```

Resultado esperado:

```text
Cliente encontrado: Cliente(id=1, nombre=Juan, apellido=Pérez, membresia=1001)
```

---

## ⚙️ Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/Sadeths/zona-fit.git
```

### 2. Entrar al proyecto

```bash
cd zona-fit
```

### 3. Compilar el proyecto

```bash
mvn clean compile
```

### 4. Ejecutar la aplicación

```bash
mvn spring-boot:run
```

---

## 🔧 Configuración requerida

Antes de ejecutar el proyecto, asegúrate de tener configurada la conexión a la base de datos en el archivo:

```text
src/main/resources/application.properties
```

Ejemplo de configuración:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/zona_fit
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

> Nota: Debes tener creada la base de datos `zona_fit` en MySQL o adaptar la configuración según tu entorno.

---

## 📌 Operaciones implementadas

| Opción | Acción | Descripción |
|------|--------|-------------|
| 1 | Listar clientes | Muestra todos los clientes registrados |
| 2 | Buscar cliente | Busca un cliente usando su ID |
| 3 | Agregar cliente | Registra un nuevo cliente |
| 4 | Modificar cliente | Actualiza los datos de un cliente existente |
| 5 | Eliminar cliente | Elimina un cliente del sistema |
| 6 | Salir | Finaliza la aplicación |

---

## 🎯 Objetivo del proyecto

El objetivo de este proyecto es practicar y aplicar los fundamentos de **Spring Boot** en una aplicación real de consola, utilizando una estructura organizada y buenas prácticas de desarrollo.

Conceptos aplicados:

- Programación orientada a objetos
- Entidades JPA
- Repositorios con Spring Data JPA
- Servicios e interfaces
- Inyección de dependencias
- Operaciones CRUD
- Uso de Maven
- Uso de Logger
- Separación por capas

---

## 💡 Aprendizajes obtenidos

Durante el desarrollo de este proyecto se reforzaron conocimientos importantes como:

- Cómo crear una aplicación con Spring Boot.
- Cómo usar `CommandLineRunner` para ejecutar lógica desde consola.
- Cómo conectar una entidad con una base de datos.
- Cómo usar `JpaRepository` para simplificar operaciones CRUD.
- Cómo separar responsabilidades usando capas.
- Cómo implementar servicios mediante interfaces.
- Cómo registrar mensajes usando `Logger`.

---

## 📈 Posibles mejoras futuras

🚀 Agregar una interfaz gráfica  
🚀 Crear una API REST con controladores  
🚀 Implementar validaciones en los datos ingresados  
🚀 Agregar manejo de excepciones personalizado  
🚀 Crear pruebas unitarias  
🚀 Implementar autenticación de usuarios  
🚀 Agregar reportes de clientes activos  
🚀 Mejorar el diseño del menú en consola  

---

## 👨‍💻 Autor

**Samahel Thomas**

Proyecto desarrollado como parte de mi aprendizaje en **Java**, **Spring Boot** y desarrollo backend.

---


## 📄 Estado del proyecto

✅ Proyecto funcional  
✅ CRUD completo desde consola  
✅ Estructura por capas implementada  
✅ Conexión preparada para base de datos  
✅ Listo para subir a GitHub como parte de portafolio  

---

# 🏋️‍♂️ Zona Fit

Aplicación de gestión de clientes para gimnasio desarrollada con Java Spring Boot.
