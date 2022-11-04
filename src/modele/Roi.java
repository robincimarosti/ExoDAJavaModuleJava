package modele;

import java.util.ArrayList;
import java.util.List;

import echec.Couleur;

public class Roi extends Piece{
	public static List <Roi> tabRoi=new ArrayList<Roi>();
	private boolean echec=false;
	private boolean echecEtMat=false;
	private boolean echecEtPat=false;
	private boolean premierTour=true;

	public boolean isEchecEtPat() {
		return echecEtPat;
	}


	public void setEchecEtPat(boolean echecEtPat) {
		this.echecEtPat = echecEtPat;
	}


	public boolean isPremierTour() {
		return premierTour;
	}


	public void setPremierTour(boolean premierTour) {
		this.premierTour = premierTour;
	}


	public void setEchec(boolean echec) {
		this.echec = echec;
	}


	public void setEchecEtMat(boolean echecEtMat) {
		this.echecEtMat = echecEtMat;
	}


	public Roi(int x, int y, Couleur c) {
		super(x, y, c);
		tabRoi.add(this);
		// TODO Auto-generated constructor stub
	}


	public boolean isEchec() {
		return echec;
	}


	public boolean isEchecEtMat() {
		return echecEtMat;
	}


	public List<Position> getMouvementPossible() {
		// TODO Auto-generated method stub
		int x=position.getX();
		int y=position.getY();
		List<Position> mouvementPossible = new ArrayList<Position>();


		for (int c=-1;c<=1;c++)	//colonne
		{
			for(int l=-1;l<=1;l++)	//ligne
			{
				Position temp=new Position(x+l,y+c);
				if((l!=0 || c!=0 )&& temp.inBounds() && !this.bloqueAmi(temp))	
				{

					mouvementPossible.add(temp.clone());			

				}
			}
		}

		mouvementPossible=MouvementAutorises(mouvementPossible); 




		return mouvementPossible;
	}


	public List<Position> MouvementAutorises(List<Position> mouvement){
		List <Position> posPrises;
		List <Position> posEnlevees=new ArrayList <Position>();
		if (couleur.equals(Couleur.WHITE) )
			posPrises=posPrisesNoir;
		else
			posPrises=posPrisesBlanc;

		for (Position pos:mouvement) {
			for (Position pos2:posPrises) {
				if (pos.equals(pos2)) {
					posEnlevees.add(pos);
					break;
				}

			}
		}
		mouvement.removeAll(posEnlevees);

		return mouvement;
	}


	public String update()
	{
		String result="";
		List<Position> tempTab;
		if (couleur.equals(Couleur.BLACK))
			tempTab=posPrisesBlanc;
		else
			tempTab=posPrisesNoir;
		if (echec)			
			echec=false;



		for (Position pos:tempTab) {	
			if(pos.equals(position))
			{
				echec=true;
				result="echec";
			}

		}


		if(!echec && this.mouvementExecutable.isEmpty() &&
				Piece.getColoredPiece(couleur).size()==1)
		{

			echecEtPat=true;
			result="echec et pat";
		}


		if(echec && this.mouvementExecutable.isEmpty())
		{
			result="echec et mat";
			echecEtMat=true;
		}
		return result;
	}

	public static Roi getRoiCouleur(Couleur c)
	{
		for (Roi r:Roi.tabRoi) {
			if (r.couleur.equals(c))
				return r;
		}
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Roi "+super.position.getX()+","+super.position.getY()+"]" ;
	}

}
