/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufam.algo;

/**
 *
 * @author Eduarda Ambrósio
 */
import java.util.ArrayList;
import java.util.Collection;

public class Lista {
    private final Collection<String> lista = new ArrayList<>();
		
    public void insereLista (String valor) {
	this.lista.add(valor);
		
    }
    public void mostraLista(){
        System.out.println("\n na Lista");
	System.out.println(lista);
    }
		
    public void removeLista (String valor) {
	if (this.lista.contains(valor)) {
	    this.lista.remove(valor);
            System.out.println("Elemento Removido");
	}else {
	    System.out.println("Erro ao Remover");
	}
    }
    public void lista_Vazia (){
	System.out.println("\nFila está vazia? " + lista.isEmpty());
    }
    
}
