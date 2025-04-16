class Sheep implements Animal {

    private int legs;
    private String sound;
    private String food;
    private String name;
    
    public Sheep() {

        this.legs = 4;
        this.sound = "Meeh";
        this.food = "grass";
        this.name = "Sheep";
    }
    
    public Sheep(String name) {

        this();
        this.name = name;
    }
    
    @Override
    public Animal clone() {

        Sheep sheepClone = new Sheep();
        sheepClone.legs = this.legs;
        sheepClone.sound = this.sound;
        sheepClone.food = this.food;
        sheepClone.name = this.name;
        return sheepClone;
    }
    
    @Override
    public void makeSound() {

        System.out.println(sound + "🔊!");
    }
    
    @Override
    public String getType() {
        
        return "I am a " + name + " with " + legs + " legs and I eat " + food;
    }
}