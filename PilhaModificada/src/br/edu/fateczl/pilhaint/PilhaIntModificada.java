package br.edu.fateczl.pilhaint;

public class PilhaIntModificada {

    NoIntModificado topo;

    public PilhaIntModificada(){
        topo = null;
    }

    public boolean isEmpty(){
        return topo == null;
    }

    public void push(int e){
        NoIntModificado elemento = new NoIntModificado();
        elemento.dado = e;

        if (isEmpty()){
            topo = elemento;
        } else {
            elemento.proximo = topo;
            topo = elemento;
        }
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Não há elementos para desempilhar");
        }

        int valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public int top() throws Exception{
        if (isEmpty()){
            throw new Exception("Não há elementos na pilha");
        }

        return topo.dado;
    }

    public int size(){
        int cont = 0;
        NoIntModificado auxiliar = topo;

        while (auxiliar != null){
            cont++;
            auxiliar = auxiliar.proximo;
        }

        return cont;
    }

    public int max() throws Exception {

        if (isEmpty()){
            throw new Exception("Pilha vazia");
        }

        PilhaIntModificada auxiliar = new PilhaIntModificada();

        int maior = Integer.MIN_VALUE;

        // Percorre a pilha original
        while (!isEmpty()){
            int valor = pop();

            if (valor > maior){
                maior = valor;
            }

            auxiliar.push(valor);
        }

        // Restaura a pilha original
        while (!auxiliar.isEmpty()){
            push(auxiliar.pop());
        }

        return maior;
    }
}