
-----

### Título

# 📖 Mi Diario de Momentos

 
### 🚀 Sinopsis

Una sencilla pero poderosa aplicación de consola para capturar y gestionar los momentos más importantes de tu vida junto con las emociones que los acompañan. Desarrollada con Java, sigue el patrón de diseño **Modelo-Vista-Controlador (MVC)** para una arquitectura limpia y organizada.

-----


### 💡 Sobre el Proyecto

Este proyecto fue creado como una herramienta personal para llevar un registro de experiencias diarias. La implementación del patrón MVC fue una decisión clave para separar la lógica de negocio (Modelo) de la interfaz de usuario (Vista) y la gestión del flujo de la aplicación (Controlador). Esto facilita el mantenimiento y la escalabilidad del código.

### 🛠️ Empezando


🛠️ Pre-requisitos
Para ejecutar este proyecto, asegúrate de tener instalados los siguientes programas en tu sistema:

[![Java](https://img.shields.io/badge/language-Java-orange.svg)](https://www.java.com/)

[![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=flat-square&logo=Apache-Maven&logoColor=white)](https://maven.apache.org/)

<br/>

#### Instalación

Sigue estos sencillos pasos para clonar el repositorio y compilar el proyecto:

1.  Clona el repositorio desde la terminal:
    ```bash
    git clone https://www.youtube.com/watch?v=3fn7ApOWE1k
    ```
2.  Navega al directorio del proyecto:
    ```bash
    cd mi-primer-proyecto
    ```
3.  Compila y empaqueta la aplicación con Maven:
    ```bash
    mvn clean install
    ```
    Esto creará un archivo `.jar` en la carpeta `target/`.

### 📂 Estructura del Proyecto

El proyecto sigue una estructura de paquetes clara, en línea con el patrón MVC:

```
.
├── src/main/java/com/vanderlene/mydiario/
│   ├── controller/
│   │   └── MyDiarioApp.java      
│   ├── model/
│   │   ├── Emocion.java          
│   │   ├── Momento.java          
│   │   └── DiarioServicio.java      
│   └── view/
│       └── ConsoleView.java   
├── pom.xml                       
└── README.md
```


### 🤝 Contribuyendo

¡Las contribuciones son bienvenidas\! Si deseas mejorar el proyecto, por favor:

1.  Haz un "fork" del repositorio.
2.  Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3.  Haz tus cambios y haz "commit" (`git commit -am 'feat: Añade nueva funcionalidad'`).
4.  Empuja la rama a tu repositorio (`git push origin feature/nueva-funcionalidad`).
5.  Abre un "Pull Request".

### ✒️ Autores

  * **Vanderlene Oliveira** - Creador y mantenedor - ([GitHub]([https://github.com/VanderleneO]))

### ⚖️ Licencia

Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](https://www.google.com/search?q=https://github.com/git/git-scm.com/blob/main/MIT-LICENSE.txt) para más detalles.
