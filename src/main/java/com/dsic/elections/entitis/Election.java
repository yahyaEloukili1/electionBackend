package com.dsic.elections.entitis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Election {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numeroBureau;
	private String signeBureau;
	private int nmbInscrits;
	private int nmbMosa;
	private int feuillesSupprimes;
	private int voix;
	private float pourcentage;
	private Boolean confirmationSum;
	private String premier;
	private String partieDuPremier;
	private int nombreDesCheses;
	private String nomWinner;
	private int numeroWinner;
	private String addressBureau;
	private String lieuBureau;
	public String getAddressBureau() {
		return addressBureau;
	}

	public void setAddressBureau(String addressBureau) {
		this.addressBureau = addressBureau;
	}


	public String getLieuBureau() {
		return lieuBureau;
	}

	public void setLieuBureau(String lieuBureau) {
		this.lieuBureau = lieuBureau;
	}


	private int nbrPlaces;
	public int getNbrPlaces() {
		return nbrPlaces;
	}

	public void setNbrPlaces(int nbrPlaces) {
		this.nbrPlaces = nbrPlaces;
	}
	private String partieWinner;
	private String partieWinnerAr;
	public String getPartieWinnerAr() {
		return partieWinnerAr;
	}

	public void setPartieWinnerAr(String partieWinnerAr) {
		this.partieWinnerAr = partieWinnerAr;
	}

	public String getPartieWinner() {
		return partieWinner;
	}

	public void setPartieWinner(String partieWinner) {
		this.partieWinner = partieWinner;
	}

	public int getNumeroWinner() {
		return numeroWinner;
	}

	public void setNumeroWinner(int numeroWinner) {
		this.numeroWinner = numeroWinner;
	}

	public int getIdOfWinner() {
		return idOfWinner;
	}

	public void setIdOfWinner(int idOfWinner) {
		this.idOfWinner = idOfWinner;
	}
	private String prenomWinner;

private int idOfWinner;

	
	public String getNomWinner() {
		return nomWinner;
	}

	public void setNomWinner(String nomWinner) {
		this.nomWinner = nomWinner;
	}

	public String getPrenomWinner() {
		return prenomWinner;
	}

	public void setPrenomWinner(String prenomWinner) {
		this.prenomWinner = prenomWinner;
	}
	@ManyToOne
	private Commune commune;
	@ManyToOne
	private Cercle cercle;
    @OneToMany(mappedBy = "election")
	private List<Candidat> candidats;
	public Election() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Election(int numeroBureau, String signeBureau, int nmbInscrits, int nmbMosa, int feuillesSupprimes, int voix,
			float pourcentage, Boolean confirmationSum, String premier, String partieDuPremier, int nombreDesCheses,
			int idOfWinner, Commune commune, Cercle cercle, List<Candidat> candidats) {
		super();
		this.numeroBureau = numeroBureau;
		this.signeBureau = signeBureau;
		this.nmbInscrits = nmbInscrits;
		this.nmbMosa = nmbMosa;
		this.feuillesSupprimes = feuillesSupprimes;
		this.voix = voix;
		this.pourcentage = pourcentage;
		this.confirmationSum = confirmationSum;
		this.premier = premier;
		this.partieDuPremier = partieDuPremier;
		this.nombreDesCheses = nombreDesCheses;
		this.idOfWinner = idOfWinner;
		this.commune = commune;
		this.cercle = cercle;
		this.candidats = candidats;
	}

	public Election(int numeroBureau, String signeBureau, int nmbInscrits, int nmbMosa, int feuillesSupprimes, int voix,
			float pourcentage, Boolean confirmationSum, String premier, String partieDuPremier, int nombreDesCheses,
			Commune commune, Cercle cercle, List<Candidat> candidats) {
		super();
		this.numeroBureau = numeroBureau;
		this.signeBureau = signeBureau;
		this.nmbInscrits = nmbInscrits;
		this.nmbMosa = nmbMosa;
		this.feuillesSupprimes = feuillesSupprimes;
		this.voix = voix;
		this.pourcentage = pourcentage;
		this.confirmationSum = confirmationSum;
		this.premier = premier;
		this.partieDuPremier = partieDuPremier;
		this.nombreDesCheses = nombreDesCheses;
		this.commune = commune;
		this.cercle = cercle;
		this.candidats = candidats;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroBureau() {
		return numeroBureau;
	}
	public void setNumeroBureau(int numeroBureau) {
		this.numeroBureau = numeroBureau;
	}
	public String getSigneBureau() {
		return signeBureau;
	}
	public void setSigneBureau(String signeBureau) {
		this.signeBureau = signeBureau;
	}
	public int getNmbInscrits() {
		return nmbInscrits;
	}
	public void setNmbInscrits(int nmbInscrits) {
		this.nmbInscrits = nmbInscrits;
	}
	public int getNmbMosa() {
		return nmbMosa;
	}
	public void setNmbMosa(int nmbMosa) {
		this.nmbMosa = nmbMosa;
	}
	public int getFeuillesSupprimes() {
		return feuillesSupprimes;
	}
	public void setFeuillesSupprimes(int feuillesSupprimes) {
		this.feuillesSupprimes = feuillesSupprimes;
	}
	public int getVoix() {
		return voix;
	}
	public void setVoix(int voix) {
		this.voix = voix;
	}
	public float getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	public Boolean getConfirmationSum() {
		return confirmationSum;
	}
	public void setConfirmationSum(Boolean confirmationSum) {
		this.confirmationSum = confirmationSum;
	}
	public String getPremier() {
		return premier;
	}
	public void setPremier(String premier) {
		this.premier = premier;
	}
	public String getPartieDuPremier() {
		return partieDuPremier;
	}
	public void setPartieDuPremier(String partieDuPremier) {
		this.partieDuPremier = partieDuPremier;
	}
	public int getNombreDesCheses() {
		return nombreDesCheses;
	}
	public void setNombreDesCheses(int nombreDesCheses) {
		this.nombreDesCheses = nombreDesCheses;
	}
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	public Cercle getCercle() {
		return cercle;
	}
	public void setCercle(Cercle cercle) {
		this.cercle = cercle;
	}
	public List<Candidat> getCandidats() {
		return candidats;
	}
	public void setCandidats(List<Candidat> candidats) {
		this.candidats = candidats;
	}
    
    
    
    
	
}
