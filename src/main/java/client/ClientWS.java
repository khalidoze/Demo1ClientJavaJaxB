package client;

import mypackage.BanqueService;
import mypackage.BanqueWS;
import mypackage.Compte;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService proxy=new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(9000));
        System.out.println("--------------------------------------------------------");
        Compte compte=proxy.getCompte(9);
        System.out.println(compte.getSolde());
        System.out.println(compte.getCode());
        List<Compte> comptes=proxy.compteList();
       comptes.forEach(cp->{
           System.out.println("---------------------------");
           System.out.println(cp.getCode());
           System.out.println(cp.getSolde());
       });
    }
}
