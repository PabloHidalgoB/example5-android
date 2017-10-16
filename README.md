# Aplicacion de ejemplo 5 - Android

Esta aplicacion es en cierta forma mas sencilla que las otras en el sentido que no posee activities complicados, o fragments y list views,
la particularidad de este proyecto, recae en el hecho de que realiza una creacion de un archivo local con datos incluidos 
en formato JSON que son utilizados por un activity secundario dentro de la misma aplicacion.

<img src="https://github.com/PabloHidalgoB/example5-android/blob/master/app/src/main/res/screenshots/main.png" data-canonical-src="https://github.com/PabloHidalgoB/example5-android/blob/master/app/src/main/res/screenshots/main.png" width="200" height="auto" />

Como podra apreciar, en este MainActivity solo se creo una interfaz lo suficientemente simple como para realizar un unico proposito
el cual es escribir un dato de tipo String que sera rescatado por el boton, convertido a un objeto JSON y guardado de forma local

<img src="https://github.com/PabloHidalgoB/example5-android/blob/master/app/src/main/res/screenshots/edit.png" data-canonical-src="https://github.com/PabloHidalgoB/example5-android/blob/master/app/src/main/res/screenshots/edit.png" width="200" height="auto" />

Una vez rescatado este "hola mundo" el string es convertido a un objeto de tipo JSON y guardado en un archivo local por medio de la 
libreria SharedPreferences, el cual se encarga de guardar el contenido del JSON dentro del archivo local y, al mismo tiempo, rescatar 
dicho archivo desde el segundo activity y poder ser desplegado en pantalla.

<img src="https://github.com/PabloHidalgoB/example5-android/blob/master/app/src/main/res/screenshots/second.png" data-canonical-src="https://github.com/PabloHidalgoB/example5-android/blob/master/app/src/main/res/screenshots/second.png" width="200" height="auto" />
