
public class WandOfKeySummoningRecipe extends Recipe{
	public WandOfKeySummoningRecipe() {
		super(false, "runed_stick", "phoenix_feather", "sapphire", "unicorn_tears");
	}
	
	public void combineInRoom(Room r) {
		System.out.println("You attempt to combine the following items: runed_stick, phoenix_feather, sapphire, unicorn_tears");
		System.out.println("You created a wand_of_key_summoning!");
		WandOfKeySummoning w = new WandOfKeySummoning("wand_of_key_summoning",  "a magical wand that can summon a key.");
		r.add(w);
		removeIngredientsFromRoom(r);
	}
	
}
