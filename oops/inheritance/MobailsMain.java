package oops.inheritance;

public class MobailsMain {
	public static void main(String[] args) {

		Samsung s = new Samsung();
		Xiaomi x = new Xiaomi();
		Nokia n = new Nokia();

		s.setColour("Silver");
		s.setCost(30000);
		s.setRam("4Gb");
		s.setVersion("Andriod pia");

		System.out.println(s.getColour());
		System.out.println(s.getCost());
		System.out.println(s.getRam());
		System.out.println(s.getVersion());
		System.out.println();

		x.setColour("Pupral");
		x.setCost(40000);
		x.setRam("4Gb");

		System.out.println(x.getColour());
		System.out.println(x.getCost());
		System.out.println(x.getRam());
		System.out.println();

		n.setColour("White");
		n.setCost(50000);
		n.setRam("3Gb");

		System.out.println(n.getColour());
		System.out.println(n.getCost());
		System.out.println(n.getRam());

	}
}
