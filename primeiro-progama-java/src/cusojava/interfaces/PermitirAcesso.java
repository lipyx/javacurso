package cusojava.interfaces;

// Essa interface ser� nosso contrato de contrata��o.
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);// Apenas declara��o do metodo.

	public boolean autenticar();
}
