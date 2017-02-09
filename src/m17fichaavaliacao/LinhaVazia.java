package m17fichaavaliacao;

/**
 * Classe LinhaVazia, que herda da superclasse Exception,
 * esta exceção vai ser utilizada, através de um if na classe Janela, para verificar
 * a presença de um campo de texto vazio e mostrar a respetiva mensagem de erro.
 * @author a13226 a15684
 * @version 1.0 09.fev.2017
 * https://github.com/HugoPinto1/FichaAvaliacao.git
 */

public class LinhaVazia extends Exception{
    
    /**
     * Construtor com parâmetros
     * @param mensagem, a mensagem que vai aparecer, como erro, caso o utilizador deixe
     * um campo de texto vazio.
     */
    
    public LinhaVazia(String mensagem){
        super(mensagem);
    }
}
