/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufam.algo;

/**
 *
 * @author Eduarda Ambrósio
 */
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<String> fila = new LinkedList<String>();
    public void enfileirar (String nome) {
        this.fila.add(nome);
    }
		
    public void filaVazia() {
        System.out.println("\nFila está vazia? " + fila.isEmpty());
    }
   
    public void mostraFila(){
    	System.out.println("\nNa fila:");
    	System.out.println(fila);
    }
    public void removeFila(){
	  this.fila.poll();  	
    }
		
}