package br.com.hellobank.api.service;

import java.util.ArrayList;

import br.com.hellobank.api.model.Conta;

public interface IContaService {
    
    //GET
    public ArrayList<Conta> listarContas();
    public Conta listarContaPeloId(Integer id);
    
    //POST
    public Conta cadastrarConta(Conta cadastrar);

    //PUT
    public Conta atualizarConta(Conta atualizar);

    //DELETE
    public void deletarConta(Integer id);

}
