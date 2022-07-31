package principal;

import java.util.ArrayList;

import entidades.Administrador;
import entidades.Pruu;
import entidades.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {

		// cadastrar usuários (pelo menos 3, sendo um deles administrador)

		Usuario morgana = new Usuario("Morgana Lurdes", "morgana@pruumail.com", "11111");
		Usuario roger = new Usuario("Roger do Ultrage", "rogerdoultrage@pruummail.com", "22222");
		Administrador victor = new Administrador("Victor Wolleck", "victor@pruumail.com", "33333");

		// cada usuário deve enviar pelo menos 2 pruus
		ArrayList<Pruu> pruusMorgana = new ArrayList<Pruu>();

		Pruu pruuMorgana1 = new Pruu("Morgana Pruu 1");
		Pruu pruuMorgana2 = new Pruu("Morgana Pruu 2");

		morgana.setPruus(pruusMorgana);
		pruusMorgana.add(pruuMorgana1);
		pruusMorgana.add(pruuMorgana2);

		ArrayList<Pruu> pruusRoger = new ArrayList<Pruu>();

		Pruu pruuRoger1 = new Pruu("Roger Pruu 1");
		Pruu pruuRoger2 = new Pruu("Roger Pruu 2");

		roger.setPruus(pruusRoger);
		pruusRoger.add(pruuRoger1);
		pruusRoger.add(pruuRoger2);

		ArrayList<Pruu> pruusVictor = new ArrayList<Pruu>();

		Pruu pruuVictor1 = new Pruu("Victor Pruu 1");
		Pruu pruuVictor2 = new Pruu("Victor Pruu 2");

		victor.setPruus(pruusVictor);
		pruusVictor.add(pruuVictor1);
		pruusVictor.add(pruuVictor2);

		// - mostrar todos os pruus de todos os usuários

		ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();

		listaDeUsuarios.add(morgana);
		listaDeUsuarios.add(roger);
		listaDeUsuarios.add(victor);

		victor.listaDePruus(listaDeUsuarios);

		// - mostrar todos os pruus de um determinado usuário

		victor.pruusdeUsuario(morgana);

		// - dar like em um determinado pruu

		victor.addLike(pruuMorgana1);
		victor.pruusdeUsuario(morgana);

		// - administrador bloquear um determinado pruu
		victor.bloquearPruu(pruuRoger2);

		// - visualizar o pruu bloqueado (com usuário comum)

		morgana.pruusdeUsuario(roger);

	}

}
