import java.util.ArrayList;
import java.util.Date;

public class CompteBancaire {
    private int solde;
    private int numero;
    private String date;
    private static int nmbrCompte;
    private int nmbrCompteCrediter;
    private int nmbrCompteDebiter;
    private Personne owner =new Personne();
    ArrayList<Operation> operation = new ArrayList<Operation>();

    //#############
    //constructor 1:
    //#############

    public CompteBancaire(int numero,String date, int solde,Personne personne){
        this.numero=numero;
        this.date=date;
        this.solde=solde;
        this.owner=personne;
        nmbrCompte++;
    }
    //#############
    //constructor 2:
    //#############
    public CompteBancaire(){
        nmbrCompte++;
    }
    //#############
    //constructor 3:
    //#############
    public CompteBancaire(int numero){
        this.numero=numero;
        Date date = new Date();
        this.date=date.toString();
        nmbrCompte++;
    }
    //#############
    //les setters:
    //#############
    public void setSolde(int solde){
        this.solde=solde;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setDate(String date){
        this.date=date;
    }
    //#############
    //les getters :
    //#############
    public int getSolde(){
        return this.solde;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getDate(){
        return this.date;
    }
    public static int NombrCompte(){
        return nmbrCompte;
    }
    public int NmbrCompteCrediter(){
        return this.nmbrCompteCrediter;
    }
    public int NmbrCompteDebiter(){
        return this.nmbrCompteDebiter;
    }
    //######################################
    // affichage du profil de propriétaire :
    //######################################
    public void getProfil(){
        System.out.println("#########################################################");
        System.out.println("\t\t\t\t\t***profil du propriétaire***");
        System.out.println("Nom du propriétaire :\t"+this.owner.getName());
        System.out.println("Prenom du propriétaire :\t"+this.owner.getPrenom());
        System.out.println("Email du propriétaire :\t"+this.owner.getEmail());
        System.out.println("Adress du propriétaire :\t"+this.owner.getAdress().getAdress());
        System.out.println("Code postal du propriétaire :\t"+this.owner.getAdress().getCodePostal());
        System.out.println("Ville du propriétaire :\t"+this.owner.getAdress().getCity());
        System.out.println("Payé du propriétaire :\t"+this.owner.getAdress().getCountry());
        System.out.println("Tel du propriétaire :\t"+this.owner.getTel());
        System.out.println("#########################################################");

    }
    //###################
    // test d'opérations:
    //###################
    private static void valid(){
        System.out.println("opéartion éffectuer");
    }
    private static void invalid(){
        System.out.println("opération eshooée ! votre solde ne peux pax etre debiter avec cet somme ");
    }
    //####################
    // opération débiter :
    //####################
    public void Debiter(int solde){
        if((this.solde-=solde)<0){
            invalid();
        }else {
            this.solde-=solde;
            this.nmbrCompteDebiter++;
            valid();
            Date date =new Date();
            this.operation.add(new Operation("Debitation",solde,date.toString()));
        }
    }
    //#####################
    // opération créditer :
    //#####################
    public void Crediter(int solde){
        this.solde+=solde;
        this.nmbrCompteCrediter++;
        valid();
        Date date =new Date();
        this.operation.add(new Operation("Crediter",solde,date.toString()));


    }
    //####################
    // affichage des opération effectuer :
    //#####################
    public void AffichageOperation(){
        for(int i=0;i<this.operation.size();i++){
            this.operation.get(i).getOperations();
        }
    }
    // affichage du compte:
    //#####################
    public void Affichage(){
        System.out.println("#########################################################");
        System.out.println("\t\tProfil du Propriétaire de compte :");
        System.out.println("Numero de compte :"+this.numero);
        System.out.println("Date de création :"+this.date);
        System.out.println("Nombre d'opération de créditation :"+this.nmbrCompteCrediter);
        System.out.println("Nombre d'opération de débitation :"+this.nmbrCompteDebiter);
        System.out.println("\t\t\t\t\t\t\t\t\t\tSolde :"+this.solde);
        System.out.println("#########################################################");

    }
}
