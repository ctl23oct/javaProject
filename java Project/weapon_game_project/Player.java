package weapon_game_project;

public class Player {
	public static void main(String[] args) {
		System.out.println("abc");
		System.out.println(12+45*6);
		Game g=new Game();
		Weapon w=g.selectWeapon();
		w.use();
	}

}
