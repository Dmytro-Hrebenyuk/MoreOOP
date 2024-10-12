package lotr;

public abstract class Character {
    int hp;
    int power;

    public Character (int power , int hp) { 
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick (Character c);



    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + this.getHp() + ", "+ "power=" + this.getPower()+ "}";

    };

    public int getHp() {
        if (hp > 0) {return hp;
}
        else {
            return 0;
        }
    }

    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
}