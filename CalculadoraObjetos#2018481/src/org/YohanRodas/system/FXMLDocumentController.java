package org.YohanRodas.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    double dato1, dato2, datoI, result=0;
    int op;
    
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnCero;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    @FXML private Button btnUnoX;
    @FXML private Button btnCuadrado;
    @FXML private Button btnRaiz;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private TextField txtPantalla;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource() == btnDos)
                txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource() == btnTres)
                txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource() == btnCuatro)
                txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource() == btnCinco)
                txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource() == btnSeis)
                txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource() == btnSiete)
                txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource() == btnOcho)
                txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource() == btnNueve)
                txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource() == btnCero)
                txtPantalla.setText(txtPantalla.getText()+"0");
        else if (event.getSource() == btnSuma){
            dato1 = Double.parseDouble(txtPantalla.getText());
            if(datoI==1)
                result=dato1+result;
            else if(datoI==0)
                result=result+dato1;
            txtPantalla.clear();
            op = 1;
            btnPunto.setDisable(false);
            datoI=0;
        }else if (event.getSource() == btnResta){
            dato1 = Double.parseDouble(txtPantalla.getText());
            if(datoI==1)
                result=dato1-result;
            else if(datoI==0)
                result=result+dato1;
            txtPantalla.clear();
            op = 2;
            btnPunto.setDisable(false);
            datoI=0;
        }else if (event.getSource() == btnMulti){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnDivi){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
            btnPunto.setDisable(false);
        }else if(event.getSource() == btnPorcentaje){
            double valPorcent=0, valPantalla=0;
            valPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            valPorcent = dato1 * valPantalla/100;
            txtPantalla.setText(String.valueOf(valPorcent));
            btnPunto.setDisable(false);
        }
        
        else if(event.getSource() == btnMasMenos){
            double tmpDato = (txtPantalla.getText() != null && !txtPantalla.getText().trim().equals("")) ? Double.parseDouble(txtPantalla.getText()) : 0d;  
            dato2 = tmpDato * (-1);
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(dato2));
        }
        
        else if(event.getSource() == btnCuadrado){
            double valCuad=0, valPantalla=0;
            valPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            valCuad = Math.pow(valPantalla, 2);
            txtPantalla.setText(String.valueOf(valCuad));
            btnPunto.setDisable(false);
        }else if(event.getSource() == btnRaiz){
            double valRaiz=0, valPantalla=0;
            valPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            valRaiz = Math.sqrt(valPantalla);
            txtPantalla.setText(String.valueOf(valRaiz));
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnPunto){
            String res = txtPantalla.getText();
            if (txtPantalla.getText().length() == 0){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
            }
            else{
                txtPantalla.setText(txtPantalla.getText()+ ".");
                btnPunto.setDisable(true);
            }  
        }else if (event.getSource() == btnCE){
            txtPantalla.clear();
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnC){
            dato1 =0;
            dato2 =0;
            result =0;
            txtPantalla.clear();
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnUnoX){
            dato1 =Double.parseDouble(txtPantalla.getText());
            result = 1/dato1;
            txtPantalla.setText(String.valueOf(result));
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnIgual){
            dato2  = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            btnPunto.setDisable(false);
            switch (op){
                case 1:
                    result = result + dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 2:
                    result = result - dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 3:
                    result = dato1 * dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 4:
                    result = dato1 / dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                    
            }
        } 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
