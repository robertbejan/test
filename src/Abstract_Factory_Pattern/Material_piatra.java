package Abstract_Factory_Pattern;
//concrete factory pentru echipamente de piatra
//selectam echipamentul dorit
public class Material_piatra implements Fierarie<Piatra> {

	public Piatra create(String ecpiatra) {
		if("sabie".equalsIgnoreCase(ecpiatra))
			return new Sabie_piatra();
		else if("tarnacop".equalsIgnoreCase(ecpiatra))
			return new Tarnacop_piatra();
		else if("topor".equalsIgnoreCase(ecpiatra))
			return new Topor_piatra();
		return null;
	}
}
