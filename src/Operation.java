public class Operation {
    private String type;
    private int montant;
    private String date;
    private String status;

    //################
    // constructor
    //###############
    public Operation(String type,int montant,String date,String status){
        this.type=type;
        this.montant=montant;
        this.date=date;
        this.status=status;
    }
    public Operation(String type,int montant,String date){
        this.type=type;
        this.montant=montant;
        this.date=date;
        this.status="opéartion efféctuée";
    }
    public Operation(){}
    //#################
    // affichage :
    //################
    public void getOperations(){
        System.out.println("#######################");
        System.out.println("Type d'opération :\t"+this.type);
        System.out.println("Montant d'opération :\t"+this.montant);
        System.out.println("Date d'opération :\t"+this.date);
        System.out.println("status :\t"+this.status);
    }
}
