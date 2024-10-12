package lotr;

public class Elf extends Character{
    int hp = 10;
    int power = 10;
    public void toCry(){
    }
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        toCry();
        c.hp = 0;
    }


    
}
