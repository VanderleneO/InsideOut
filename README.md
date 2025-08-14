# 📌 Mi Primer Proyecto Java

## 📝 Descripción
Este proyecto es una aplicación Java de consola desarrollada siguiendo la metodología ágil **Scrum**, organizada en 6 **historias de usuario**.  
El sistema simula el flujo básico de interacción de un usuario con la aplicación, abarcando desde el **inicio de sesión** hasta la **salida segura**, pasando por distintas funcionalidades específicas.

### Historias de usuario implementadas:
1. **Inicio de sesión** – Permite autenticar al usuario con credenciales predefinidas.
2. **Registro de usuario** – Posibilita agregar nuevos usuarios al sistema.
3. **Visualización de información** – Muestra datos almacenados en el sistema.
4. **Gestión de datos** – Permite modificar o eliminar información.
5. **Funcionalidad especial** – Característica particular definida en el proyecto.
6. **Salir de la aplicación** – Finaliza la ejecución de forma controlada.

---

## ⚙️ Pre-requisitos
Antes de ejecutar el proyecto, asegúrate de tener instalado:
- **Java JDK** 17 o superior
- **Apache Maven** (para gestión y compilación del proyecto)
- Un **IDE** compatible como IntelliJ IDEA, Eclipse o VS Code con extensión de Java
- **Git** para clonar el repositorio

> Verifica tu instalación de Java:
```bash
java -version

📥 Pasos para la instalación

Clona este repositorio desde GitHub:

git clone https://github.com/tu-usuario/mi-primer-proyecto-java.git


Ingresa a la carpeta del proyecto:

cd mi-primer-proyecto-java


(Si usas Maven) Compila e instala dependencias:

mvn clean install

▶️ Ejecución de la aplicación

Para ejecutar desde línea de comandos:

java -jar target/mi-primer-proyecto.jar


O bien, desde tu IDE, ejecuta la clase principal con el método main().

✅ Ejecución de los tests

El proyecto incluye pruebas unitarias para validar las funcionalidades de cada historia de usuario.

Para ejecutarlas:

mvn test


Para ver el reporte de cobertura de código (usando JaCoCo):

Genera el reporte:

mvn jacoco:report


Abre el archivo:

target/site/jacoco/index.html


📊 Diagramas realizados

Los siguientes diagramas documentan la estructura y el flujo de la aplicación:

Diagrama de clases UML


Diagrama de casos de uso


Diagrama de secuencia


👥 Autores

Colaborador/a Dublin Rios
Colaborador/a Vanderlene Oliveira 
