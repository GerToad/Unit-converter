import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;

public class Convertidor extends JFrame implements ActionListener{
   private Label lblTitle, lblConvert, lblDe, lblA, lblRslt;    // Declare a Label component
   private TextField tfCount, tfRslt; // Declare a TextField component
   private Button btnCount, btnClose;   // Declare a Button component
   private JComboBox combox, cbDe, cbA;
   private String[] medidas = {"Longitud", "Moneda"},
           lon = {"Kilometros", "Millas", "Yardas"},
           money = {"Dolares", "Pesos", "Euros"};
   private int count = 0;     // Counter's value

   public Convertidor(){
      //setLayout(new FlowLayout());
      setLayout(null);

      lblTitle = new Label("Convertidor");
      lblTitle.setBounds(240,10,110,30);
      lblTitle.setFont(new Font("Andale Mono", 1, 18));
      add(lblTitle);

      combox = new JComboBox(medidas);
      combox.setBounds(200, 50, 200, 30);
      add(combox);
      //combox.addItemListener(this);
      combox.addActionListener(this);

      // Gap 1
      lblConvert= new Label("Convertir");
      lblConvert.setBounds(25,100,75,30);
      lblConvert.setFont(new Font("Andale Mono", 1, 13));
      add(lblConvert);

      tfCount = new TextField(10);
      tfCount.setBounds(10,135,100,30);
      add(tfCount);

      // Gap 2
      lblDe = new Label("De:");
      lblDe.setBounds(175,100,75,30);
      lblDe.setFont(new Font("Andale Mono", 1, 13));
      add(lblDe);

      cbDe = new JComboBox(lon);
      cbDe.setBounds(150,135,100,30);
      add(cbDe);

      // Gap 3
      lblA = new Label("A:");
      lblA.setBounds(325,100,75,30);
      lblA.setFont(new Font("Andale Mono", 1, 13));
      add(lblA);

      cbA = new JComboBox(lon);
      cbA.setBounds(290,135,100,30);
      add(cbA);

      // Gap 4
      lblRslt = new Label("Resultado");
      lblRslt.setBounds(440,100,75,30);
      lblRslt.setFont(new Font("Andale Mono", 1, 13));
      add(lblRslt);

      tfRslt = new TextField();
      tfRslt.setBounds(430,135,100,30);
      add(tfRslt);

      // Buttons
      btnCount = new Button("Convierte");
      btnCount.setBounds(100,210,100,30);
      add(btnCount);
      btnCount.addActionListener(this);

      btnClose = new Button("Terminar");
      btnClose.setBounds(350,210,100,30);
      add(btnClose);

      setTitle("Covertidor");

      setSize(600, 300);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == btnCount){
         String cad1 = tfCount.getText();
         int unit = Integer.parseInt(cad1);
         double rslt = 0;

         if(cbDe.getSelectedItem() == "Millas" && cbA.getSelectedItem() == "Kilometros"){
            rslt = unit * 1.60930;
         }
         if(cbDe.getSelectedItem() == "Millas" && cbA.getSelectedItem() == "Yardas"){
            rslt = unit * 170;
         }
         if(cbDe.getSelectedItem() == "Kilometros" && cbA.getSelectedItem() == "Millas"){
            rslt = unit * 0.621371;
         }
         if(cbDe.getSelectedItem() == "Kilometros" && cbA.getSelectedItem() == "Yardas"){
            rslt = unit * 1093.61;
         }
         if(cbDe.getSelectedItem() == "Yardas" && cbA.getSelectedItem() == "Millas"){
            rslt = unit * 0.000568182;
         }
         if(cbDe.getSelectedItem() == "Yardas" && cbA.getSelectedItem() == "Kilometros"){
            rslt = unit * 0.0009144;
         }

         // Money
         if(cbDe.getSelectedItem() == "Dolares" && cbA.getSelectedItem() == "Pesos"){
            rslt = unit * 20.28;
         }
         if(cbDe.getSelectedItem() == "Dolares" && cbA.getSelectedItem() == "Euros"){
            rslt = unit * 0.88;
         }
         if(cbDe.getSelectedItem() == "Pesos" && cbA.getSelectedItem() == "Dolares"){
            rslt = unit * 0.049;
         }
         if(cbDe.getSelectedItem() == "Pesos" && cbA.getSelectedItem() == "Euros"){
            rslt = unit * 0.043;
         }
         if(cbDe.getSelectedItem() == "Euros" && cbA.getSelectedItem() == "Dolares"){
            rslt = unit * 1.14;
         }
         if(cbDe.getSelectedItem() == "Euros" && cbA.getSelectedItem() == "Pesos"){
            rslt = unit * 23.04;
         }


         tfRslt.setText(Double.toString(rslt));
      }

      if(e.getSource() == combox){
         if(combox.getSelectedItem() == "Longitud"){
            tfRslt.setText("Hallo");
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : lon){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }else{
            tfRslt.setText("Welt");
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : money){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }
      }
   }

   public static void main(String[] args) {
      Convertidor app = new Convertidor();
      app.setVisible(true);
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.setResizable(false);
      app.setLocationRelativeTo(null);
   }

}

