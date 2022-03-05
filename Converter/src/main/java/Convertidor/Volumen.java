/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Convertidor;

/**
 *
 * @author toad
 */
import java.util.*;

public class Volumen {
  //volumen = {"Metro cubico", "Barril", "Litro", "Galon", "C. cubico", "Pinta", "Mililitro", "Onza liquida"};

	private Map<String, Double> Mtr = new HashMap<>();
	private Map<String, Double> Brl = new HashMap<>();
	private Map<String, Double> Ltr = new HashMap<>();
	private Map<String, Double> Gal = new HashMap<>();
	private Map<String, Double> Cnc = new HashMap<>();
	private Map<String, Double> Pnt = new HashMap<>();
	private Map<String, Double> Mlr = new HashMap<>();
	private Map<String, Double> Onz = new HashMap<>();

	public Volumen() {
		Mtr.put("Metro cubico", 1.00);
		Mtr.put("Barril", 6.11);
		Mtr.put("Litro", 1000.0);
		Mtr.put("Galon", 227.02);
		Mtr.put("C. cubico", 1000000.0);
		Mtr.put("Pinta", 1816.17);
		Mtr.put("Mililitro", 1000000.0);
		Mtr.put("Onza liquida", 33814.02);
		
		Brl.put("Metro cubico", 0.16);
		Brl.put("Barril", 1.00);
		Brl.put("Litro", 163.65);
		Brl.put("Galon", 37.15);
		Brl.put("C. cubico", 163.65);
		Brl.put("Pinta", 297.22);
		Brl.put("Mililitro", 163.65);
		Brl.put("Onza liquida", 5759.66);
		
		Ltr.put("Metro cubico", 0.001);
		Ltr.put("Barril", 0.009);
		Ltr.put("Litro", 1.00);
		Ltr.put("Galon", 0.227);
		Ltr.put("C. cubico", 1000.0);
		Ltr.put("Pinta", 1.81);
		Ltr.put("Mililitro", 1000.0);
		Ltr.put("Onza liquida", 35.195);
		
		Gal.put("Metro cubico", 0.005);
		Gal.put("Barril", 0.039);
		Gal.put("Litro", 4.54);
		Gal.put("Galon", 1.00);
		Gal.put("C. cubico", 4546.09);
		Gal.put("Pinta", 8.25);
		Gal.put("Mililitro", 4546.09);
		Gal.put("Onza liquida", 160.00);
		
		Cnc.put("Metro cubico", 0.000001);
		Cnc.put("Barril", 0.000009);
		Cnc.put("Litro", 0.001);
		Cnc.put("Galon", 0.0002);
		Cnc.put("C. cubico", 1.00);
		Cnc.put("Pinta", 0.0018);
		Cnc.put("Mililitro", 1.0);
		Cnc.put("Onza liquida", 0.035);
		
		Pnt.put("Metro cubico", 0.0005);
		Pnt.put("Barril", 0.004);
		Pnt.put("Litro", 0.56);
		Pnt.put("Galon", 0.12);
		Pnt.put("C. cubico", 568.26);
		Pnt.put("Pinta", 1.00);
		Pnt.put("Mililitro", 568.26);
		Pnt.put("Onza liquida", 19.9);
		
		Mlr.put("Metro cubico", 0.000001);
		Mlr.put("Barril", 0.000009);
		Mlr.put("Litro", 0.001);
		Mlr.put("Galon", 0.0002);
		Mlr.put("C. cubico", 1.0);
		Mlr.put("Pinta", 0.001);
		Mlr.put("Mililitro", 1.0);
		Mlr.put("Onza liquida", 0.035);
		
		Onz.put("Metro cubico", 0.000028);
		Onz.put("Barril", 0.00024);
		Onz.put("Litro", 0.028);
		Onz.put("Galon", 0.0064);
		Onz.put("C. cubico", 28.41);
		Onz.put("Pinta", 0.051);
		Onz.put("Mililitro", 28.41);
		Onz.put("Onza liquida", 1.00);
		
	}

	public Double getMtr(String key) {
		return Mtr.get(key);
	}
	public Double getBrl(String key) {
		return Brl.get(key);
	}
	public Double getLtr(String key) {
		return Ltr.get(key);
	}
	public Double getGal(String key) {
		return Gal.get(key);
	}
	public Double getCnc(String key) {
		return Cnc.get(key);
	}
	public Double getPnt(String key) {
		return Pnt.get(key);
	}
	public Double getMlr(String key) {
		return Mlr.get(key);
	}
	public Double getOnz(String key) {
		return Onz.get(key);
	}
}
