package echec;

import modele.Piece;
import modele.Position;

public class Case {
	private Position position;
	private Piece piece;
	private String affichage;
	
	
	public String getAffichage() {
		return affichage;
	}

	public void setAffichage(String affichage) {
		this.affichage = affichage;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Case(Position position) {
		this.position = position;
	}
	
	public void positionne(Piece p)
	{
		this.piece=p;
	}
	
	
	public Position getPosition() {
		return position;
	}
	public void vider() {
		piece=null;
	}
	 public Piece getPiece()
	 {
		 return piece;
	 }

	@Override
	public String toString() {
		return ("Case"+ position + piece);
	}
	 
	 
}
