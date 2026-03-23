package br.edu.fateczl.pilhaint;

public class Main {

    public static void main(String[] args) {

        try {

            PilhaIntModificada p = new PilhaIntModificada();

            // Inserindo valores na pilha
            p.push(10);
            p.push(50);
            p.push(30);
            p.push(70);
            p.push(20);

            // Teste do metodo max
            int maior = p.max();
            System.out.println("Maior valor da pilha: " + maior);

            System.out.println("\nElementos da pilha (topo → base):");

            while (!p.isEmpty()){
                System.out.println(p.pop());
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}