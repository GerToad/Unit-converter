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

public class Longitud {

	private Map<String, Double> kilo = new HashMap<>();
	private Map<String, Double> mile = new HashMap<>();
	private Map<String, Double> yard = new HashMap<>();
	private Map<String, Double> cent = new HashMap<>();
	private Map<String, Double> mili = new HashMap<>();
	private Map<String, Double> feet = new HashMap<>();
	private Map<String, Double> inch = new HashMap<>();

	public Longitud() {
		kilo.put("Kilometros", 1.00);
		kilo.put("Millas", 0.62);
		kilo.put("Yardas", 1093.61);
		kilo.put("Centimetros", 100000.0);
		kilo.put("Milimetros", 10000000.0);
		kilo.put("Pies", 3280.84);
		kilo.put("Pulgadas", 39370.08);
		
		mile.put("Kilometros", 1.61);
		mile.put("Yardas", 1760.00);
		mile.put("Centimetros", 160934.4);
		mile.put("Milimetros", 1609344.0);
		mile.put("Pies", 5280.00);
		mile.put("Pulgadas", 63360.00);
		
		yard.put("Millas", 0.000568);
		yard.put("Kilometros", 0.000914);
		yard.put("Centimetros", 91.44);
		yard.put("Milimetros", 914.4);
		yard.put("Pies", 3.00);
		yard.put("Pulgadas", 36.00);
		
		cent.put("Kilometros", 0.00001);
		cent.put("Yardas", 0.01094);
		cent.put("Millas", 0.00001);
		cent.put("Milimetros", 10.00);
		cent.put("Pies", 0.03281);
		cent.put("Pulgadas", 0.3937);
		
		mili.put("Millas", 0.000000062);
		mili.put("Yardas", 0.0010936);
		mili.put("Centimetros", 0.1);
		mili.put("Kilometros", 0.000001);
		mili.put("Pies", 0.003280);
		mili.put("Pulgadas", 0.039370);
		
		feet.put("Kilometros", 0.0003);
		feet.put("Yardas", 0.33333);
		feet.put("Centimetros", 30.48);
		feet.put("Milimetros", 304.8);
		feet.put("Millas", 0.00019);
		feet.put("Pulgadas", 12.00);
		
		inch.put("Millas", 0.00002);
		inch.put("Yardas", 0.02778);
		inch.put("Centimetros", 2.54);
		inch.put("Milimetros", 25.4);
		inch.put("Pies", 0.08333);
		inch.put("Kilometros", 0.00003);
	}

	public Double getKilo(String key) {
		return kilo.get(key);
	}
	public Double getMile(String key) {
		return mile.get(key);
	}
	public Double getYard(String key) {
		return yard.get(key);
	}
	public Double getCent(String key) {
		return cent.get(key);
	}
	public Double getMili(String key) {
		return mili.get(key);
	}
	public Double getFeet(String key) {
		return feet.get(key);
	}
	public Double getInch(String key) {
		return inch.get(key);
	}
}
