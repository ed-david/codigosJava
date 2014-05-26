package operaciones;

import javax.swing.JOptionPane;

public class Operaciones {

    public static void main(String[] args) {
    
      int r=Integer.parseInt(JOptionPane.showInputDialog(null,".................BIENVENIDO.................\n....................CALCULE....................\n\n 1. Raiz Cuadrada\n 2. Potencia\n 3. Potencia Base 10\n 4. Logaritmo Natural\n 5. Exponencial\n 6. Redondeo al Entero\n\n Ingrese que desea hacer"));
  while (r<=0||r>6){
      JOptionPane.showMessageDialog(null,"ERROR valor invalido\nIngrese de nuevo el valor","Error",JOptionPane.WARNING_MESSAGE);
      r=Integer.parseInt(JOptionPane.showInputDialog(null,".................BIENVENIDO.................\n....................CALCULE....................\n\n 1. Raiz Cuadrada\n 2. Potencia\n 3. Potencia Base 10\n 4. Logaritmo Natural\n 5. Exponencial\n 6. Redondeo al Entero\n\n Ingrese que desea hacer"));
  }
  switch(r){
      case 1:
          double x=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero a sacar raiz cuadrada","Raiz Cuandrada",JOptionPane.QUESTION_MESSAGE));
          double res=Math.sqrt(x);
          String resultado=String.format("El resultado de su operacion es de %.2f",res);
          JOptionPane.showMessageDialog(null,resultado);
          break;
      case 2:
           x=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base","Potencia",JOptionPane.QUESTION_MESSAGE));
           double y=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el exponente","Potencia",JOptionPane.QUESTION_MESSAGE));
           res=Math.pow(x, y);
          resultado=String.format("El resultado de su operacion es de %.2f",res);
          JOptionPane.showMessageDialog(null,resultado);
           break;
      case 3:
           x=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero a sacar logatirmo de base 10","Logaritmo Base 10",JOptionPane.QUESTION_MESSAGE));
           res=Math.log10(x);
           resultado=String.format("El resultado de su operacion es de %.2f",res);
          JOptionPane.showMessageDialog(null,resultado);
           break;
      case 4:
           x=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero a sacar logaritmo natural","Logaritmo Natural",JOptionPane.QUESTION_MESSAGE));
           res=Math.log(x);
           resultado=String.format("El resultado de su operacion es de %.2f",res);
          JOptionPane.showMessageDialog(null,resultado);
           break;
      case 5:
           x=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero a sacar el exponencial","Logaritmo Exponencial",JOptionPane.QUESTION_MESSAGE));
          res=Math.exp(x);
          resultado=String.format("El resultado de su operacion es de %.2f",res);
          JOptionPane.showMessageDialog(null,resultado);
           break;
      case 6:
           x=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero a redondear a entero","Redondeo de Entero",JOptionPane.QUESTION_MESSAGE));
          res=Math.round(x);
          resultado=String.format("El resultado de su operacion es de %.2f",res);
          JOptionPane.showMessageDialog(null,resultado);
           break;
      default:
          JOptionPane.showMessageDialog(null,"ERROR");
          break;
  }
  
      System.exit(0);
    }
    
}
