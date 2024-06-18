## PAGINA 1

### 1. ATTRIB
Este comando se utiliza para cambiar los atributos de un archivo o directorio. Los atributos comunes incluyen:
- *+h*: Oculta el archivo o directorio.
- *-h*: Muestra el archivo o directorio.

```cmd
ATTRIB [+R | -R] [+A | -A] [+S | -S] [+H | -H] [ruta\archivo]
```
![alt text](/1%20Ev/CMD/img/ATTRB.png)
### 2. CD
Cuando ejecutas cls, la pantalla se borra y se restablece, eliminando cualquier texto o salida anterior que hubiera en la ventana de la consola. Esto proporciona una forma rápida y efectiva de limpiar la pantalla y empezar desde cero.

```cmd
cd [ruta]
```
![alt text](/1%20Ev/CMD/img/CD.png)
### 3. CLS
Limpia la pantalla de cmd.

```cmd
cls
```
![alt text](/1%20Ev/CMD/img/CLS-A.png) 
![alt text](/1%20Ev/CMD/img/CLS-B.png)
### 4. COLOR
Cambia el color del fondo y del texto en cmd. Los colores se representan con números y letras.
0: Negro
1: Azul
2: Verde
3: Aguamarina
4: Rojo
5: Púrpura
6: Amarillo
7: Blanco
8: Gris
9: Azul claro
A: Verde claro
B: Aguamarina claro
C: Rojo claro
D: Púrpura claro
E: Amarillo claro
F: Blanco brillante
 
```cmd
color 0E
```
![alt text](/1%20Ev/CMD/img/COLOR%200E.png)
### 5. CHKDSK
Investiga errores lógicos y físicos en el sistema de archivos de un volumen.

```cmd
chkdsk C:
```
![alt text](/1%20Ev/CMD/img/CHKDSK.png)
### 6. ASSOC
El comando ASSOC se refiere a la palabra "asociación". Cada tipo de archivo tiene una asociación por defecto, pero con este comando podemos gestionar y modificar estas asociaciones. Primero, escribimos ASSOC y presionamos Enter para obtener una lista de todas las asociaciones actuales.
De esta lista, elegimos la línea que dice “.txt=txtfilelegacy” y usamos el comando “ASSOC .txt=” para eliminar esta asociación.
```cmd
assoc .txt=
```
![alt text](/1%20Ev/CMD/img/ASSOC-A.png)

Luego, volvemos a escribir ASSOC y presionamos Enter para verificar que la asociación se haya eliminado. En la lista, que está ordenada alfabéticamente, ya no encontraremos la línea `.txt=txtfilelegacy`, lo que confirma que el comando funcionó correctamente.
```cmd
assoc
```
![alt text](/1%20Ev/CMD/img/ASSOC-B.png)

Luego, escribimos nuevamente ASSOC para que nos muestre una lista de asociaciones actualizada y confirmamos que `.txt=txtfilelegacy` vuelve a aparecer.

![alt text](/1%20Ev/CMD/img/ASSOC-C.png)

![alt text](/1%20Ev/CMD/img/ASSOC-D.png)
### 7. CALL
El comando CALL en el símbolo del sistema de Windows se utiliza principalmente dentro de archivos por lotes (batch files, con extensión .bat) para llamar a otro archivo por lotes y ejecutar sus comandos desde el archivo actual.

```cmd
CALL nombre_archivo [parámetros]
```
![alt text](/1%20Ev/CMD/img/CALL.png)
### 8. CHKNTFS
Comprueba si hay errores en un disco y puede configurar el chequeo al inicio.

```cmd
chkntfs C:
```
![alt text](/1%20Ev/CMD/img/CHKNTFS.png)

## PÁGINA 2

### 1. COPY
Para copiar archivos de una ubicación a otra en Windows, necesitas especificar la ruta completa del archivo que quieres copiar y la ruta completa del destino. 

```cmd
copy C:\origen\archivo.txt D:\destino\
```

![alt text](/1%20Ev/CMD/img/COPY.png)
### 2. DATE
Muestra o cambia la fecha del sistema.

```cmd
DATE [fecha]
```
![alt text](/1%20Ev/CMD/img/DATE.png)
### 3. DIR
El comando DIR se utiliza para mostrar una lista de archivos y carpetas en el directorio actual o en un directorio especificado en sistemas operativos Windows. Este comando proporciona detalles sobre los archivos y carpetas, como sus nombres, tamaños y fechas de modificación.

```cmd
DIR [unidad:][ruta][nombre_del_archivo] [/A[atributos]] [/O[orden]] [/T[fecha]] [/S] [/P] [/Q] [/R] [/W] [/X] [/4]
```
![alt text](/1%20Ev/CMD/img/DIR.png)
### 4. DEL
El comando DEL se utiliza para eliminar archivos permanentemente en sistemas operativos Windows. Este comando borra uno o más archivos de la carpeta especificada y no se pueden recuperar a menos que se tenga una copia de seguridad.

```cmd
DEL [unidad:][ruta][nombre_del_archivo] [/P] [/F] [/S] [/Q] [/A[atributos]]
ERASE [unidad:][ruta][nombre_del_archivo] [/P] [/F] [/S] [/Q] [/A[atributos]]
```
![alt text](/1%20Ev/CMD/img/DEL.png)
### 5. DISKPART
El comando DISKPART se utiliza para gestionar particiones en discos duros en sistemas operativos Windows. Es una herramienta poderosa que permite a los administradores de sistemas crear, eliminar y modificar particiones en discos duros.
```cmd
DISKPART
```
![alt text](/1%20Ev/CMD/img/DISKPART-A.png)
![alt text](/1%20Ev/CMD/img/DISKPART-B.jpg)
```cmd
list disk
```
![alt text](/1%20Ev/CMD/img/DISKPART-C.png)
### 6. EXIT
El comando EXIT se utiliza para cerrar la sesión actual de la línea de comandos (cmd) en sistemas operativos Windows. Este comando finaliza el intérprete de comandos y cierra la ventana de la consola.

```cmd  
EXIT
```
![alt text](/1%20Ev/CMD/img/DISKPART-D.png)
### 7. ERASE
El comando ERASE es equivalente al comando DEL y se utiliza para eliminar archivos permanentemente en sistemas operativos Windows. Al igual que DEL, este comando borra uno o más archivos de la carpeta especificada y no se pueden recuperar a menos que se tenga una copia de seguridad.

```cmd
ERASE [unidad:][ruta][nombre_del_archivo] [/P] [/F] [/S] [/Q] [/A[atributos]]
DEL [unidad:][ruta][nombre_del_archivo] [/P] [/F] [/S] [/Q] [/A[atributos]]
```
![alt text](/1%20Ev/CMD/img/ERASE.png)
### 8. FINDSTR
Busca una cadena de texto en archivos.

```cmd
FINDSTR [/B] [/E] [/L] [/R] [/S] [/I] [/X] [/V] [/N] [/M] [/O] [/P] [/G:Archivo] [/F:Archivo] [/C:String] [cadena [archivo(s)]]
```
![alt text](/1%20Ev/CMD/img/FINDSTR.png)

## PÁGINA 3

### 1. HELP
El comando HELP se utiliza para proporcionar ayuda e información detallada sobre los comandos disponibles en la línea de comandos de Windows. Este comando muestra una lista de comandos con una breve descripción de cada uno, y también puede proporcionar información específica sobre un comando determinado cuando se especifica.

```cmd
HELP comando
HELP CD
```

![alt text](/1%20Ev/CMD/img/HELP.png)
### 2. MOVE
El comando MOVE se utiliza para mover archivos y directorios de una ubicación a otra en sistemas operativos Windows. También puede utilizarse para renombrar archivos y directorios.

```cmd
MOVE [ruta_origen] [ruta_destino]
```
![alt text](/1%20Ev/CMD/img/MOVE.png)
### 3. MD   
El comando MD (Make Directory) se utiliza para crear nuevos directorios en sistemas operativos Windows. Este comando es equivalente a MKDIR.

```cmd 
md directorio1 [directorio ...]
```
![alt text](/1%20Ev/CMD/img/MD.png)
### 4. MKDIR
El comando MKDIR (Make Directory) se utiliza para crear nuevos directorios en sistemas operativos Windows. Este comando es equivalente a MD.

```cmd
mkdir directorio1 [directorio1 ...]
```
![alt text](/1%20Ev/CMD/img/MDKIR.png)
### 5. PATH
El comando PATH se utiliza para mostrar o establecer la variable de entorno PATH en sistemas operativos Windows. La variable PATH especifica los directorios en los que el sistema busca archivos ejecutables. Modificar esta variable permite que los ejecutables ubicados en directorios especificados puedan ser ejecutados desde cualquier ubicación en la línea de comandos.

```cmd
PATH [ruta[;ruta2[;...]]]
PATH
```  
![alt text](/1%20Ev/CMD/img/PATH.png)
### 6. FSUTIL
El comando FSUTIL proporciona varias utilidades relacionadas con el sistema de archivos en sistemas operativos Windows. Este comando es una herramienta avanzada destinada a administradores de sistemas y usuarios avanzados para realizar tareas específicas en volúmenes, archivos y otros aspectos del sistema de archivos.

```cmd
FINDSTR [opciones] "cadena_de_búsqueda" [archivos]
```

![alt text](/1%20Ev/CMD/img/FSUTIL.png)
### 7. MODE
El comando MODE se utiliza para configurar o mostrar configuraciones de dispositivos como pantallas, impresoras y teclados en sistemas operativos Windows. Este comando permite ajustar varios parámetros y obtener información sobre el estado actual de estos dispositivos.

```cmd
mode [device] [option]
```
![alt text](/1%20Ev/CMD/img/MODE.png)
### 8. OPENFILES
El comando OPENFILES se utiliza para mostrar o desconectar archivos abiertos y bloqueados en sistemas operativos Windows. Este comando es útil para administradores de sistemas para gestionar y solucionar problemas relacionados con archivos y recursos compartidos que están siendo utilizados por usuarios o aplicaciones en una red.

```cmd
OPENFILES [/Local | /Global] [/Query | /Disconnect] [/ID:id | /OP:path]
```
![alt text](/1%20Ev/CMD/img/OPENFILES.png)

## PÁGINA 4
### 1. RD
El comando RD (Remove Directory) se utiliza para eliminar directorios vacíos en sistemas operativos Windows. Si el directorio contiene archivos o subdirectorios, no se puede eliminar a menos que se use la opción adecuada para eliminar su contenido primero.

```cmd 
RD ruta_del_directorio
```
![alt text](/1%20Ev/CMD/img/RD.png)
### 2. RMDIR
El comando RMDIR (Remove Directory) es una versión alternativa del comando RD que se utiliza para eliminar directorios en sistemas operativos Windows. Funcionalmente, RMDIR y RD son equivalentes y pueden usarse de manera intercambiable.

```cmd
RMDIR [/S] [/Q] ruta_del_directorio
```
![alt text](/1%20Ev/CMD/img/RMDIR.png)
### 3. REN
El comando REN (Rename) se utiliza para cambiar el nombre de un archivo o directorio en sistemas operativos Windows. Este comando es útil para organizar y administrar archivos y carpetas renombrándolos de acuerdo a sus necesidades.
```cmd
REN [ruta\]nombre_antiguo [nombre_nuevo]
```

![alt text](/1%20Ev/CMD/img/REN-A.png)

![alt text](/1%20Ev/CMD/img/REN-B.png) 
### 4. RENAME
El comando RENAME (o su abreviatura REN) se utiliza para cambiar el nombre de un archivo o directorio en sistemas operativos Windows. Este comando permite modificar el nombre de archivos o carpetas existentes sin alterar su contenido.
```cmd
rename [ruta\]nombre_antiguo [nombre_nuevo]
```

![alt text](/1%20Ev/CMD/img/RENAME-A.png)

![alt text](/1%20Ev/CMD/img/RENAME-B.png) 
### 5. ROUTE
El comando ROUTE se utiliza para mostrar y modificar la tabla de enrutamiento IP del sistema en sistemas operativos Windows. La tabla de enrutamiento contiene información sobre las rutas de red que el sistema utiliza para enviar paquetes de datos a sus destinos. Este comando es útil para la administración de redes y la solución de problemas de conectividad.

```cmd
ROUTE [-f] [-p] [comando [destino] [máscara de red] [puerta de enlace] [métrica]]
```
![alt text](/1%20Ev/CMD/img/ROUTE.png)
### 6. SET
El comando SET se utiliza para mostrar, establecer o modificar variables de entorno en sistemas operativos Windows. Las variables de entorno son valores dinámicos que pueden afectar la forma en que los procesos del sistema se comportan.
```cmd
SET NOMBRE=VALOR
```

![alt text](/1%20Ev/CMD/img/SET.png)
### 7. PAUSE
El comando PAUSE se utiliza para pausar la ejecución de un script o comandos en la línea de comandos de Windows hasta que el usuario presione una tecla. Este comando es útil para detener temporalmente la ejecución de un script para permitir al usuario revisar mensajes o resultados intermedios antes de continuar.

```cmd
PAUSE
```
![alt text](/1%20Ev/CMD/img/PAUSE.png)
### 8. PUSHD/POPD
Los comandos PUSHD y POPD se utilizan para guardar y restaurar la ruta actual del directorio en la línea de comandos de Windows. Estos comandos son útiles para navegar temporalmente a otros directorios y luego volver al directorio original sin tener que recordar y escribir la ruta completa.
```cmd
PUSHD [ruta]
POPD
```

![alt text](/1%20Ev/CMD/img/PUSHD-POPD.png) 

## PAGINA 5
### 1. TREE
El comando TREE se utiliza para mostrar la estructura de directorios y subdirectorios de una unidad o ruta específica en forma de árbol. Este comando es útil para visualizar la jerarquía de carpetas de manera clara y organizada.

```cmd
tree /F /A > estructura_directorios.txt
```
![alt text](/1%20Ev/CMD/img/TREE.png) 
### 2. TYPE
El comando TYPE se utiliza para mostrar el contenido de un archivo de texto en la línea de comandos en sistemas operativos Windows. Es útil para visualizar rápidamente el contenido de archivos sin necesidad de abrir un editor de texto.

```cmd
TYPE nombre_archivo
```
![alt text](/1%20Ev/CMD/img/TYPE.png) 
### 3. VER
El comando VER se utiliza para mostrar la versión del sistema operativo Windows que se está ejecutando en la computadora.

```cmd
VER
```
![alt text](/1%20Ev/CMD/img/VER.png) 
### 4. VOL
El comando VOL se utiliza para mostrar la etiqueta del volumen y el número de serie del disco de una unidad de disco específica en sistemas operativos Windows.
```cmd
VOL
```

![alt text](/1%20Ev/CMD/img/VOL.png) 
### 5. WMIC
El comando WMIC (Windows Management Instrumentation Command-line) se utiliza para obtener información detallada del sistema a través de la línea de comandos en sistemas operativos Windows. Este comando permite interactuar con el sistema operativo y recuperar una amplia gama de datos sobre el hardware, software, y configuración del sistema.

```cmd
wmic [opciones] [clase] [método] [filtro]
```

![alt text](/1%20Ev/CMD/img/WMIC-A.png) 

![alt text](/1%20Ev/CMD/img/WMIC-B.png) 
### 6. TIME
El comando TIME se utiliza para mostrar o cambiar la hora del sistema en una computadora.
```cmd
TIME 
TIME HH:mm 
```

![alt text](/1%20Ev/CMD/img/TIME.png) 
### 7. TITLE
El comando TITLE se utiliza en el sistema operativo Windows para establecer el título de la ventana del símbolo del sistema (cmd). Este comando es útil para personalizar la ventana de comandos, especialmente cuando se trabajan con múltiples ventanas o scripts que necesitan ser diferenciados fácilmente.
```cmd
TITLE [texto]
```

![alt text](/1%20Ev/CMD/img/TITLE-A.png) 
![alt text](/1%20Ev/CMD/img/TITLE-B.png) 
### 8. XCOPY
El comando xcopy se emplea para copiar archivos y directorios de un lugar a otro, preservando la estructura de los subdirectorios y pudiendo incluir archivos vacíos. Esta herramienta es especialmente útil en la administración de sistemas y en tareas de respaldo y migración de datos.

```cmd
xcopy C:\origen D:\destino /E
```

![alt text](/1%20Ev/CMD/img/XCOPY.png) 

