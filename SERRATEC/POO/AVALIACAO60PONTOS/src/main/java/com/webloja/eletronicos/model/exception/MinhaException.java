package exception;

import java.util.InputMismatchException;

public class MinhaException extends InputMismatchException{
    
    public MinhaException(){
        super("Opção invalida...");
    }

    public MinhaException(String mensagem){
        super(mensagem);
    }
}
