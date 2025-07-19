/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.controller;

import com.mycompany.todolist.model.Tarefa;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControllerTarefa {
    
    private ArrayList<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();

    public ControllerTarefa() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void addTarefa(Tarefa tarefa) {
        if (tarefa != null) {
            listaDeTarefas.add(tarefa);
            System.out.println("Tarefa adicionada com sucesso.");
        } else {
            System.out.println("Tarefa inválida.");
        }
    }

    public void editarTarefa(int index, Tarefa novaTarefa) {
        if (index >= 0 && index < listaDeTarefas.size()) {
            listaDeTarefas.set(index, novaTarefa);
            System.out.println("Tarefa editada com sucesso.");
        } else {
            System.out.println("Índice inválido. Não foi possível editar.");
        }
    }

    public Tarefa getTarefa(int index) {
        if (index >= 0 && index < listaDeTarefas.size()) {
            return listaDeTarefas.get(index);
        }
        System.out.println("Tarefa não encontrada.");
        return null;
    }

    public void excluirTarefa(int index) {
        if (index >= 0 && index < listaDeTarefas.size()) {
            listaDeTarefas.remove(index);
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Índice inválido. Não foi possível remover.");
        }
    }

    public ArrayList<Tarefa> getListaDeTarefas() {
        return listaDeTarefas;
    }

    public void atualizarTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0); // limpa a tabela

        for (Tarefa t : listaDeTarefas) {
            modelo.addRow(new Object[]{t.getTitulo(), t.getDescricao(), t.getData(), t.getStatus()});
        }
    }

    
    public void limparCamposTarefa(JTextField txtTitulo, JTextField txtDescricao, JTextField txtData) {
        txtTitulo.setText("");
        txtDescricao.setText("");
        txtData.setText("");
    }
}
