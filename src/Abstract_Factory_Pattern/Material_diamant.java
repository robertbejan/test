package Abstract_Factory_Pattern;
//concrete factory pentru echipamente de diamant
//selectam echipamentul dorit
public class Material_diamant implements Fierarie<Diamant>{

	public Diamant create(String echipament) {
		if("sabie".equalsIgnoreCase(echipament))
			return new Sabie_diamant();
		else if("tarnacop".equalsIgnoreCase(echipament))
			return new Tarnacop_diamant();
		else if("topor".equalsIgnoreCase(echipament))
			return new Topor_diamant();
		return null;
	}

}
