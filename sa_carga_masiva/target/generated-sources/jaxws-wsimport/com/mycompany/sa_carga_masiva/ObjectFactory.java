
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.sa_carga_masiva package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IngresoMedicamentoF2_QNAME = new QName("http://ws_farmacia_2.sa/", "IngresoMedicamentoF2");
    private final static QName _IngresoMedicamentoF2Response_QNAME = new QName("http://ws_farmacia_2.sa/", "IngresoMedicamentoF2Response");
    private final static QName _ConsultarMedicamentoF2Response_QNAME = new QName("http://ws_farmacia_2.sa/", "ConsultarMedicamentoF2Response");
    private final static QName _IngresoDespachoF2_QNAME = new QName("http://ws_farmacia_2.sa/", "IngresoDespachoF2");
    private final static QName _ConsultarMedicamentoF2_QNAME = new QName("http://ws_farmacia_2.sa/", "ConsultarMedicamentoF2");
    private final static QName _IngresoDespachoF2Response_QNAME = new QName("http://ws_farmacia_2.sa/", "IngresoDespachoF2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.sa_carga_masiva
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IngresoDespachoF2Response }
     * 
     */
    public IngresoDespachoF2Response createIngresoDespachoF2Response() {
        return new IngresoDespachoF2Response();
    }

    /**
     * Create an instance of {@link ConsultarMedicamentoF2Response }
     * 
     */
    public ConsultarMedicamentoF2Response createConsultarMedicamentoF2Response() {
        return new ConsultarMedicamentoF2Response();
    }

    /**
     * Create an instance of {@link IngresoDespachoF2 }
     * 
     */
    public IngresoDespachoF2 createIngresoDespachoF2() {
        return new IngresoDespachoF2();
    }

    /**
     * Create an instance of {@link ConsultarMedicamentoF2 }
     * 
     */
    public ConsultarMedicamentoF2 createConsultarMedicamentoF2() {
        return new ConsultarMedicamentoF2();
    }

    /**
     * Create an instance of {@link IngresoMedicamentoF2 }
     * 
     */
    public IngresoMedicamentoF2 createIngresoMedicamentoF2() {
        return new IngresoMedicamentoF2();
    }

    /**
     * Create an instance of {@link IngresoMedicamentoF2Response }
     * 
     */
    public IngresoMedicamentoF2Response createIngresoMedicamentoF2Response() {
        return new IngresoMedicamentoF2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoMedicamentoF2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_farmacia_2.sa/", name = "IngresoMedicamentoF2")
    public JAXBElement<IngresoMedicamentoF2> createIngresoMedicamentoF2(IngresoMedicamentoF2 value) {
        return new JAXBElement<IngresoMedicamentoF2>(_IngresoMedicamentoF2_QNAME, IngresoMedicamentoF2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoMedicamentoF2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_farmacia_2.sa/", name = "IngresoMedicamentoF2Response")
    public JAXBElement<IngresoMedicamentoF2Response> createIngresoMedicamentoF2Response(IngresoMedicamentoF2Response value) {
        return new JAXBElement<IngresoMedicamentoF2Response>(_IngresoMedicamentoF2Response_QNAME, IngresoMedicamentoF2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarMedicamentoF2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_farmacia_2.sa/", name = "ConsultarMedicamentoF2Response")
    public JAXBElement<ConsultarMedicamentoF2Response> createConsultarMedicamentoF2Response(ConsultarMedicamentoF2Response value) {
        return new JAXBElement<ConsultarMedicamentoF2Response>(_ConsultarMedicamentoF2Response_QNAME, ConsultarMedicamentoF2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoDespachoF2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_farmacia_2.sa/", name = "IngresoDespachoF2")
    public JAXBElement<IngresoDespachoF2> createIngresoDespachoF2(IngresoDespachoF2 value) {
        return new JAXBElement<IngresoDespachoF2>(_IngresoDespachoF2_QNAME, IngresoDespachoF2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarMedicamentoF2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_farmacia_2.sa/", name = "ConsultarMedicamentoF2")
    public JAXBElement<ConsultarMedicamentoF2> createConsultarMedicamentoF2(ConsultarMedicamentoF2 value) {
        return new JAXBElement<ConsultarMedicamentoF2>(_ConsultarMedicamentoF2_QNAME, ConsultarMedicamentoF2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoDespachoF2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_farmacia_2.sa/", name = "IngresoDespachoF2Response")
    public JAXBElement<IngresoDespachoF2Response> createIngresoDespachoF2Response(IngresoDespachoF2Response value) {
        return new JAXBElement<IngresoDespachoF2Response>(_IngresoDespachoF2Response_QNAME, IngresoDespachoF2Response.class, null, value);
    }

}
