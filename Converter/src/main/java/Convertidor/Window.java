package Convertidor;

/**
 *
 * @author toad
 */
import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;

public class Window extends JFrame implements ActionListener{
   private Label lblTitle, lblConvert, lblDe, lblA, lblRslt;    // Declare a Label component
   private TextField tfCount, tfRslt; // Declare a TextField component
   private Button btnCount, btnClose;   // Declare a Button component
   private JComboBox combox, cbDe, cbA;
   private String[] medidas = {"Longitud", "Superficie", "Volumen", "Peso", "Velocidad", "Temperatura"},
           lon = {"Kilometros", "Millas", "Yardas", "Centimetros", "Milimetros", "Pies", "Pulgadas"},
           superficie = {"K. cuadrados", "M. cuadradas", "Hectareas", "Acres", "Mtr. cuadrados", "Pies cuadrados"},
           volumen = {"Metro cubico", "Barril", "Litro", "Galon", "C. cubico", "Pinta", "Mililitro", "Onza liquida"},
           peso = {"Tonelada", "T. corta", "Kilogramo", "Libra", "Gramo", "Onza"},
           velocidad = {"Km/s", "Milla/s", "m/s", "Milla/hr", "Km/hr", "Pie/s"},
           temperatura = {"Celsius", "Fahrenheit", "Kelvin"};

   public Window(){
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
      btnClose.addActionListener(this);

      setTitle("Covertidor");

      setSize(600, 300);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == btnCount){
         String cad1 = tfCount.getText();
         int unit = Integer.parseInt(cad1);
         double rslt = 0;
	 Unit unitL = new Unit();
	 
	      for (String a : lon) {
		      if (cbDe.getSelectedItem() == "Kilometros" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitL.getKilo(a);
		      }
		      if (cbDe.getSelectedItem() == "Millas" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitL.getMile(a);
		      }
		      if (cbDe.getSelectedItem() == "Yardas" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitL.getYard(a);
		      }
		      if (cbDe.getSelectedItem() == "Centimetros" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitL.getCent(a);
		      }
		      if (cbDe.getSelectedItem() == "Milimetros" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitL.getMili(a);
		      }
		      if (cbDe.getSelectedItem() == "Pies" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitL.getFeet(a);
		      }
		      if (cbDe.getSelectedItem() == "Pulgadas" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitL.getInch(a);
		      }
	      }

         tfRslt.setText(Double.toString(rslt));
      }

      if(e.getSource() == combox){
         if(combox.getSelectedItem() == "Longitud"){
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : lon){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }if(combox.getSelectedItem() == "Superficie"){
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : superficie){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }
         if(combox.getSelectedItem() == "Volumen"){
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : volumen){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }
         if(combox.getSelectedItem() == "Peso"){
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : peso){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }
         if(combox.getSelectedItem() == "Velocidad"){
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : velocidad){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }
         if(combox.getSelectedItem() == "Temperatura"){
            cbDe.removeAllItems();
            cbA.removeAllItems();
            for(String item : temperatura){
               cbDe.addItem(item);
               cbA.addItem(item);
            }
         }
      }
      
      if(e.getSource() == btnClose){
          //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  System.exit(0);
      }
   }
}