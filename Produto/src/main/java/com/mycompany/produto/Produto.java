package com.mycompany.produto;

import javax.swing.JOptionPane;
public class Produto {

    // Atributos
    String nome;
    double preco;
    
    // Método para calcular o desconto
    public void calcularDesconto() {
        double desconto = preco * 0.15;
        double precofinal = preco - desconto;
        
        String mensagem = "Produto: " + nome + "\n" +
                         "Preço original: R$ " + String.format("%.2f", preco) + "\n" +
                         "Desconto (15%): R$ " + String.format("%.2f", desconto) + "\n" +
                         "Preço final: R$ " + String.format("%.2f", precofinal);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    // Método main
    public static void main(String[] args) {
        Produto produto = new Produto();
        
        // receber os valores
        produto.nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        
        String inputPreco = JOptionPane.showInputDialog("Digite o preço do produto:");
        produto.preco = Double.parseDouble(inputPreco);
        
        // mostrar o resultado
        produto.calcularDesconto();
    }
}