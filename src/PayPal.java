public class PayPal implements Payable {
    String adresseEmail;
    String motDePasse;

    public PayPal(String email, String pwd){
        this.adresseEmail=email;
        this.motDePasse=pwd;
    }
    public void effectuerPaiement(double montant){
        if(montant>0){
            System.out.println("le paiement de "+montant+"$ a ete effectue avec succes via le PayPal !");
        }else if(montant<=0){
            System.out.println("le montant a payer doit etre positif !!");
        }
    }
}
