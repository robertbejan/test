package Abstract_Factory_Pattern;
//concrete factory pentru echipamente de lemn
//selectam echipamentul dorit
public class Material_lemn implements Fierarie<Lemn> {
	@Override
	public Lemn create(String echipament) {
		if("sabie".equalsIgnoreCase(echipament))
			return new Sabie_lemn();
		else if("tarnacop".equalsIgnoreCase(echipament))
			return new Tarnacop_lemn();
		else if("topor".equalsIgnoreCase(echipament))
			return new Topor_lemn();
		return null;
	}
	

}
