# Panel de Citas - Sistema de Gestión

## Descripción

Este proyecto es una aplicación web para la gestión de citas, usuarios y servicios. Permite crear, listar, editar y eliminar citas, además de gestionar usuarios y servicios asociados. Está desarrollado con **Spring Boot** en el backend y **React** en el frontend.

## Tecnologías

- **Backend:**  
  - Java 17+  
  - Spring Boot  
  - JPA / Hibernate  
  - H2 / MySQL (o base de datos de preferencia)  

- **Frontend:**  
  - React  
  - Axios para llamadas API REST  

- **Comunicación:**  
  - API REST (JSON) entre frontend y backend  

- **Herramientas:**  
  - Maven / Gradle (para backend)  
  - npm / yarn (para frontend)  

## Funcionalidades

- **Usuarios:**  
  - Crear usuarios (nombre, email, contraseña y rol: CLIENTE o ADMIN)  
  - Listar usuarios existentes  

- **Servicios:**  
  - Crear servicios (nombre, precio, duración)  
  - Listar servicios existentes  

- **Citas:**  
  - Crear citas asignando cliente, servicio, fecha, hora y estado (PENDIENTE, CONFIRMADA, CANCELADA)  
  - Listar citas con detalles de cliente y servicio  
  - Editar fecha, hora y estado de una cita  
  - Eliminar citas  

## Instalación y ejecución

### Backend

1. Clonar el repositorio  
2. Abrir el proyecto backend en tu IDE favorito  
3. Configurar la conexión a la base de datos en `application.properties` (por defecto usa H2 o configura MySQL)  
4. Ejecutar la aplicación Spring Boot:  
   ```bash
   ./mvnw spring-boot:run

## Estructura del proyecto

**backend**/src/main/java/com/spring/citas/backend/
- controller/: Controladores REST (Users, Services, Appointments)
- model/: Entidades JPA (User, Service, Appointment)
- repository/: Interfaces JPA para acceso a datos
**frontend** /src/components/
- Users.js: Listado y creación de usuarios
- Services.js: Listado y creación de servicios
- Appointments/: Componentes para gestionar citas (listado, formulario, fila editable)
- api.js: Configuración base de Axios

## Uso
- Crear usuarios y servicios desde la interfaz.
- Crear citas seleccionando un cliente, servicio, fecha y hora.
- Editar o eliminar citas desde el listado.
- El sistema soporta roles básicos (CLIENTE y ADMIN).

## Mejoras futuras
- Implementar autenticación y autorización con JWT.
- Mejor manejo de errores y validaciones en frontend y backend.
- Paginación y filtros para listados grandes.
- Diseño responsive y mejoras UI/UX.
- Despliegue en servidor en la nube.
