/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.util;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

/**
 *
 * @author Pichau
 */
public class ConfiguraComponentes {
    public void configCampoTexto(javax.swing.JTextField componente, String texto){
        
        componente.setText(texto);
        componente.setForeground(Color.GRAY);
        
        
        componente.addFocusListener( new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (componente.getText().equals(texto)){
                    componente.setText("");
                    componente.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(componente.getText().equals("")){
                    componente.setText(texto);
                    componente.setForeground(Color.GRAY);
                }
            }
          
        });
    
    }
    
    public void configCampoTextoArea(javax.swing.JTextArea componente, String texto) {
        componente.setText(texto);
        componente.setForeground(Color.GRAY);

        componente.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (componente.getText().equals(texto)) {
                    componente.setText("");
                    componente.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (componente.getText().equals("")) {
                    componente.setText(texto);
                    componente.setForeground(Color.GRAY);
                }
            }
        });
    }
   
    public void configCampoSenha(JPasswordField componente, String texto){
        
        componente.setText(texto);
        componente.setForeground(Color.GRAY);
        componente.setEchoChar((char) 0);
        
        componente.addFocusListener( new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {              
                if (String.valueOf(componente.getPassword()).equals(texto)){
                    componente.setText("");
                    componente.setForeground(Color.BLACK);
                    componente.setEchoChar('*');
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(String.valueOf(componente.getPassword()).equals("")){
                    componente.setText(texto);
                    componente.setForeground(Color.GRAY);
                    componente.setEchoChar((char) 0);
                }
            }
          
        }); 
    } 
    
    public void configCheckBox(JCheckBox componente, JPasswordField campoSenha, String texto, String senha){
        if(componente.isSelected() || senha.equals(texto)){
            campoSenha.setEchoChar((char) 0); 
        }else{
            campoSenha.setEchoChar('•');
        }
     }
}
