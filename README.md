# Java_course
This repository is for create 10 project with Java. 

1. __Calculator Simple__: 

    - __Descripción__: Un programa que permita al usuario realizar operaciones matemáticas básicas (suma, resta, multiplicación y división) entre dos números ingresados por teclado.

    - Funcionalidades:
        - [x] Solicitar al usuario dos números.

        - [x] Mostrar un menú con las operaciones disponibles.

        - [x] Realizar la operación seleccionada y mostrar el resultado.

        - [x] Preguntar si desea realizar otra operación o salir.


2. __Guess the Number__

    - __Descripción__: Un juego donde el programa genera un número aleatorio y el usuario debe adivinarlo en un número limitado de intentos.

    - __Funcionalidades__:

        - [x] Generar un número aleatorio (ej. entre 1 y 100).

        - [x] Pedir al usuario que ingrese un número y dar pistas ("muy alto" o "muy bajo").

        - [x] Llevar un contador de intentos.


3. __Gestor de Tareas (To-Do List)__

    - __Descripción__: Un programa que permita al usuario agregar, ver y eliminar tareas de una lista.

    - __Funcionalidades__:

        - [x] Mostrar un menú con opciones: "Agregar tarea", "Ver tareas", "Eliminar tarea" y "Salir".

        - [x] Usar estructuras como arrays o listas para almacenar las tareas.
        
        - [x] Usar funciones para poder trabajar con ellas. 

        - [x] Permitir marcar tareas como completadas.


 4. __Conversor de Unidades__

    - __Descripción__: Un programa que permite convertir entre distintas unidades de medida como temperatura, peso y longitud.

    - __Funcionalidades__:

        - [x] Mostrar un menú principal para elegir el tipo de conversión: "Temperatura", "Peso", "Longitud", "Salir".

        - [x] Cada tipo de conversión debe abrir un submenú con las opciones disponibles, por ejemplo: "Celsius a Fahrenheit", "Kg a Libras", etc.

        - [ ] Usar funciones para manejar cada tipo de conversión.

        - [ ] Mostrar el resultado de forma clara con unidades.

5. __Juego de Piedra, Papel o Tijera con Puntaje__

    - __Descripción__: Juego clásico contra la computadora, con opción de jugar varias rondas y llevar la cuenta del puntaje.

    - Funcionalidades:

        - [ ] Mostrar un menú para comenzar el juego o salir.

        - [ ] Permitir al jugador ingresar su elección (piedra, papel o tijera).

        - [ ] Generar aleatoriamente la elección de la computadora.

        - [ ] Comparar ambas elecciones y determinar el ganador de la ronda.

        - [ ] Llevar el puntaje del jugador y la computadora.

        - [ ] Mostrar el puntaje después de cada ronda.

        - [ ] Finalizar el juego después de un número de rondas (al mejor de 5) y declarar al ganador.

        - [ ] Validar entradas para evitar errores.


6. __Gestor de Tareas con Prioridades__

    - __Descripción__: Una versión mejorada de la to-do list que incluye niveles de prioridad y fechas límite para cada tarea.

    - __Funcionalidades__:

        - [ ] Mostrar un menú con opciones: "Agregar tarea", "Ver tareas", "Eliminar tarea", "Ordenar tareas", "Salir".

        - [ ] Cada tarea debe incluir: descripción, prioridad (alta/media/baja) y fecha límite.

        - [ ] Usar una estructura como ArrayList para almacenar objetos de tipo Tarea.

        - [ ] Permitir ordenar las tareas por prioridad o por fecha límite.

        - [ ] Permitir marcar tareas como completadas (y tal vez ocultarlas o moverlas a otra lista).

        - [ ] (Opcional) Guardar las tareas en archivo para mantenerlas entre sesiones.

7. __Agenda de Contactos__

    - __Descripción__: Un programa que permite gestionar una lista de contactos con opciones para agregar, buscar, eliminar y ver todos los contactos.

    - __Funcionalidades__:

        - [ ] Mostrar un menú con opciones: "Agregar contacto", "Buscar contacto", "Eliminar contacto", "Ver todos" y "Salir".

        - [ ] Usar una estructura (por ejemplo, ArrayList o HashMap) para almacenar los contactos.

        - [ ] Cada contacto debe tener nombre, teléfono, email y dirección.

        - [ ] Implementar funciones separadas para cada acción del menú.

        - [ ] Añadir validación para evitar duplicados (por ejemplo, por nombre).

        - [ ] Guardar y cargar los contactos desde un archivo .txt para persistencia de datos.


8. __Conversor de Monedas__

    - __Descripción__: Un programa de consola que convierte una cantidad de dinero entre diferentes monedas. 
    
    _Enfoque en funciones_: Separar las conversiones en métodos individuales para practicar el uso de funciones simples con parámetros y retorno.

    - __Funcionalidades:__

        - [ ] Mostrar un menú: "USD a EUR", "EUR a JPY", etc.

        - [ ] Leer el monto ingresado por el usuario.

        - [ ] Usar métodos como convertUsdToEur(double amount) y convertEurToJpy(double amount).

        - [ ] Mostrar el resultado con 2 decimales.

        - [ ] Permitir repetir el proceso o salir.

9. __Sistema de Gestión de Biblioteca__ 

    - __Descripción__: Programa que simula un sistema básico de biblioteca, donde puedes agregar libros, buscarlos, eliminarlos o ver una lista.

    _Enfoque en funciones y clases_: Implementar una clase Libro y varios métodos para operar sobre una colección de libros.

    - __Funcionalidades__:

        - [ ] Crear la clase Libro con atributos como título, autor, ISBN y disponibilidad.

        - [ ] Implementar métodos para:

            - [ ] Agregar libro (`agregarLibro()`)

            - [ ] Buscar por título o autor (`buscarLibro()`)

            - [ ] Eliminar libro (`eliminarLibro()`)

            - [ ] Mostrar todos los libros (`mostrarLibros()`)

        - [ ] Utilizar listas dinámicas (`ArrayList`) para almacenar los objetos Libro.

        - [ ] Validar duplicados por ISBN.

        - [ ] Permitir prestar o devolver libros (opcional).


10. __Sistema de Registro de Estudiantes con Reportes__ (Alta complejidad)

    - __Descripción__: Un sistema que permite registrar estudiantes, asignarles calificaciones en distintas materias y generar reportes individuales o generales.

    _Enfoque avanzado en métodos y lógica de clases_: Varias clases, funciones con lógica más estructurada, y manejo de listas dentro de objetos.

    - __Funcionalidades__:

        - [ ] Crear clase Estudiante con nombre, ID, y una lista de materias y calificaciones.

        - [ ] Clase Materia con nombre y nota.

        - [ ] Métodos para:

            - [ ] Registrar estudiante (`registrarEstudiante()`)

            - [ ] Agregar materia y nota (`agregarNota()`)

            - [ ] Mostrar promedio del estudiante (`calcularPromedio()`)

            - [ ] Mostrar reporte general de todos los estudiantes (`mostrarReporteGeneral()`)

            - [ ] Buscar estudiante por ID

        - [ ] Usar listas anidadas para manejar estudiantes y sus materias.

        - [ ] Validar que no se repita la misma materia en un mismo estudiante.

        - [ ] (Opcional) Guardar todo en archivos para persistencia.



11. __Tic Tac Toe (Console Game)__
    - __Description:__ A console-based game for two players who take turns placing "X" and "O" on a 3x3 board. The game ends when one player wins or the board is full (a draw).

    - __Function-focused approach:__ Break the game logic into individual functions to practice using parameters, return values, and control structures.

        - [x] Display the current board in the console.

        - [ ] Allow players to input their move (position 1–9).

        - [ ] Validate that the move is legal and the position is free.

        - [ ] Alternate turns between player X and player O.

        - [ ] Check for a winner after each move.

        - [ ] Detect a draw if the board is full and no winner.

        - [ ] Ask if players want to play again or exit.
