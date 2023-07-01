package View;

import Model.Conversor;

import javax.swing.*;
import java.text.DecimalFormat;

public class Windows {

    Conversor conversor = new Conversor();
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    DecimalFormat longDecimalFormat = new DecimalFormat("#.000000");
    private final static String[] option = {"Conversion de monedas", "Opción 2"};
    private final static String[] currencyOption = {
            "Convertir dolar a yuang",
            "Convertir dolar a euro",
            "Convertir dolar a libra",
            "Convertir dolar a yen",
            "Convertir dolar a won",
            "Convertir yuang a dolar",
            "Convertir euro a dolar",
            "Convertir libra a dolar",
            "Convertir yen a dolar",
            "Convertir won a dolar"
    };

    static JComboBox<String> comboBox = new JComboBox<>(option);
    static JComboBox<String> secondComboBox = new JComboBox<>(currencyOption);
    int selection;
    int secondSelection;
    boolean isContinue = true;
    private double quantity = 0.0;
    public   boolean isValid = true;

    //windows
  public   void showWindowFirst() {
        JOptionPane.showOptionDialog(null, comboBox, "Selecione una opcion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, -1);
        this.selection = comboBox.getSelectedIndex();

    }

    public  void showSecondWindow() {
        JOptionPane.showOptionDialog(null, secondComboBox, "Selecione una conversion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, -1);
        this.secondSelection = secondComboBox.getSelectedIndex();
    }

    public   void isContinue() {
        int option = JOptionPane.showConfirmDialog(null, "Desea continuar?");

        if (option == JOptionPane.YES_OPTION) {
            this.isContinue = false;
        } else if (option == JOptionPane.NO_OPTION) {
            this.isContinue = true;
        }
    }


    //principals functions
    public   void usdToYuang() {
        double answer = conversor.principalToYuang(this.quantity);
        JOptionPane.showMessageDialog(null, "La conversion a yuang es " + decimalFormat.format(answer));
        isContinue();
    }

    public  void usdToEuro() {
        double answer = conversor.principalToEuro(this.quantity);
        JOptionPane.showMessageDialog(null, "La conversion a euro es " + decimalFormat.format(answer));
        isContinue();
    }

    public  void usdToLibra() {
        double answer = conversor.principalToLibra(this.quantity);
        JOptionPane.showMessageDialog(null, "La conversion a libra es " + decimalFormat.format(answer));
        isContinue();
    }

    public  void usdToYen() {
        double answer = conversor.principalToYen(this.quantity);
        JOptionPane.showMessageDialog(null, "La conversion a yen es " + decimalFormat.format(answer));
        isContinue();
    }

    public  void usdToWon() {
        double answer = conversor.principalToWon(this.quantity);
        JOptionPane.showMessageDialog(null, "La conversion a wong es " + decimalFormat.format(answer));
        isContinue();
    }

    public void anyToUsd() {
        double a = conversor.anyToUSD(this.secondSelection, this.quantity);
        JOptionPane.showMessageDialog(null, "La conversion a dolar es " + longDecimalFormat.format(a));
        isContinue();

    }



    //setterts and getters
    public int getSecondSelection() {
        return secondSelection;
    }

    public void setQuantity() {
        try {
            this.quantity = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
            if (this.quantity < 0) {
                JOptionPane.showMessageDialog(null, "El valor no puede ser letras", "Error", JOptionPane.ERROR_MESSAGE);

                this.isValid = false;
            } else {
                this.isValid = true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor no puede ser letras", "Error", JOptionPane.ERROR_MESSAGE);

            this.isValid = false;
        }
    }


    public int getSelection() {
        return selection;
    }

    public boolean getIsContinue() {
        return this.isContinue;
    }

    public double getQuantity() {
        return quantity;
    }
}
