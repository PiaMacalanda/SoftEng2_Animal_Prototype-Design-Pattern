class Horse implements Animal {

    private int legs;
    private String sound;
    private String food;
    private String color;
    
    public Horse() {

        this.legs = 4;
        this.sound = "Neigh";
        this.food = "hay";
        this.color = "brown";
    }
    
    public void setColor(String color) {

        this.color = color;
    }
    
    @Override
    public Animal clone() {

        Horse horseClone = new Horse();
        horseClone.legs = this.legs;
        horseClone.sound = this.sound;
        horseClone.food = this.food;
        horseClone.color = this.color;
        return horseClone;
    }
    
    @Override
    public void makeSound() {

        System.out.println(sound + "🔊!");
    }
    
    @Override
    public String getType() {
        
        return "I am a " + color + " horse with " + legs + " legs and I eat " + food;
    }
}