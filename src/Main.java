import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Selectionnez le mode de paiement :");
        System.out.println("1_carte de credit");
        System.out.println("2_PayPal");
        System.out.println("3_virement bancaire");

        Scanner fetch = new Scanner(System.in);
        int choix=fetch.nextInt();

        switch (choix) {
            case 1:{
            System.out.println("Entrez le montant a payer :");
            double montant=fetch.nextDouble();
            fetch.nextLine();
            System.out.println("Entrez le numero de carte de credit :");
            String numC=fetch.nextLine();
            System.out.println("Entrez le nom du titulaire :");
            String nameT=fetch.nextLine();
            System.out.println("Entrez la date d\'expiration (MM/AA) :");
            String dateE=fetch.nextLine();
            System.out.println("Entrez le code CVV :");
            String codeC=fetch.nextLine();
            CarteDeCredit paiementAvecCarte= new CarteDeCredit(numC, nameT, dateE, codeC);
            paiementAvecCarte.effectuerPaiement(montant);}
            break;

            case 2:{            
            System.out.println("Entrez le montant a payer :");
            double montant=fetch.nextDouble();
            fetch.nextLine();
            System.out.println("Entrez l\'adresse email : ");
            String email=fetch.nextLine();
            System.out.println("Entrez le mot de passe :");
            String pwd=fetch.nextLine();
            PayPal paiementPayPal=new PayPal(email, pwd);
            paiementPayPal.effectuerPaiement(montant);}
            break;
            case 3:{
                System.out.println("Entrez le montant a payer :");
                double montant=fetch.nextDouble();
                fetch.nextLine();
                System.out.println("Entrez le numero de la banque :");
                String nameB=fetch.nextLine();
                System.out.println("Entrez le iban :");
                String idB=fetch.nextLine();
                System.out.println("Entrez le bic :");
                String bbic=fetch.nextLine();
                VirementBancaire paiemVirementBancaire = new VirementBancaire(nameB, idB, bbic);
                paiemVirementBancaire.effectuerPaiement(montant);                
            }
            break;
            default:
            System.out.println("choix indisponible !");
            break;
        }
        fetch.close();
    }
}
