package permitir.acesso.login;

import cusojava.interfaces.PermitirAcesso;

public class PermitirLogin {
	
	
	private PermitirAcesso acesso;

	public boolean autenticar() {
		return acesso.autenticar();
	}
	
	public PermitirLogin(PermitirAcesso acesso) {
		this.acesso = acesso;
	}

}
