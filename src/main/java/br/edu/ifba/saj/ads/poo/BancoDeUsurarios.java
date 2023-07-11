package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsurarios {
    
    ArrayList<Usuario> BancoDeDados = new ArrayList<>();
    
    public void cadastrarUsuario(Usuario usuario){
      BancoDeDados.add(usuario);
    }


}
