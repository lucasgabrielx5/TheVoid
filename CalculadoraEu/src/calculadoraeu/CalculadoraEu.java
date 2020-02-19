package calculadoraeu;

import javax.swing.JOptionPane;

public class CalculadoraEu {

    public static void main(String[] args) {
        
        String firstNumber = JOptionPane.showInputDialog("Digite o 1º número: ");
        String secondNumber = JOptionPane.showInputDialog("Digite o 2º número: ");
        
        double number1 = Double.parseDouble(firstNumber);
        double number2 = Double.parseDouble(secondNumber);

        String operationChoose = JOptionPane.showInputDialog("Digite a operação desejada: (+, -, *, /)");
        
        if ((operationChoose).equals("+")){
            double calculo = number1+number2;
            JOptionPane.showMessageDialog( null,"O resultado da conta é: "+calculo,
                    "Calculating", JOptionPane.PLAIN_MESSAGE);
        }else{            
        if ((operationChoose).equals("-")){
            double calculo = number1-number2;
            JOptionPane.showMessageDialog( null,"O resultado da conta é: "+calculo,
                    "Calculating", JOptionPane.PLAIN_MESSAGE);
        }else{           
        if ((operationChoose).equals("*")){
            double calculo = number1*number2;
            JOptionPane.showMessageDialog( null,"O resultado da conta é: "+calculo,
                    "Calculating", JOptionPane.PLAIN_MESSAGE);
        }else{            
        if ((operationChoose).equals("/")){
            double calculo = number1/number2;
            JOptionPane.showMessageDialog( null,"O resultado da conta é: "+calculo,
                    "Calculating", JOptionPane.PLAIN_MESSAGE);
        }else{                       
            double calculo = 404;
            JOptionPane.showMessageDialog( null,"Error"+calculo,
                    "Calculating", JOptionPane.PLAIN_MESSAGE);
        }
        }
        }
        }
       
    }
    
}
