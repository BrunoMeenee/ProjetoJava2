package com.unialfa.Introducao;

import com.unialfa.introducaogui.Calculadora;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var calculadora = new Calculadora();
            calculadora.setVisible(true);
        });
    }
}
