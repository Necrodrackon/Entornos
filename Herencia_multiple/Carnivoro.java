package Herencia_multiple;

public interface Carnivoro extends Animal {

	
	@Override
	public default void darDeComer()
	{
		System.out.println("Como como un carnívoro");
	}

}
