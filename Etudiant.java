package Etudiant;
import java. time.Period;
import java. time. LocalDate;
import java.time.format.DateTimeFormatter;
import java.time. format.DateTimeParseException;
import java.util.Scanner;
public class Etudiant{
	public static void main(String[] args) {
	Scanner sc=new Scanner (System. in);
	Ka[] tab= new Ka [10];
	int i,j;
	int choix=0;
	int nb=0;//nombre studiant saisie
	do {
		Ka e = new Ka();
		e.setNom(" ");
		e.setprenom(" ");
		e.setAdresse("");
		e.setAge(1);
		e.setNote(1);
		e.setEmail("");
		e.setDateNais("");
		// Afficher le menu
		System.out.println("MENU");
		System.out.println("1. Ajouter un etudiant");
		System.out.println("2. Trier par age");
		System.out.println("3. Meilleure et plus faible note");
		System.out.println("4. Afficher 5 etudiant plus agee et moins agee");
		System.out.println("0. Quitter");
		System.out.print("Votre choix : ");
	try {
	choix= Integer.parseInt(sc.nextLine());
	}catch(Exception
	ex) {
	System.out.println(ex);
	}
	switch(choix) {
	case 1:
	if(nb >= tab. length) {
	System.out.println("Tableau plein 1");
	break;
	}
	System.out.println("saisir le nom");
	e.setNom(sc.nextLine());System.out.println("saisir le prenom");
	e.setprenom(sc.nextLine());
}
	}