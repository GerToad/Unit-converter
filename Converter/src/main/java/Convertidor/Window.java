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
         double unit = Integer.parseInt(cad1);
         double rslt = 0;
	 Longitud unitL = new Longitud();
	 Superficie unitS = new Superficie();
	 Velocidad unitV = new Velocidad();
	 Volumen unitVol = new Volumen();
	 Peso unitP = new Peso();
	 Temperatura unitT = new Temperatura();

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

	      for (String a : superficie) {
		      if (cbDe.getSelectedItem() == "K. cuadrados" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitS.getKilo(a);
		      }
		      if (cbDe.getSelectedItem() == "M. cuadradas" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitS.getMile(a);
		      }
		      if (cbDe.getSelectedItem() == "Hectareas" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitS.getHect(a);
		      }
		      if (cbDe.getSelectedItem() == "Acres" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitS.getAcrs(a);
		      }
		      if (cbDe.getSelectedItem() == "Mtr. cuadrados" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitS.getMtrs(a);
		      }
		      if (cbDe.getSelectedItem() == "Pies cuadrados" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitS.getFeet(a);
		      }
	      }

	      for (String a : velocidad) {
		      if (cbDe.getSelectedItem() == "Km/s" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitV.getKms(a);
		      }
		      if (cbDe.getSelectedItem() == "Milla/s" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitV.getMls(a);
		      }
		      if (cbDe.getSelectedItem() == "m/s" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitV.getMs(a);
		      }
		      if (cbDe.getSelectedItem() == "Milla/hr" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitV.getMlh(a);
		      }
		      if (cbDe.getSelectedItem() == "Km/hr" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitV.getKh(a);
		      }
		      if (cbDe.getSelectedItem() == "Pie/s" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitV.getFeet(a);
		      }
	      }
	      
	      for (String a : volumen) {
		      if (cbDe.getSelectedItem() == "Metro cubico" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getMtr(a);
		      }
		      if (cbDe.getSelectedItem() == "Barril" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getBrl(a);
		      }
		      if (cbDe.getSelectedItem() == "Litro" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getLtr(a);
		      }
		      if (cbDe.getSelectedItem() == "Galon" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getGal(a);
		      }
		      if (cbDe.getSelectedItem() == "C. cubico" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getCnc(a);
		      }
		      if (cbDe.getSelectedItem() == "Pinta" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getPnt(a);
		      }
		      if (cbDe.getSelectedItem() == "Mililitro" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getMlr(a);
		      }
		      if (cbDe.getSelectedItem() == "Onza liquida" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitVol.getOnz(a);
		      }
	      }

	      for (String a : peso) {
		      if (cbDe.getSelectedItem() == "Tonelada" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitP.getTon(a);
		      }
		      if (cbDe.getSelectedItem() == "T. corta" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitP.getTcr(a);
		      }
		      if (cbDe.getSelectedItem() == "Kilogramo" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitP.getKgr(a);
		      }
		      if (cbDe.getSelectedItem() == "Libra" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitP.getLbr(a);
		      }
		      if (cbDe.getSelectedItem() == "Gramo" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitP.getGrm(a);
		      }
		      if (cbDe.getSelectedItem() == "Onza" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitP.getOnz(a);
		      }
	      }

	      for (String a : temperatura) {
		      if (cbDe.getSelectedItem() == "Celsius" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitT.getCel(a);
		      }
		      if (cbDe.getSelectedItem() == "Fahrenheit" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitT.getFah(a);
		      }
		      if (cbDe.getSelectedItem() == "Kelvin" && cbA.getSelectedItem() == a) {
			      rslt = unit * unitT.getKel(a);
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
