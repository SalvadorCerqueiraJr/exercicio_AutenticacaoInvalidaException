package br.edu.ifba.saj.ads.poo;

import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;

public class BancoDeUsurarios {
    
    ArrayList<Usuario> BancoDeDados = new ArrayList<>();
    
    public void cadastrarUsuario(Usuario usuario){
      BancoDeDados.add(usuario);
    }

    public boolean autenticar(Usuario usuario){
        boolean Status= false;
        for(int i = 0; i <= BancoDeDados.size(), i++){
            if(BancoDeDados.get(i).equals(usuario)){
                Status = true;
                break;
            }
        }
        return Status;
    }


}
