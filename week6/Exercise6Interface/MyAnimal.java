package Exercise6Interface;

public class MyAnimal implements Pet, Rabbit{
    private String name;

    public String getName() {
        return name;
    }
      @Override
    public void bark() {
        System.out.println("My dog(" + name + ") is barking");
    }

    @Override
    public void stroke() {
        System.out.println("Stroke");
    }

    MyAnimal(String name){
        this.name = name;
    }
 
  

    
}

 interface Pet {
    public void stroke();  
}
 interface Rabbit {
    public void bark();  
}
