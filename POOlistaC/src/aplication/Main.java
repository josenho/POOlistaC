package aplication;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        emitirSomDoAnimal(cachorro); 
        emitirSomDoAnimal(gato);     

        cachorro.dormir();    
        gato.dormir();        
    }

    public static void emitirSomDoAnimal(EmitirSom animal) {
        animal.emitirSom();
    }
}
