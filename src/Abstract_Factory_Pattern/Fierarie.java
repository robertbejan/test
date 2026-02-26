package Abstract_Factory_Pattern;
//abstract factory
//utilizam un template ca sa putem accesa abstract product(aur,lemn etc)
public interface Fierarie<T> {
	
	T create(String echipament);
	
}
