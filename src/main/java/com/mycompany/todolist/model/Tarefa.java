/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.model;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private String status;
    private LocalDate data;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, String status, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String concluida) {
        this.status = concluida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "titulo=" + titulo + ", descricao=" + descricao + ", status=" + status + ", data=" + data + '}';
    }
    
    
}
