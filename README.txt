Especificaciones sobre la práctica.

Se ha creado junto a la clase Methods.java un Main.java que muestra por pantalla el user.home. La idea es ejecutarlo para que te diga cuál es tu user.home que normalmente debería ser C://Users/'nombreUsuario'.
Este será el directorio sobre el que trabajaremos, el que salga del user.home.
Una vez dicho esto, la primera vez que se ejecute la práctica es importante pulsar la opción 1 de el código porque dicha opción al ejecutarse creará una carpeta llamada Recursos en el user.home. En esta carpeta es donde se van a guardar todas las exportaciones y donde se va a guardar el archivo xml que nos servirá como base de datos.
Una vez pulsada dicha opción la carpeta será creada y no será necesario crearla manualmente y ya se podrá utilizar la aplicación entera tranquilamente.

La segunda especificación es que si se intenta hacer un maven build para que se genere el código del servidor en el cliente es necesario sustituir las clases Recetario.java, Receta.java e Ingrediente.java por el código que va incluido en los words adjuntos en la carpeta Clases porque la generación del código en el cliente no es totalmente correcta.