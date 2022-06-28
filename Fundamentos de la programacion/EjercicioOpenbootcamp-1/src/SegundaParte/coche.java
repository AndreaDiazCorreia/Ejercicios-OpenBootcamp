package SegundaParte;

public class coche {
    int numeroPuertas;


    public coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas + 1;
    }

    public int getNumeroPuertas(){
        return numeroPuertas;
    }

    @Override
    public String toString(){
        return ("Tengo " + numeroPuertas + " puertas");
    }



}
