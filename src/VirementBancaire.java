public class VirementBancaire implements Payable{
    String nomBanque;
    String iban;
    String bic;

    public VirementBancaire(String nameB,String idB,String bbic){
        this.nomBanque=nameB;
        this.iban=idB;
        this.bic=bbic;
    }
    public void effectuerPaiement(double montant){
        if(montant>0){
            System.out.println("le paiement de "+montant+"$  a ete effectue avec succes via le virement bancaire !");
        }else{
            System.out.println("le montant a payer doit etre positif !!");
        }
    }
}
