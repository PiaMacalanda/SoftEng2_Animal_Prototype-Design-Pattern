class Cow implements Animal {

    private int legs;
    private String sound;
    private String food;
    
    public Cow() {

        this.legs = 4;
        this.sound = "Mooh";
        this.food = "grass";
    }
    
    @Override
    public Animal clone() {

        Cow cowClone = new Cow();
        cowClone.legs = this.legs;
        cowClone.sound = this.sound;
        cowClone.food = this.food;
        return cowClone;
    }
    
    @Override
    public void makeSound() {

        System.out.println(sound + "🔊!");
    }
    
    @Override
    public String getType() {

        return "I am a cow with " + legs + " legs and I eat " + food;
    }
}
