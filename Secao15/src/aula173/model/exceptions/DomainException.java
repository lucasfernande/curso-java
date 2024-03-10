package aula173.model.exceptions;

public class DomainException extends RuntimeException {
    // se for uma extenção da classe Exception -> o compilador OBRIGA você a tratar a exceção
    // se for da classe RuntimeException -> o compilador NÃO OBRIGA a tratar a exceção

    public DomainException(String msg) {
        super(msg);
    }
}
