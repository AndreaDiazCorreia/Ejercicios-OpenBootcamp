public class Bucles {

    public static void bucles(String[] args){

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

        int numeroPositivoNegativo = -5;

        if (numeroPositivoNegativo>0) {
            System.out.println("El número " + numeroPositivoNegativo + " es positivo");
        } else {
            System.out.println("El número " + numeroPositivoNegativo + " es negativo");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //
        //Mostrarlo por pantalla cada vez que se ejecute.

        int numeroMenor = 2;

        while (numeroMenor < 3){
            numeroMenor++;
            System.out.println("La variable es " + numeroMenor);
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.


        do{
            numeroMenor++;
            System.out.println("La variable es " + numeroMenor);

        }while (numeroMenor <3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for (int numeroIgual = 0; numeroIgual  <=3; numeroIgual++){
            System.out.println("la variable es " + numeroIgual);
        }

        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("Estamos en Verano :)");
                break;

            case "invierno":
                System.out.println("Estamos en invierno :(");
                break;

            case "primavera":
                System.out.println("Estamos en primavera :)");
                break;

            case "otoño":
                System.out.println("Estamos en otoño :)");
                break;

            default:
                System.out.println("No es una estacion");
        }

    }


}
