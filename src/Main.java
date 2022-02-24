public class Main {
    public static void main(String [] args){
        //##################################
        //  tests :
        //#################################
        Adress adress1 = new Adress("maroc","63300","city1","adress 1");
        Adress adress2 = new Adress("maroc","63300","city2","adress 2");
        Adress adress3 = new Adress("maroc","63300","city3","adress 3");
        Personne user1 = new Personne("user1","Kaouthar","exemple1@email.com",adress1,"06666666666");
        Personne user2 = new Personne("user2","Kaouthar","exemple2@email.com",adress2,"06666666666");
        Personne user3 = new Personne("user3","Kaouthar","exemple3@email.com",adress3,"06666666666");
        CompteBancaire compte1 = new CompteBancaire(1,"24/2/2022",10000,user1);
        CompteBancaire compte2 = new CompteBancaire(2,"23/2/2022",30000,user2);
        CompteBancaire compte3 = new CompteBancaire(3,"22/2/2022",90000,user3);
        CompteBancaire compte4 = new CompteBancaire(4);
        CompteBancaire compte5 = new CompteBancaire();
        compte1.Crediter(20000);
        compte3.Debiter(30000);
        compte2.Debiter(40000);
        compte1.Affichage();
        compte2.Affichage();
        compte3.Affichage();
        compte4.Affichage();
        compte5.Affichage();
        compte1.getProfil();
        compte1.Debiter(10000);
        compte1.AffichageOperation();

    }
}
