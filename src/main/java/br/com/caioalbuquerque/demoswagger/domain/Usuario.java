package br.com.caioalbuquerque.demoswagger.domain;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class Usuario {
    @ApiModelProperty(notes = "Nome do usuário")
    private String nome;

    @ApiModelProperty(notes = "Salário do usuário")
    private Long salario;

    public Usuario(String nome, Long salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(salario, usuario.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, salario);
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "nome='" + nome + '\'' + ", "
                + "salario=" + salario + '}';
    }
}