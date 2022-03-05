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

public class Peso {
  //peso = {"Tonelada", "T. corta", "Kilogramo", "Libra", "Gramo", "Onza"},

	private Map<String, Double> ton = new HashMap<>();
	private Map<String, Double> tcr = new HashMap<>();
	private Map<String, Double> kgr = new HashMap<>();
	private Map<String, Double> lbr = new HashMap<>();
	private Map<String, Double> grm = new HashMap<>();
	private Map<String, Double> onz = new HashMap<>();

	public Peso() {
		ton.put("Tonelada", 1.00);
		ton.put("T. corta", 1.102);
		ton.put("Kilogramo", 1000.0);
		ton.put("Libra", 2204.62);
		ton.put("Gramo", 1000000.0);
		ton.put("Onza", 32150.74);
		
		tcr.put("Tonelada", 0.907);
		tcr.put("T. corta", 1.00);
		tcr.put("Kilogramo", 907.18);
		tcr.put("Libra", 2000.0);
		tcr.put("Gramo", 907184.74);
		tcr.put("Onza", 29166.66);
		
		kgr.put("Tonelada", 0.001);
		kgr.put("T. corta", 0.001);
		kgr.put("Kilogramo", 1.00);
		kgr.put("Libra", 2.20);
		kgr.put("Gramo", 1000.0);
		kgr.put("Onza", 32.15);
		
		lbr.put("Tonelada", 0.0005);
		lbr.put("T. corta", 0.0005);
		lbr.put("Kilogramo", 0.45);
		lbr.put("Libra", 1.00);
		lbr.put("Gramo", 453.59);
		lbr.put("Onza", 14.58);
		
		grm.put("Tonelada", 0.000001);
		grm.put("T. corta", 0.000001);
		grm.put("Kilogramo", 0.001);
		grm.put("Libra", 0.002);
		grm.put("Gramo", 1.00);
		grm.put("Onza", 0.03);
		
		onz.put("Tonelada", 0.000002);
		onz.put("T. corta", 0.000003);
		onz.put("Kilogramo", 0.02);
		onz.put("Libra", 0.06);
		onz.put("Gramo", 28.34);
		onz.put("Onza", 1.00);
		
	}

	public Double getTon(String key) {
		return ton.get(key);
	}
	public Double getTcr(String key) {
		return tcr.get(key);
	}
	public Double getKgr(String key) {
		return kgr.get(key);
	}
	public Double getLbr(String key) {
		return lbr.get(key);
	}
	public Double getGrm(String key) {
		return grm.get(key);
	}
	public Double getOnz(String key) {
		return onz.get(key);
	}
}
