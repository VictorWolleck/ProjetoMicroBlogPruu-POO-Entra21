package entidades;

import java.util.Date;

public class Pruu {
	private static int idIndex;
	private int id;
	private String text;
	private Date dateOfCriation;
	private int likes;
	private boolean isBlocked;

	public Pruu(String text) {

		validarText(text);
		this.id = idIndex;
		this.text = text;
		this.dateOfCriation = new Date();
		this.likes = 0;
		this.isBlocked = false;
		idIndex++;
	}

	@Override
	public String toString() {
		if (isBlocked) {
			return "Pruu Bloqueado";
		}
		return "Pruu [id=" + id + ", text=" + text + ", likes=" + likes + "]";
	}

	public void validarText(String text) {
		if (text.length() > 300 || text.trim().length() < 1) {
			System.out.println("O pruu deve ter no máximo 300 caracteres e no mínimo 1");
			return;
		}
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public static int getIdIndex() {
		return idIndex;
	}

	public int getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public Date getDate() {
		return dateOfCriation;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

}
