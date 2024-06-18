# BIOS 

La BIOS (Basic Input/Output System) es el software que controla el arranque de tu computadora y gestiona la comunicación entre el hardware y el software. Aquí tienes una guía simplificada y fácil de entender sobre las principales secciones de la BIOS y sus funciones.

#### 1. Pantalla Principal (Main)
Esta es la pantalla principal de la BIOS donde puedes ver información básica del sistema:

![[Main.jpg]]
*Imagen 1: Pantalla Principal (Main)*

1. **Marketing Name**: Nombre comercial del producto. Útil para saber exactamente qué modelo de dispositivo tienes.
2. **Model Name**: Nombre del modelo del dispositivo. Necesario para buscar soporte técnico o actualizaciones específicas.
3. **System Date**: Ajusta la fecha del sistema. Importante para mantener la sincronización de eventos y registros.
4. **System Time**: Ajusta la hora del sistema. Esencial para la sincronización de actividades y eventos.
5. **System Language**: Selecciona el idioma en que se mostrará la BIOS.
6. **Storage Information**: Muestra detalles sobre los discos duros y SSD conectados.
7. **System Information**: Información detallada sobre el hardware, como el tipo de procesador y la cantidad de memoria RAM.

#### 2. Configuración Avanzada (Advanced)
Aquí puedes realizar ajustes avanzados en tu sistema:

![[Advanced.jpg]]
*Imagen 2: Configuración Avanzada (Advanced)*

1. **Enable VMD controller**: Habilita o deshabilita el controlador VMD para gestionar unidades de almacenamiento avanzadas.
2. **Intel Speed Shift Technology**: Permite que la CPU ajuste su rendimiento y consumo de energía según las necesidades del sistema.
3. **ERP lot 3 support**: Reduce el consumo de energía en modo de espera.
4. **BACKSLASH/ALT Key Swap**: Cambia las funciones de las teclas de retroceso y ALT.
5. **Network Stack**: Habilita opciones de red avanzadas, útil para arranque desde red.
6. **Intel Virtualization Technology**: Habilita la virtualización en la CPU, necesaria para ejecutar máquinas virtuales.
7. **VT-d**: Habilita la virtualización de dispositivos de hardware específicos para máquinas virtuales.
8. **Hyper-Threading**: Permite que cada núcleo de la CPU ejecute múltiples hilos simultáneamente, mejorando el rendimiento.
9. **CPU C states**: Controla los estados de ahorro de energía de la CPU.
10. **Allow BIOS Downgrade**: Permite volver a versiones anteriores de la BIOS.
11. **User Scenario**: Configura perfiles de uso para ajustar el rendimiento y el consumo de energía.
12. **ME firmware Windows Update**: Permite actualizar el firmware del Motor de Gestión de Intel a través de Windows Update.
13. **USB Power Share in Hibernation and S...**: Configura si los puertos USB deben seguir proporcionando energía en hibernación.
14. **USB Controller**: Habilita o deshabilita los controladores USB.

#### 3. Configuración de Arranque (Boot)
Ajustes relacionados con el arranque del sistema:

![[Boot.jpg]]
*Imagen 3: Configuración de Arranque (Boot)*

1. **Boot Configuration**: Parámetros generales de arranque.
2. **Fast Boot**: Reduce el tiempo de arranque del sistema.
3. **Boot mode select**: Elige entre modo de arranque UEFI o Legacy.
4. **Full Screen MSI Logo Display**: Muestra el logo de MSI a pantalla completa durante el arranque.
5. **FIXED BOOT ORDER Priorities**: Define el orden de los dispositivos de arranque.

#### 4. Seguridad (Security)
Ajustes para proteger tu sistema:

![[Security.jpg]]
*Imagen 4: Seguridad (Security)*

1. **Administrator Password**: Establece una contraseña para acceder a la configuración de la BIOS.
2. **User Password**: Establece una contraseña de usuario para proteger el acceso a la BIOS.
3. **Password Check**: Verificación de contraseña al inicio del sistema.
4. **Trusted Computing**: Configura opciones de seguridad, como el TPM.
5. **Secure Boot**: Habilita el arranque seguro para prevenir software malicioso.

#### 5. Guardar y Salir (Save & Exit)
Opciones para guardar o descartar cambios:

![[Save & Exit.jpg]]
*Imagen 5: Guardar y Salir (Save & Exit)*

1. **Save Changes and Reset**: Guarda los cambios y reinicia el sistema.
2. **Discard Changes and Exit**: Descarta los cambios y reinicia sin modificaciones.
3. **Load Optimized Defaults**: Carga la configuración predeterminada recomendada por el fabricante.