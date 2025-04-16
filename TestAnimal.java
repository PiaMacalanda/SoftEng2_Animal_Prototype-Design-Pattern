public class TestAnimal {
    
    public static void main(String[] args) {
    
        AnimalRegistry registry = new AnimalRegistry();
        
        Animal sheep1 = registry.createSheep("Sheep");
        System.out.println(sheep1.getType());
        sheep1.makeSound();
        
        Animal sheep2 = registry.createSheep("Sheep");
        System.out.println(sheep2.getType());
        sheep2.makeSound();
        
        Animal cow = registry.createCow();
        System.out.println(cow.getType());
        cow.makeSound();
        
        Animal horse = registry.createHorse();
        System.out.println(horse.getType());
        horse.makeSound();
        
        Animal blackHorse = registry.createColoredHorse("black🖤");
        System.out.println(blackHorse.getType());
        blackHorse.makeSound();

        Animal pinkHorse = registry.createColoredHorse("pink🌷");
        System.out.println(pinkHorse.getType());
        pinkHorse.makeSound();
    }
}