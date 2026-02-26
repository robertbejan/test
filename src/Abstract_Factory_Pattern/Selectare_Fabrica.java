package Abstract_Factory_Pattern;
//pentru a evita incarcarea mainului am optat pentru o calsa separata pentru selectarea fabricii
public class Selectare_Fabrica {

	/**
	 * 
	 * @param alegere paramentru pentru a alege tipul de material
	 * @return returneaza un obiect de tipul materialului ales
	 */
	public static Fierarie selectare(String alegere) {
		if("Lemn".equalsIgnoreCase(alegere))
			return new Material_lemn();
		else if("Piatra".equalsIgnoreCase(alegere))
			return new Material_piatra();
		else if("Fier".equalsIgnoreCase(alegere))
			return new Material_fier();
		else if("Aur".equalsIgnoreCase(alegere))
			return new Material_aur();
		else if("Diamant".equalsIgnoreCase(alegere))
			return new Material_diamant();
		return null;
	}
	
}
