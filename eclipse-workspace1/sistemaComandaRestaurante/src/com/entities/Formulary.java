package com.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Formulary {
    private Scanner input = new Scanner(System.in);

    public String registroRestaurante() {
        List<CadastroRestaurante> list = new ArrayList<>();
        System.out.println("Insira o nome do restaurante:");
        String name1 = input.nextLine().toUpperCase();
        System.out.println("Nome registrado.");
        CadastroRestaurante restaurante = new CadastroRestaurante(name1);
        list.add(restaurante);
        return name1;
    }

    public List<Products> registroProducts() {
        List<Products> prod = new ArrayList<>();
        System.out.println("Quantos produtos deseja registrar?");
        int n = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < n; i++) {
            System.out.println("____________________");
            System.out.println("Nome do produto:");
            String nameOf1 = input.nextLine().toUpperCase();
            System.out.println("-------------------");
            Products products = new Products(nameOf1);
            prod.add(products);
            System.out.println((i + 1)+" Produto adicionado " );
        }

        return prod; // Retorna a lista de produtos registrados
    }

    public void getCompleto() {
        String registroRestaurante = registroRestaurante();
        List<Products> registroProducts = registroProducts();

        StringBuilder sb = new StringBuilder();
        sb.append("RESTAURANTE E LANCHONETE\n")
          .append("        ").append(registroRestaurante).append("\n")
          .append("----------------------------\n")
          .append("        PRODUTOS      \n\n");
        

        for (Products p : registroProducts) {
            sb.append("[   ] ").append(p.getNameOfProduct()).append("\n");
        }

        System.out.println(sb.toString());
        System.out.println("----------------------------");
        System.out.println("Agradecemos a preferência.");
        System.out.println("      Volte sempre!");
        System.out.println("----------------------------");
        input.close(); // Fecha o Scanner
    }

    	public void getNumberComanda() {
    		Comanda comanda = new Comanda();
    		comanda.getId();
    		System.out.println(comanda);
    		
    	}
}


	

