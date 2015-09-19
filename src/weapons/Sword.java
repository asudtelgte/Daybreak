package weapons;

public class Sword extends Weapon
{
	public Sword()
	{
		damage = 2 * BASE_DAMAGE;
		reloadTime = 0;
		ammoCapacity = 0;//Or should this be int max...?
		isMelee = true;
		twoHanded = true;
		maxRange = 1;
	}
}
