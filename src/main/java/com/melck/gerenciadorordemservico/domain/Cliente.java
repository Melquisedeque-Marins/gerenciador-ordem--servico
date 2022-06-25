package com.melck.gerenciadorordemservico.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Pessoa {

    @OneToMany(mappedBy = "cliente")
    private List<OS> os = new ArrayList<>(); 

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpf, String telefone) {
        super(id, nome, cpf, telefone);
    }

    public List<OS> getOs() {
        return os;
    }

    public void setOs(List<OS> os) {
        this.os = os;
    }
      
}
