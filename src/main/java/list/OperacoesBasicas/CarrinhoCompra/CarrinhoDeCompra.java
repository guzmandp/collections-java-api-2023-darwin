package main.java.list.OperacoesBasicas.CarrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    //atributo

    private List<Carrinho> carrinho;

    public CarrinhoDeCompra() { this.carrinho = new ArrayList<>(); }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Carrinho(nome, preco, quantidade ));
    }

    public void removerItem(String nome){
        List<Carrinho> carrinhoParaRemover = new ArrayList<>();
        for (Carrinho c : carrinho) {
            if(c.getNome().equalsIgnoreCase(nome)){
                carrinhoParaRemover.add(c);
            }
        }
        carrinho.removeAll(carrinhoParaRemover);
    }

    public int exibirItens() {
        return carrinho.size();
    }

    /* public int calcularValorTotal(){
        double total =  preco * quantidade;
        return (int) total;
    } */

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        System.out.println("O número total de items na lista do carrinho é: " + carrinhoDeCompra.exibirItens());

        carrinhoDeCompra.adicionarItem("Smartphone", 5000, 2);
        carrinhoDeCompra.adicionarItem("notebook", 15000, 1);
        carrinhoDeCompra.adicionarItem("monitor", 1000, 1);
        System.out.println("O número total de items na lista do carrinho é: " + carrinhoDeCompra.exibirItens());

        carrinhoDeCompra.removerItem("notebook");
        System.out.println("O número total de items na lista do carrinho é: " + carrinhoDeCompra.exibirItens());

        carrinhoDeCompra.calcularValorTotal();
        System.out.println("O número total de items na lista do carrinho é: " + carrinhoDeCompra.calcularValorTotal());


    }
}

