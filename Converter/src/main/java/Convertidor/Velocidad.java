package Convertidor;

/**
 *
 * @author toad
 */
import java.util.*;

public class Velocidad {
  //velocidad = {"Km/s", "Milla/s", "m/s", "Milla/hr", "Km/hr", "Pie/s"},

	private Map<String, Double> kms = new HashMap<>();
	private Map<String, Double> mls = new HashMap<>();
	private Map<String, Double> ms = new HashMap<>();
	private Map<String, Double> mlh = new HashMap<>();
	private Map<String, Double> kh = new HashMap<>();
	private Map<String, Double> fs = new HashMap<>();

	public Velocidad() {
		kms.put("Km/s", 1.00);
		kms.put("Milla/s", 0.621);
		kms.put("m/s", 1000.00);
		kms.put("Milla/hr", 2236.936);
		kms.put("Km/hr", 3600.0);
		kms.put("Pie/s", 3280.84);
		
		mls.put("Km/s", 1.609);
		mls.put("Milla/s", 1.00);
		mls.put("m/s", 1609.344);
		mls.put("Milla/hr", 3600.0);
		mls.put("Km/hr", 5793.63);
		mls.put("Pie/s", 5280.00);
		
		ms.put("Km/s", 0.001);
		ms.put("Milla/s", 0.001);
		ms.put("m/s", 1.00);
		ms.put("Milla/hr", 2.237);
		ms.put("Km/hr", 3.6);
		ms.put("Pie/s", 3.281);
		
		mlh.put("Km/s", 0.0004);
		mlh.put("Milla/s", 0.0003);
		mlh.put("m/s", 0.447);
		mlh.put("Milla/hr", 1.00);
		mlh.put("Km/hr", 1.60);
		mlh.put("Pie/s", 1.46);
		
		kh.put("Km/s", 0.0003);
		kh.put("Milla/s", 0.0002);
		kh.put("m/s", 0.27);
		kh.put("Milla/hr", 0.62);
		kh.put("Km/hr", 1.00);
		kh.put("Pie/s", 0.91);
		
		fs.put("Km/s", 0.0003);
		fs.put("Milla/s", 0.0002);
		fs.put("m/s", 0.30);
		fs.put("Milla/hr", 0.68);
		fs.put("Km/hr", 1.09);
		fs.put("Pie/s", 1.00);
		
	}

	public Double getKms(String key) {
		return kms.get(key);
	}
	public Double getMls(String key) {
		return mls.get(key);
	}
	public Double getMs(String key) {
		return ms.get(key);
	}
	public Double getMlh(String key) {
		return mlh.get(key);
	}
	public Double getKh(String key) {
		return kh.get(key);
	}
	public Double getFeet(String key) {
		return fs.get(key);
	}
}
