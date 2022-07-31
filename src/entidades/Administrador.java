package entidades;

public class Administrador extends Usuario {

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(String name, String email, String cPF) {
		super(name, email, cPF);
		// TODO Auto-generated constructor stub
	}

	public void bloquearPruu(Pruu pruu) {
		pruu.setBlocked(true);
	}

	public void desbloquearPruu(Pruu pruu) {
		pruu.setBlocked(false);
	}

}
