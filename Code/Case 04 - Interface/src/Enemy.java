public class Enemy implements IDamageable, IAttack{
    private String name;
    private HP hp;
    private int attack;
    private int defense;

    public Enemy(String name, HP hp, int attack, int defense){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp.getHealth();
    }

    public int getAttack(){
        return attack;
    }

    public int getDefense(){
        return defense;
    }

    @Override
	public int takeDamage(int damage, int defense) {
        System.out.println(name);
		hp = new HP(hp.getHealth() - damage);
		System.out.println(name + " is taking damage for " + damage + " point(s)");
		return damage;
	}

	@Override
	public void attack(IDamageable target) {
		System.out.print(name + " attacking ");
        if(hp.getHealth() == 0){
            target.takeDamage(0, 0);
        }
        else{
            target.takeDamage(attack, defense);
        }
	}

	public void showHP() {
		System.out.println(name + " current HP is " + hp.getHealth());
	}
}
