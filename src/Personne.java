public class Personne {
    private String Name;
    private String Prenom;
    private String Email;
    private Adress adress = new Adress();
    private String Tel;
    //################
    // constructors :
    //###############
    public Personne(String name,String prenom,String email,Adress adress,String tel){
        this.Name=name;
        this.Prenom=prenom;
        this.Email=email;
        this.adress=adress;
        this.Tel=tel;
    }
    public Personne(){}
    //##############
    //les setters :
    //##############
    public void setName(String name) {
        this.Name = name;
    }
    public void setPrenom(String prenom){
        this.Prenom=prenom;
    }
    public void setEmail(String email){
        this.Email=email;
    }
    public void setAdress(Adress adress){
        this.adress=adress;
    }
    public void setTel(String tel){
        this.Tel=tel;
    }
    //#############
    //les getters :
    //#############
    public String getName(){
        return this.Name;
    }
    public String getPrenom(){
        return this.Prenom;
    }
    public String getEmail(){
        return this.Email;
    }
    public Adress getAdress(){
        return this.adress;
    }
    public String getTel(){
        return this.Tel;
    }
}
