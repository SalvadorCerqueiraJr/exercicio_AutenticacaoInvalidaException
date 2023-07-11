/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
//Salvador Cerqueira Junior

package br.edu.ifba.saj.ads.poo;

public class App {
    
    public static void main(String[] args) {
        BancoDeUsurarios bancoDeUsuarios = new BancoDeUsurarios();

    bancoDeUsuarios.cadastrarUsuario(new Usuario("user123", "123456", "UsuarioTest"));
    bancoDeUsuarios.cadastrarUsuario(new Usuario("user12", "12345", "UsuarioTes"));



    }    
}
