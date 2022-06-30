package cusojava.interfaces;

// Essa interface será nosso contrato de contratação.
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);// Apenas declaração do metodo.

	public boolean autenticar();
}
