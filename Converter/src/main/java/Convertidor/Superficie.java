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

public class Superficie {
	//private String[] superficie = {"K. cuadrados", "M. cuadradas", "Hectareas", "Acres", "Mtr. cuadrados", "Pies cuadrados"};

	private Map<String, Double> kcud = new HashMap<>();
	private Map<String, Double> mcud = new HashMap<>();
	private Map<String, Double> hect = new HashMap<>();
	private Map<String, Double> acrs = new HashMap<>();
	private Map<String, Double> mrcd = new HashMap<>();
	private Map<String, Double> fcud = new HashMap<>();

	public Superficie() {
		kcud.put("K. cuadrados", 1.00);
		kcud.put("M. cuadradas", 0.386);
		kcud.put("Hectareas", 100.00);
		kcud.put("Acres", 247.106);
		kcud.put("Mtr. cuadrados", 1000000.0);
		kcud.put("Pies cuadrados", 10763.91);
		
		mcud.put("K. cuadrados", 2.59);
		mcud.put("M. cuadradas", 1.00);
		mcud.put("Hectareas", 258.999);
		mcud.put("Acres", 640.0);
		mcud.put("Mtr. cuadrados", 2589987.83);
		mcud.put("Pies cuadrados", 27878395.92);
		
		hect.put("K. cuadrados", 0.01);
		hect.put("M. cuadradas", 0.004);
		hect.put("Hectareas", 1.00);
		hect.put("Acres", 2.47);
		hect.put("Mtr. cuadrados", 10000.0);
		hect.put("Pies cuadrados", 107639.1);
		
		acrs.put("K. cuadrados", 0.004);
		acrs.put("M. cuadradas", 0.002);
		acrs.put("Hectareas", 0.405);
		acrs.put("Acres", 1.00);
		acrs.put("Mtr. cuadrados", 4046.85);
		acrs.put("Pies cuadrados", 43559.97);
		
		mrcd.put("K. cuadrados", 0.000001);
		mrcd.put("M. cuadradas", 0.00000003);
		mrcd.put("Hectareas", 0.0001);
		mrcd.put("Acres", 0.000024);
		mrcd.put("Mtr. cuadrados", 1.00);
		mrcd.put("Pies cuadrados", 10.76);
		
		fcud.put("K. cuadrados", 0.0000000092);
		fcud.put("M. cuadradas", 0.0000000035);
		fcud.put("Hectareas", 0.0000092);
		fcud.put("Acres", 0.000022);
		fcud.put("Mtr. cuadrados", 0.092);
		fcud.put("Pies cuadrados", 1.00);
		
	}

	public Double getKilo(String key) {
		return kcud.get(key);
	}
	public Double getMile(String key) {
		return mcud.get(key);
	}
	public Double getHect(String key) {
		return hect.get(key);
	}
	public Double getAcrs(String key) {
		return acrs.get(key);
	}
	public Double getMtrs(String key) {
		return mrcd.get(key);
	}
	public Double getFeet(String key) {
		return fcud.get(key);
	}
}
