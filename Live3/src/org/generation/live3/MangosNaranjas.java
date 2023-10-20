// Hugo Ricardo Hernández Montejano 
// Revisado por los Mictlanes
// Califican: 5 

package org.generation.live3;


public class MangosNaranjas {
    private int mangos;
    private int naranjas;

    public MangosNaranjas(int mangos, int naranjas) {
        this.mangos = mangos;
        this.naranjas = naranjas;
    }

    public void imprimir() {
        int cajas = Math.min(mangos, naranjas); 
        int mangosPorCaja = mangos / cajas;
        int naranjasPorCaja = naranjas / cajas;

        System.out.println("El número de cajas es: " + cajas);
        System.out.println("El número de mangos en una caja es: " + mangosPorCaja);
        System.out.println("El número de naranjas en una caja es: " + naranjasPorCaja);
    }
}








