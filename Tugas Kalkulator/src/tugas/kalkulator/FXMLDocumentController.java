/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.kalkulator;
 
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
 
/**`
*
* @author aryoy
*/
public class FXMLDocumentcontroller implements Initializable {
private double angkakesatu,angkakedua,hasil;
private String operasi,answer;
private int btnTitikClick;
private Label label;
@FXML
private Button nol;
 
@FXML
private Button satu;
 
@FXML
private Button titik;
 
@FXML
private Button tambahkurang;
 
@FXML
private Button tiga;
 
@FXML
private Button dua;
 
@FXML
private Button empat;
 
@FXML
private Button enam;
 
@FXML
private Button lima;
 
@FXML
private Button tujuh;
 
@FXML
private Button sembilan;
 
@FXML
private Button delapan;
 
@FXML
private Button samadengan;
 
@FXML
private Button tambah;
 
@FXML
private Button kurang;
 
@FXML
private Button kali;
 
@FXML
private Button bagi;
 
@FXML
private Button Nyala;
 
@FXML
private Button back;
 
 
@FXML
private Button C;
 
@FXML
private TextField jtxtTampilan;
 
 
 
@Override
public void initialize(URL url, ResourceBundle rb) {
// TODO
}
 
@FXML
private void nol(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ nol.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void satu(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ satu.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void tiga(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ tiga.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void dua(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ dua.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void empat(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ empat.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void enam(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ enam.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void lima(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ lima.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void tujuh(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ tujuh.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void sembilan(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ sembilan.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void delapan(ActionEvent event) {
String MasukanAngka = jtxtTampilan.getText()+ delapan.getText();
jtxtTampilan.setText(MasukanAngka);
}
 
@FXML
private void cleare(ActionEvent event) {
jtxtTampilan.setText("");
btnTitikClick=0;
}
 
@FXML
private void back(ActionEvent event) {
String ops = String.valueOf(jtxtTampilan.getText());
ops = ops.substring(0, ops.length()-1);
jtxtTampilan.setText(ops);
}
 
@FXML
private void clear(ActionEvent event) {
angkakesatu=0.0;
hasil=0.0;
jtxtTampilan.setText("");
btnTitikClick=0;
}
 
@FXML
private void samadengan(ActionEvent event) {
angkakedua =Double.parseDouble(jtxtTampilan.getText());
if (operasi =="+") {
hasil = angkakesatu + angkakedua;
answer = String.format(" %,.2f ", hasil);
jtxtTampilan.setText(answer);
 
}
else if (operasi =="-") {
hasil = angkakesatu - angkakedua;
answer = String.format("%,.2f", hasil);
jtxtTampilan.setText(answer);
}
else if (operasi =="*") {
hasil = angkakesatu * angkakedua;
answer = String.format("%,.2f", hasil);
jtxtTampilan.setText(answer);
}
else if (operasi =="÷") {
hasil = angkakesatu / angkakedua;
answer = String.format("%,.2f", hasil);
jtxtTampilan.setText(answer);
}
else {
 
JOptionPane.showMessageDialog(null," Data yang anda masukan salah. Ulangi lagi!!!");
}
}
 
@FXML
private void tambah(ActionEvent event) {
angkakesatu = Double.parseDouble(jtxtTampilan.getText());
jtxtTampilan.setText("");
operasi="+";
btnTitikClick=0;
}
 
@FXML
private void kurang(ActionEvent event) {
angkakesatu = Double.parseDouble(jtxtTampilan.getText());
jtxtTampilan.setText("");
operasi="-";
btnTitikClick=0;
}
 
@FXML
private void kali(ActionEvent event) {
angkakesatu = Double.parseDouble(jtxtTampilan.getText());
jtxtTampilan.setText("");
operasi="*";
btnTitikClick=0;
}
 
@FXML
private void bagi(ActionEvent event) {
angkakesatu = Double.parseDouble(jtxtTampilan.getText());
jtxtTampilan.setText("");
operasi="÷";
btnTitikClick=0;
}
 
@FXML
private void titik(ActionEvent event) {
if (btnTitikClick==0) {
jtxtTampilan.setText(jtxtTampilan.getText()+ titik.getText());
btnTitikClick=1;
}
}
 
@FXML
private void tambahkurang(ActionEvent event) {
double ops = Double.parseDouble(String.valueOf(jtxtTampilan.getText()));
ops = ops *(-1);
jtxtTampilan.setText(String.valueOf(ops));
btnTitikClick=0;
}
 
}