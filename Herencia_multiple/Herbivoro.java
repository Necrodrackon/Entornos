package Herencia_multiple;

public interface Herbivoro extends Animal {

	@Override
	public default void darDeComer()
	{
		System.out.println("Como como un herbívoro");
	}
	

}
