package Etudiant;
import java.time.LocalDate;
public class Ka {
	private String nom;
	private String prenom;
	private String adresse;
	private int age;
	private double note;
	private String email;
	private String dateNais;
	public Ka() {
	}
	public Ka(String nom,String prenon, String adresse, int age, int note, String email, String dateNais) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.age = age;
	this.note =note;
	this.email = email;
	this.dateNais =dateNais;
	}
	public String getDateNais() {
	 return dateNais;
	}
	public void setDateNais(String dateNais) {
	this.dateNais = dateNais;
	}
	public void setNote(double note) {
	this.note = note;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
	this.nom = nom;
	}
	public String getPrenom(String prenom) {
	return prenom;
	}
	public void setprenom(String prenom) {
	this.prenon = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adreese) {
		this.adresse = adresse;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public double getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note= note;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	}
	
		
