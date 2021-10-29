/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufam.app;

/**
 *
 * @author Eduarda Ambrósio
 */
import br.edu.ufam.algo.Fila;
import br.edu.ufam.algo.Lista;
import br.edu.ufam.algo.Pilha;

public class Main {

    public static void main(String[] args){
        Pilha ph = new Pilha();
	Fila fl = new Fila();
	Lista lt = new Lista();
        
        System.out.println("\n---------Pilha---------");
        ph.pilha_Vazia();
	ph.inserePilha("Dolores");
	ph.inserePilha("Fabio");
        ph.inserePilha("Pedro");
	ph.inserePilha("Nicolas");
        ph.mostraPilha();
        
        ph.pilha_Vazia();
	ph.mostraPilha();
	ph.removePilha();
        
        ph.inserePilha("Cain");
	ph.mostraPilha();
        ph.removePilha();
	ph.mostraPilha();

        System.out.println("\n---------------------\n");
	System.out.println("\n--------Fila------");
	fl.filaVazia();
	fl.enfileirar("Caio");
	fl.enfileirar("Felipe");
	fl.enfileirar("Maria");
        fl.enfileirar("Thiago");
        fl.mostraFila();
        
	fl.filaVazia();
        fl.removeFila();
	fl.mostraFila();
        
        fl.enfileirar("Dolores");
	fl.mostraFila();
	fl.removeFila();
	fl.mostraFila();
	
        System.out.println("\n---------------------\n");
	System.out.println("\n---------Lista--------");
        lt.lista_Vazia();
	lt.insereLista("Liz");
	lt.insereLista("Let");
	lt.insereLista("Henry");
        lt.insereLista("Gabriel");
        lt.mostraLista();
        
        lt.lista_Vazia();
        lt.removeLista("Let");
	lt.mostraLista();
	
        lt.insereLista("Junior");
	lt.mostraLista();
        lt.removeLista("Gabriel");
	lt.mostraLista();
        
	
}

}