class AnimalRegistry {

    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;
    
    public AnimalRegistry() {

        sheepPrototype = new Sheep();
        cowPrototype = new Cow();
        horsePrototype = new Horse();
    }
    
    public Animal createSheep(String name) {

        Sheep clone = (Sheep) sheepPrototype.clone();
        return new Sheep(name);
    }
    
    public Animal createCow() {

        return cowPrototype.clone();
    }
    
    public Animal createHorse() {

        return horsePrototype.clone();
    }
    
    public Animal createColoredHorse(String color) {
        
        Horse horse = (Horse) horsePrototype.clone();
        horse.setColor(color);
        return horse;
    }
}