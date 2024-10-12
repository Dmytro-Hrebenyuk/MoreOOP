package lotr;

public class King extends Character {

    public King(){
        super((int) Math.random() * 11 + 5 ,(int) Math.random() * 11 + 5);
    }
    

    @Override
    public void kick(Character c) {
        int damage = (int) (Math.random() * (this.power + 1));
        c.setHp(c.getHp() - damage);
    }
}
