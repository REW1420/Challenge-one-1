import View.Windows;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Windows windows = new Windows();

        do {
            windows.showWindowFirst();


            if (windows.getSelection() > -1) {
                switch (windows.getSelection()) {
                    case 0 -> {
                        do {
                            windows.setQuantity();
                        }while (!windows.isValid);




                        windows.showSecondWindow();
                        if (windows.getSecondSelection() > -1) {
                            switch (windows.getSecondSelection()) {
                                case 0 -> windows.usdToYuang();
                                case 1 -> windows.usdToEuro();
                                case 2 -> windows.usdToLibra();
                                case 3 -> windows.usdToYen();
                                case 4 -> windows.usdToWon();
                                case 5, 7, 8, 9 -> windows.anyToUsd();

                            }
                        }
                    }
                    case 1 -> JOptionPane.showMessageDialog(null, "Has seleccionado la Opción 2");
                    default -> JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            }
        } while (!windows.getIsContinue());
    }


}
