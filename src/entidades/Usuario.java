package entidades;

import java.util.ArrayList;

public class Usuario {
	private String name;
	private String email;
	private String cPF;
	private ArrayList<Pruu> pruus;

	public Usuario() {
		super();
	}

	public Usuario(String name, String email, String cPF) {
		super();
		this.name = name;
		this.email = email;
		this.cPF = cPF;
	}

	public void addLike(Pruu pruu) {
		pruu.setLikes(pruu.getLikes() + 1);
	}

	public void listaDePruus(ArrayList<Usuario> listaDeUsuarios) {
		System.out.println("             Listando todos os pruus");
		for (int i = 0; i < listaDeUsuarios.size(); i++) {
			int numeroDePruus = listaDeUsuarios.get(i).getPruus().size();
			System.out.println("Nome: " + listaDeUsuarios.get(i).getName().toUpperCase());

			for (int j = 0; j < numeroDePruus; j++) {
				System.out.println(listaDeUsuarios.get(i).getPruus().get(j).toString());
			}

		}
	}

	public void pruusdeUsuario(Usuario usuario) {
		System.out.println("             Listando pruus do usuário selecionado");
		int numeroDePruus = usuario.getPruus().size();

		System.out.println("Nome: " + usuario.getName().toUpperCase());

		for (int j = 0; j < numeroDePruus; j++) {
			System.out.println(usuario.getPruus().get(j).toString());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return cPF;
	}

	public void setCPF(String cPF) {
		this.cPF = cPF;
	}

	public ArrayList<Pruu> getPruus() {
		return pruus;
	}

	public void setPruus(ArrayList<Pruu> pruus) {
		this.pruus = pruus;
	}
}
