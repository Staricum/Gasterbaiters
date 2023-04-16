import java.time*;

public class DeciduousTree implements Tree {
	public void display(int x, int y) {
		System.out.println("Deciduous tree located at " + x + ", " + y);
		if (!this.isWithinRange(LocalDate.now())) {
			System.out.println("The tree currently has no leaves");
		}
	}
}