abstract public class Animal{   //superclass
    private String roar;    //private instance variables due to Encapsulation so we can hide our data
    private String name;
    public void setName(String n){  //we need to provide a setter and a getter method for the instance variables
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setRoar(String r){
        roar=r;
    }
    public String getRoar(){
        return roar;
    }
    public void sayHello(){ //method of Animal class
        if(name!=null && roar!=null){   //put a checker to avoid null value we don't want to print
            System.out.println("Greetings I am a "+getName()+" and this is my voice: "+getRoar());
    }
}
}
