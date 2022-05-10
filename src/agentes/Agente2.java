package agentes;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class Agente2 extends Agent {
    @Override
    protected void setup() {                //crea el primer hilo en la creacion del agente
        addBehaviour(new Comportamiento());
    }
    class Comportamiento extends CyclicBehaviour {
        @Override
        public void action(){
            //todo lo que necesite hacer el agente
            //ANN, AG, Bayes, if else
            System.out.println(getName());
            blockingReceive(); //this is blocking it
        }
    }
}
