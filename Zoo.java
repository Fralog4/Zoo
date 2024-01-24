public class Zoo{
    public static void main(String[]args){
        Dog dog=new Dog();  //create new objects and sets their instance variables 
        dog.setName("Dog");
        dog.setRoar("bark bark!");
        dog.sayHello(); //then call the methods
        dog.beFriendly();   //this method comes from Pet interface
        Canine wolf=new Wolf(); //because we grouped classes dog and wolf under Canine we can instantiate them from Canine class
        wolf.setName("Wolf");
        wolf.setRoar("Auuuuuuu! e Forza Cosenza!"); //sorry for this voluntary easter egg
        wolf.sayHello();
        Cat cat=new Cat();
        cat.setName("Cat");
        cat.setRoar("meow meow meow");
        cat.sayHello();
        cat.beFriendly();   //cat is a pet too so it has pet method
        Feline tiger=new Tiger(); //we made the same with the felines
        tiger.setName("Tiger");
        tiger.setRoar("ROAAAAAAAAR!");
        tiger.sayHello();
        Feline lion=new Lion();
        lion.setName("Lion");
        lion.setRoar("ROAAAAAAR! Do not confuse me with Tiger, I am the real King here");
        lion.sayHello();
    }
    
}