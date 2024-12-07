public class CarteDeCredit implements Payable{
    String numeroCarte;
    String nomTitulaire;
    String dateExpiration;
    String codeCVV;

    public CarteDeCredit(String numC ,String nameT,String dateE,String codeC){
        if(numC.length()==16){
            this.numeroCarte=numC;
            this.nomTitulaire=nameT;
            this.dateExpiration=dateE;
            this.codeCVV=codeC;
        }
    }
    public void effectuerPaiement(double montant){
        if(montant<=0){
            System.out.println("le montant a payer doit etre positif !!");
        }
        if (numeroCarte == null || numeroCarte.length() != 16) {
            System.out.println("Le numéro de carte est invalide(<16 chiffres). Paiement refusé.");
            return;
        }
        if(montant>0){
            System.out.println("le paiement de "+montant+"$ a ete effectue avec succes via la carte de credit !");

        }
    }

}