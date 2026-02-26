package Abstract_Factory_Pattern;
//concrete factory pentru echipamente de fier
//selectam echipamentul dorit
public class Material_fier implements Fierarie<Fier>{

	public Fier create(String echipament) {
		if("sabie".equalsIgnoreCase(echipament))
			return new Sabie_fier();
		else if("tarnacop".equalsIgnoreCase(echipament))
			return new Tarnacop_fier();
		else if("topor".equalsIgnoreCase(echipament))
			return new Topor_fier();
		return null;
	}

}
