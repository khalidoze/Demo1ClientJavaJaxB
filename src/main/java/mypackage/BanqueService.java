
package mypackage;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDH")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDH", targetNamespace = "http://ws/", className = "mypackage.ConversionEuroToDH")
    @ResponseWrapper(localName = "ConversionEuroToDHResponse", targetNamespace = "http://ws/", className = "mypackage.ConversionEuroToDHResponse")
    @Action(input = "http://ws/BanqueService/ConversionEuroToDHRequest", output = "http://ws/BanqueService/ConversionEuroToDHResponse")
    public double conversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns mypackage.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "mypackage.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "mypackage.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<mypackage.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "compteList", targetNamespace = "http://ws/", className = "mypackage.CompteList")
    @ResponseWrapper(localName = "compteListResponse", targetNamespace = "http://ws/", className = "mypackage.CompteListResponse")
    @Action(input = "http://ws/BanqueService/compteListRequest", output = "http://ws/BanqueService/compteListResponse")
    public List<Compte> compteList();

}
