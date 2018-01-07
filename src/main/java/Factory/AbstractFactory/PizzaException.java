package Factory.AbstractFactory;

public class PizzaException extends Exception {
        private static final long serialVersionUID = 8110345414312602844L;

        public PizzaException(String msg){
            super(msg);
            System.out.println("PizzaException~");
        }
}
