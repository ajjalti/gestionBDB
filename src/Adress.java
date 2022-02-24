public class Adress {
    private String country;
    private String codePostal;
    private String city;
    private String adress;
    //####################
    // constructors :
    //###################
    public Adress(String country,String code,String city,String adress){
        this.country=country;
        this.codePostal=code;
        this.city=city;
        this.adress=adress;
    }
    public Adress(){}
    //###############
    //les setters :
    //##############
    public void setCountry(String country){
        this.country=country;
    }
    public void setCodePostal(String code){
        this.codePostal=code;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    //############
    // getters :
    //############
    public String getCountry(){
        return this.country;
    }
    public String getCodePostal(){
        return this.codePostal;
    }
    public String getCity(){
        return this.city;
    }
    public String getAdress(){
        return this.adress;
    }
}
