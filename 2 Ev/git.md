
### Tareas del Proyecto Git

#### 1. Iniciar el software Git Bash. Utilizar la Shell Mingw64 siguiendo los manuales de descarga e instalación proporcionados. Mostrar un pantallazo de su pantalla de inicio.
- Abre Git Bash en tu ordenador.
- La Shell Mingw64 debería aparecer.

#### 2. Ejecutar por pantalla algún comando Linux. Probar que funciona. Escribir un comando que borre el contenido de la pantalla. Capturar el momento antes y después.
- Para probar los comandos Linux en Git Bash, utiliza los siguientes ejemplos:
  ```bash
  echo "Hello World"   # Muestra un mensaje en pantalla
  clear                # Borra el contenido de la pantalla
  ```

#### 3. Visualiza por pantalla varias combinaciones útiles del comando CTRL. Se proporciona una lista de las combinaciones de las teclas más usadas. L C U K A E. Probarlas todas.
- Algunas combinaciones útiles de teclas CTRL incluyen:
  - `CTRL + L`: Limpia la pantalla.
  - `CTRL + C`: Termina el comando actual.
  - `CTRL + U`: Borra la línea de comando actual.
  - `CTRL + K`: Borra desde el cursor hasta el final de la línea.
  - `CTRL + A`: Mueve el cursor al inicio de la línea.
  - `CTRL + E`: Mueve el cursor al final de la línea.

#### 4. Averiguar la versión de Git que se está usando actualmente en vuestro PC. Para ello ejecutar un comando Git. Y luego opcionalmente actualizar la versión a la última.

- Para verificar la versión actual de Git, usa:
  ```bash
  git --version
  ```

#### 5. Mostrar por pantalla la lista de configuración de la sesión actual de Git. Todo lo que se pide es por comandos. Nos servirá para ver la información inicial preconfigurada.

- Para ver la configuración actual de Git, usa:
  ```bash
  git config --list
  ```

#### 6. Verificar en la configuración inicial que no hay nombre de usuario. Y que tampoco hay correo electrónico asociado al usuario. Configurar de forma global un usuario y un email asociado. Verificar consultando la lista de configuración que se han creado ambos. Probar luego a borrar tanto usuario como email. Luego volver a crear los mismos de nuevo.

- Configurar globalmente un usuario y un correo:
  ```bash
  git config --global user.name "TuNombre"
  git config --global user.email "tuemail@example.com"
  git config --global --unset user.name    # Para borrar el usuario
  git config --global --unset user.email   # Para borrar el email
  ```

#### 7. Ejecutar un comando de Linux para mostrar por pantalla la dirección del directorio actual

- Para mostrar la ruta del directorio actual:
  ```bash
  pwd
  ```

#### 8.  Listar con un comando Linux (nunca uséis para ningún apartado instrucciones de CMD) el directorio actual, es decir, mostrar todos los archivos, carpetas, etc.
- Para listar todos los archivos y carpetas del directorio actual:
  ```bash
  ls -la
  ```

#### 9. Moverse a través de los directorios de tu disco duro principal o unidad C. Tanto a la derecha en el árbol de directorio. Como luego a la izquierda volviendo al directorio inicial.
- Para moverse a través de los directorios:
  ```bash
  cd path/to/directory   # Moverse a la derecha en el árbol de directorios
  cd ..                  # Moverse a la izquierda, al directorio superior
  ```

#### 10. Utilizar un comando que te lleve a la raíz del usuario. Suele ser la misma en la que inicia el software Bash. Y otro comando que te lleve a la raíz del sistema. Suele ser la unidad C.
- Para ir a la raíz del usuario:
  ```bash
  cd ~
  ```
- Para ir a la raíz del sistema:
  ```bash
  cd /
  ```

#### 11. Dirígete a la raíz del sistema operativo, para Windows es disco donde este instalado, y crea una carpeta que se llame como tu correo electrónico, sin arroba, y sin el texto a la derecha de arroba. Dentro de esa carpeta crea una subcarpeta que se llame Git en minúsculas. Y ejecuta una instrucción de Linux que muestre todos los elementos que contengan la palabra Git.

- Para crear una carpeta y una subcarpeta:
  ```bash
  mkdir -p ~/miemail/Git
  ```
- Para buscar elementos que contengan "Git":
  ```bash
  ls | grep Git
  ```

#### 12. Borra el directorio correspondiente a la carpeta Git. En todos los casos de este trabajo, cuando borramos algún elemento que luego necesitamos, repetimos los pasos para poder crearlo nuevamente. De modo que podamos continuar con el desarrollo de este proyecto 
- Para borrar el directorio:
  ```bash
  rm -r ~/miemail/Git
  ```

#### 13. Entra en la carpeta Git. Y genera una subcarpeta que se llame proyecto. Una vez dentro de esta subcarpeta ejecuta la orden que inicializar un repositorio Git en la ruta actual.
- Para inicializar un repositorio Git:
  ```bash
  mkdir -p ~/miemail/Git/proyecto
  cd ~/miemail/Git/proyecto
  git init
  ```

#### 14. Ahora borra de forma completa dicho repositorio. Hazlo con una única instrucción. Y asegurare luego de que ya no existe. Recuerda como ya se dijo luego debes iniciarlo de nuevo. 
- Para borrar un repositorio Git completamente:
  ```bash
  rm -rf .git
  ```

#### 15. Muestra con una orden el estado actual del repositorio. Debe de aparecer un mensaje de respuesta indicando que no hay ningún commit hecho. Muestra el mismo estado, pero añade un modificador a la orden para que la respuesta sea resumida, respecto a la anterior.
- Para mostrar el estado actual del repositorio:
  ```bash
  git status
  ```
- Para una respuesta resumida:
  ```bash
  git status -s
  ```

#### 16. Visualiza la información actual del historial o registro de tu repositorio. Se llama log
- Para ver el historial o log:
  ```bash
  git log
  ```

#### 17.  Ejecuta un editor de código desde línea de comandos. Puede ser alguno que tengas instalado en tu maquina por defecto. Por ejemplo, el bloc de notas. Una vez abierto crea un documento que sea una página web Hola Mundo. Salva el documento. Y comprueba existe. Luego bórralo, y recuerda, siempre que efectúas una acción en Git se comprueba si se hizo. 
- Abre un editor y crea un archivo "Hola Mundo":
  ```bash
  notepad hola_mundo.html
  ```
  - Guarda el archivo y verifica que exista.

#### 18. Con el fichero de la página web generado, repitiendo los pasos. Comprueba el estado de tu repositorio. Debes obtener una respuesta acerca de tu fichero indicando que no es parte del seguimiento. Haz también la comprobación del estado, pero de forma resumida. 
  ```bash
  git status
  git status -s
  ```

#### 19. Añade el fichero al seguimiento del repositorio Git. Se puede añadir el fichero de forma individual o colectiva. Utiliza las dos instrucciones si esto fuera posible. Si no lo es, utiliza una instrucción y explica la otra.
- Para añadir el archivo al seguimiento:
  ```bash
  git add hola_mundo.html
  ```
- Para añadir todos los archivos:
  ```bash
  git add .
  ```

#### 20. Seguidamente visualiza el estado de tu repositorio, de forma extendida y abreviada, tras añadir el fichero. Aparecerá un mensaje de respuesta marcando los cambios para commit. 
- Verificar el estado extendido y abreviado:
  ```bash
  git status
  git status -s
  ```

#### 21. Ahora revierte los cambios, es decir, saca del seguimiento a ese fichero. Verifica el estado de tu repositorio para ver que el fichero esta fuera del seguimiento. 
- Para sacar el archivo del seguimiento:
  ```bash
  git reset hola_mundo.html
  ```

#### 22. Realiza un commit del fichero, que debes previamente haber añadido al seguimiento Git, especificando un mensaje descriptivo, por ejemplo, primer lanzamiento. Verifica siempre el estado tras realizar una acción relevante. Y por último muestra el log. 
- Para hacer un commit con un mensaje descriptivo:
  ```bash
  git commit -m "Primer lanzamiento"
  ```
- Verificar el estado y el log después del commit.

#### 23.  Lista el directorio actual donde se encuentra el fichero. Abre dicho fichero con un editor.Realiza un cambio en la página web que contiene el fichero. Salvo todos los cambios antes de cerrar el fichero. Y comprueba el estado de Git viendo si hay modificaciones. Para finalizar da marcha atrás con una orden a dichas modificaciones. Y comprueba el estado final.
- Abre el archivo, realiza cambios y verifica el estado:
  ```bash
  notepad hola_mundo.html
  ```
- Verificar si hay modificaciones y revertir:
  ```bash
  git status
  git checkout -- hola_mundo.html
  ```

#### 24. Repite los pasos anteriores. Lista el directorio, abre el fichero, realiza un cambio, una vez salvado y cerrado comprueba el estado del repositorio. La respuesta debe ser que de nuevo ha habido modificaciones, pero ahora debes añadirlas al seguimiento, y comprobar su estado. 
- Realiza un cambio, guarda, añade al seguimiento, y verifica el estado:
  ```bash
  notepad hola_mundo.html
  git add hola_mundo.html
  git status
  ```

#### 25. Antes de continuar verifica el log por pantalla, debería haber solo un lanzamiento, es decir primer lanzamiento. Verifica el estado largo y corto, para luego proceder a realizar otro commit, con nombre y orden correctos por ejemplo segundo lanzamiento. Comprueba que el mensaje de respuesta para el estado es similar al lanzamiento anterior, pero que el log ha aumentado.
- Verifica el log y realiza otro commit:
  ```bash
  git log
  git status
  git commit -m "Segundo lanzamiento"
  git log
  ```

#### 26.Muestra la ayuda de todos los comandos Git. Una vez dentro de la ayuda sal introduciendo la letra q. Ahora muestra la ayuda de un comando en particular que tu elijas. 
- Para mostrar la ayuda de todos los comandos Git:
  ```bash
  git help
  ```
- Para la ayuda de un comando en particular:
  ```bash
  git help <comando>
  ```

#### 27. Lista el directorio de tu proyecto Git. Verifica que el archivo sobre el que trabajamos esta físicamente. Y elimínalo. Lista a continuación la ruta para ver que no aparece. Y ejecuta una orden de Git para verificar si realmente el mismo fichero sigue estando en el repositorio. 
- Verifica que el archivo esté presente y elimínalo:
  ```bash
  ls
  rm hola_mundo.html
  ls
  git status
  ```

#### 28. Muestra el estado de tu carpeta asociada a tu repositorio. La respuesta debe de indicar que al fichero ha sido eliminado. Restaura el fichero con un comando Git. Y luego usa una orden Linux para listar el directorio, verificando se recuperó físicamente el fichero original. 
- Para restaurar el archivo eliminado:
  ```bash
  git checkout -- hola_mundo.html
  ls
  ```

#### 29. Visualiza el log de tu repositorio. Además, visualízalo también en un formato de una línea, para ello, utiliza la misma orden con un modificador concreto. Deben de aparecer ordenados los dos lanzamientos efectuados. Y los códigos que los identifican. 
- Mostrar el log en una línea:
  ```bash
  git log --oneline
  ```

#### 30. Ejecuta una orden para revertir el segundo lanzamiento en el log. Has de emplear el código asociado a dicho lanzamiento. Luego vuelve a ver el log en el formato de una única línea. Debe aparecer una línea extra de información en el log. 
- Revertir usando el código del log:
  ```bash
  git revert <código-del-segundo-lanzamiento>
  ```

#### 31. Repite justo los mismos pasos que en el apartado anterior. Pero en vez de indicar el código, esta vez lo sustituyes por la palabra reservada cabecera en inglés HEAD. Veras que la respuesta es la misma que en el apartado anterior. Da una explicación a esta coincidencia. 
- Revertir usando HEAD:
  ```bash
  git revert HEAD
  ```

#### 32. Muestra el log en formato única línea. Ahora resetea con una orden Git el código referido al segundo lanzamiento, es decir, el del medio. Y vuelve a mostrar el log. Tendrá que aparecer la misma información, que la primera vez que utilizaste el log, o sea dos registros del historial. 
- Resetear al segundo lanzamiento:
  ```bash
  git reset <código-del-segundo-lanzamiento>
  git log
  ```

#### 33. Muestra el estado del repositorio de nuevo. Debe aparecer el archivo modificado. Restaura dicho archivo usando un comando Git. Y verifica a continuación el estado del repositorio. No debe aparecer ningún archivo que pueda hacerse commit.

- Para restaurar un archivo modificado:
  ```bash
  git restore <archivo>
  ```

#### 34. Muestra el log de única línea. Veras el primer y segundo lanzamiento y sus mensajes. Con una orden Git debes corregir o rectificar el último lanzamiento escribiendo un nuevo mensaje que sea tercer lanzamiento. Comprueba ha cambiado del segundo al tercero. Es decir, que cuando ejecutes el log de única línea, veras que aparecen el primero y el tercero.

- Para corregir el último mensaje del commit:
  ```bash
  git commit --amend -m "Tercer lanzamiento"
  ```

#### 35. Abre el fichero con tu editor. Realiza un cambio en él diferente a los que ya hayas realizado antes. Guárdalo y ciérralo. Comprueba el estado del repositorio para verificar que el fichero ha sido modificado. Vuelve a hacer justo lo mismo del apartado anterior, es decir, debes corregir o rectificar el último lanzamiento, sustituyendo el mensaje de tercero por cuarto. Por último, muestra el log en una única línea. Veras el primero y el cuarto lanzamiento.
- Realiza un cambio y guarda el archivo, luego rectifica el commit:
  ```bash
  notepad hola_mundo.html
  git commit --amend -m "Cuarto lanzamiento"
  ```

#### 36. Visualiza la estructura de ramas de Git. Recordar la rama principal se llama master. Crea para Git una nueva rama de tu repositorio. La nueva rama se va a llamar `apprentice`. Una vez creada ejecuta una orden Git para visualizar de nuevo todas las ramas de tu repositorio.
- Crear una nueva rama llamada `apprentice`: 
  ```bash
  git branch apprentice
  git branch
  ```

#### 37. Borra la rama apprentice que acabas de crear. Y comprueba que se ha borrado. Debe de aparecer únicamente la rama principal llamada master. 
- Borrar la rama `master`:
  ```bash
  git branch -d apprentice
  git branch
  ```

#### 38. Siempre que borramos algo del proyecto luego lo creamos de nuevo para continuar. Por tanto, visualizar que existan ambas ramas `master` y `apprentice`. Situados en la rama `master`, lo que hacemos es cambiar a la rama `apprentice`, ejecutando una orden Git. Y mostramos el log donde deberás ver tus dos lanzamientos, pero desde la perspectiva de tu rama actual.  
- Crear y cambiar entre ramas:
  ```bash
  git branch apprentice
  git checkout apprentice
  git log
  ```

#### 39. Lista desde tu rama `apprentice` los elementos del directorio asociado a tu repositorio. Abre el archivo, modifícalo añadiendo texto a la página web, guárdalo y ciérralo. Visualiza el estado actual del repositorio. Veras ha sido modificado el archivo, añádelo al seguimiento, muestra el estado de nuevo, luego realiza en Git un commit llamado quinto lanzamiento, y termina con la ejecución del comando log en una única línea. Veras que aparecen tres lanzamientos.
- Modificar archivo y realizar commit:
  ```bash
  notepad hola_mundo.html
  git add hola_mundo.html
  git commit -m "Quinto lanzamiento"
  git log --oneline
  ```

#### 40. Muestra las ramas existentes. Estando en la rama apprentice cambia a la rama master.Ahora cambia a una nueva rama que denominamos `emergency`. En ella lista los elementos del directorio, abre el editor, modifica el fichero, guárdalo y ciérralo. 
- Crear y modificar archivo en la rama `emergency`:
  ```bash
  git branch emergency
  git checkout emergency
  notepad hola_mundo.html
  ```

#### 41. Verifica por pantalla el estado actual del repositorio. Veras el archivo modificado. Añade dicho archivo al seguimiento. Comprueba de nuevo su estado. Realiza un commit con nombre por ejemplo sexto lanzamiento. Y  muestra el log en una única línea  resumido. Deberías de ver tres lanzamientos en total.  
- Realizar commit en `emergency`:
  ```bash
  git add hola_mundo.html
  git commit -m "S
  git log --oneline
  ```

#### 42. Visualiza todas las ramas. Estando en la rama `emergency` cambia a la rama master. Fusiona todos los cambios de la rama actual, es decir, fusiona la rama principal con la rama que se especifica en el comando fusionar o sea la rama `emergency` anteriormente creada. Por último, elimina la rama `emergency`. Debe dar un aviso de la acción efectuada. Muestra todas las ramas  por pantalla para asegurarte. 
- Fusionar ramas y borrar `emergency`:
  ```bash
  git checkout master
  git merge emergency
  git branch -d emergency
  git branch
  ```


#### 43.  Estando en la rama principal denominada master. Cambia a la rama `apprentice`. Lista los elementos del directorio, abre el editor con un comando, modifica, guarda y cierra el fichero.
- Modificar archivo en `apprentice`:
  ```bash
  git checkout apprentice
  notepad hola_mundo.html
  ```

#### 44. Estando en la rama apprentice verifica el estado de tu repositorio. Debe aparecer el fichero como modificado. Añádelo al seguimiento, comprueba que cambio el estado en Git, y luego realiza un commit indicando en el mensaje séptimo lanzamiento. Muestra el log, donde has de comprobar, aparecen un total de cuatro lanzamientos.
- Realizar commit:
  ```bash
  git add hola_mundo.html
  git commit -m "Séptimo lanzamiento"
  git log
  ```

#### 45. Desde la rama actual o sea `apprentice`. Lista todas las ramas. Y luego cambia a la rama `master` de tu repositorio. Efectúa una unión de la rama actual `master` con la rama que tú le indiques en la instrucción Git que será la rama `apprentice`. Esto debe de generar un conflicto a través de un mensaje por pantalla. Para resolver el conflicto debes abortar la unión con otro comando Git. Y verificar que en el estado final está todo correcto sin errores. 
- Generar un conflicto y abortar:
  ```bash
  git checkout master
  git merge apprentice
  git merge --abort
  git status
  ```

#### 46. Vamos a realizar un nuevo intento. Desde la rama actual o sea apprentice. Mostramos todas las ramas. Cambiamos a la rama master. Comprobamos el estado actual para verificar que todo está correcto. Efectuamos una fusión de la rama actual master con la rama que le indiquemos que será apprentice. La respuesta debe ser un mensaje de conflicto.
- Resolver el conflicto:
  ```bash
  git checkout master
  git merge apprentice
  ```

#### 47. Vamos a resolver el conflicto actual. Mostramos el estado del repositorio donde aparecerá el fichero modificado. Añadimos los cambios del fichero al seguimiento. Volvemos a mostrar el estado actual. Y hacemos un commit con nombre octavo lanzamiento. Para finalizar se muestra el log con el modificador única línea. Veremos un total de seis lanzamientos.
- Realizar commit del conflicto:
  ```bash
  git add hola_mundo.html
  git commit -m "Octavo lanzamiento"
  git log --oneline
  ```

#### 48. Desde la actual rama principal o master, visualizamos todas las ramas. A continuación, borramos la rama `apprentice`. Intentamos cambiar a la rama `apprentice`. Aparecerá un aviso de que no existe. Mostramos nuevamente todas las ramas solo quedara la rama master. Y además se representa por pantalla el estado actual deberá que estar todo correcto. 
- Borrar y verificar:
  ```bash
  git branch -d apprentice
  git checkout apprentice
  ```

#### 49. Busca información sobre comandos en Git. Ejecuta una instrucción útil que todavía no se haya usado hasta ahora. Y explica brevemente su funcionamiento como comando.
- Buscar un comando nuevo:
  ```bash
  git reflog
  ```

#### 50. Ejecuta un comando para salir de la Shell, pero antes de ello realiza un pantallazo. Con ello debe cerrarse el programa. Si no ejecuta los comandos necesarios para terminar. The end.
- Salir de Git Bash:
  ```bash
  exit
  ```

#### 51. A continuación se van a emplear varios comandos Linux para un mejor manejo de la `Shell`. Usar el comando `find` con los modificadores maxdepth de tamaño uno y type referido a directorios. Hacer lo mismo, pero negando el modificador type. 
- Para listar directorios con `maxdepth` y `type`:
  ```bash
  find . -maxdepth 1 -type d
  ```
- Para negar el modificador `type`:
  ```bash
  find . -maxdepth 1 ! -type d
  ```

#### 52. Ejecutar en una misma línea de comando, la orden `ls` solo para ficheros, y `grep` para encontrar la barra mayúscula siete. Hacer lo mismo, pero negando el modificador `grep`.
- Listar solo ficheros y encontrar la barra mayúscula siete:
  ```bash
  ls -p | grep -v /
  ls -p | grep 7
  ```
- Para negar el modificador `grep`:
  ```bash
  ls -p | grep -v 7
  ```

#### 53. Listar con una orden Linux el directorio delrepositorio. Mostrar por la consola directamente el contenido del fichero. No es válido usar ningún editor de código.
- Para listar el directorio del repositorio:
  ```bash
  ls
  ```
- Para mostrar el contenido del fichero:
  ```bash
  cat nombre_del_fichero
  ```

#### 54. Listar la ruta actual del repositorio. Mover el fichero a una ruta más a la izquierda. Sin cambiar de ruta listar la ruta donde se movió el fichero.

- Mover el fichero a una ruta más a la izquierda:
  ```bash
  mv nombre_del_fichero ../nueva_ruta/
  ```
- Listar la ruta donde se movió el fichero:
  ```bash
  ls ../nueva_ruta/
  ```

#### 55. Listar la ruta del proyecto de nuevo. Ejecutar un comando que muestre por pantalla la ruta absoluta del directorio donde te encuentras. Cambiar al directorio donde moviste el fichero es decir un lugar a la izquierda. Desde esta nueva ubicación mover el fichero a la ruta donde estaba antes o sea la ruta de la carpeta del proyecto. Lista dicha ruta desde la ruta actual. Por último, cambiar a la ruta de la carpeta del proyecto donde ahora está el fichero y listarlo
- Mostrar la ruta absoluta:
  ```bash
  pwd
  ```
- Moverse y listar directorios:
  ```bash
  cd ../nueva_ruta/
  mv nombre_del_fichero ../ruta_original/
  cd ../ruta_original/
  ls
  ```

#### 56. Listar la ruta verificando se encuentra el archivo. Copiar dicho archivo en la ruta llamada Git que se genero al inicio. Comprobar que ahora el archivo existe en ambas rutas. Dirigirse a la nueva ruta donde se copio y borrarlo. Volver a la ruta original y listar la misma de nuevo.
- Verificar y copiar el archivo:
  ```bash
  cp nombre_del_fichero ~/Git/
  ls ~/Git/
  rm ~/Git/nombre_del_fichero
  ls ~/Git/
  ```

#### 57. Estando en la carpeta raíz del proyecto. Cambiamos a una carpeta más a la izquierda. Copiamos toda la carpeta de forma recursiva a otra ubicación. Cambiamos a dicho lugar, listando todas las carpetas que contengan parte de la palabra proyecto. Una vez encontrado, eliminamos de forma recursiva esta copia del proyecto y verificamos que desapareció. Por último, volvemos a la ruta estándar de nuestro repositorio y comprobamos está el proyecto.
- Copiar carpeta recursivamente:
  ```bash
  cp -r carpeta_origen carpeta_destino
  cd carpeta_destino
  ls | grep proyecto
  rm -r carpeta_destino
  cd carpeta_origen
  ```

#### 58.  Listamos todos los elementos del repositorio. Aparecerá nuestro fichero. Renombramos el fichero a otro nombre. Verificamos listando el directorio el nombre ha cambiado. De nuevo renombramos este nuevo fichero a su nombre original. Y lo volvemos a listar por pantalla.

- Renombrar fichero:
  ```bash
  mv nombre_del_fichero nuevo_nombre
  ls
  mv nuevo_nombre nombre_del_fichero
  ls
  ```

#### 59. Listamos otra vez el repositorio Git, pero ahora lo listamos mostrando en columnas los detalles referentes al fichero, empleando un modificador junto al comando listar. Ejecuta un comando para ver el directorio actual por pantalla. Cambia al directorio que esta justo una posición a la izquierda. Y lista este directorio como antes con todos los detalles, pero ahora del directorio Git. Para ello usa el mismo modificador del comando listar de nuevo. 
- Listar con detalles:
  ```bash
  ls -l
  cd ..
  ls -l Git
  ```

#### 60. Para el fichero de nuestro repositorio. Cambia los permisos de este a 000 y 755. Antes y
- Cambiar permisos:
  ```bash
  chmod 000 nombre_del_fichero
  ls -l
  chmod 755 nombre_del_fichero
  ls -l
  ```

#### 61. Realizar las siguientes tareas en una única línea de comando. Listar directorio, cambiar al directorio a la izquierda del actual, listar el nuevo directorio, volver a la ubicación del proyecto un lugar más a la derecha, y listar nuevamente sus elementos
- Listar, cambiar, listar, volver y listar:
  ```bash
  ls && cd .. && ls && cd - && ls
  ```

#### 62. Muestra todos los procesos activos del sistema. Finaliza uno de ellos. Sal de Bash. The end.
- Mostrar procesos activos:
  ```bash
  ps aux
  ```
- Finalizar un proceso:
  ```bash
  kill PID   # Reemplaza PID con el ID del proceso a terminar
  ```
- Salir de Bash:
  ```bash
  exit
  ```
