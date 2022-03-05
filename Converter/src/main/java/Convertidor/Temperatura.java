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

public class Temperatura {
  //temperatura = {"Celsius", "Fahrenheit", "Kelvin"};

	private Map<String, Double> cel = new HashMap<>();
	private Map<String, Double> fah = new HashMap<>();
	private Map<String, Double> kel = new HashMap<>();

	public Temperatura() {
		cel.put("Celsius", 1.00);
		cel.put("Fahrenheit", 33.8);
		cel.put("Kelvin", 274.15);
		
		fah.put("Celsius", -17.22);
		fah.put("Fahrenheit", 1.00);
		fah.put("Kelvin", 255.93);
		
		kel.put("Celsius", -272.15);
		kel.put("Fahrenheit", -457.72);
		kel.put("Kelvin", 1.00);
		
	}

	public Double getCel(String key) {
		return cel.get(key);
	}
	public Double getFah(String key) {
		return fah.get(key);
	}
	public Double getKel(String key) {
		return kel.get(key);
	}
}
