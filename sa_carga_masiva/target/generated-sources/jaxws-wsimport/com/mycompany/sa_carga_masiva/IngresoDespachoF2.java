
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresoDespachoF2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoDespachoF2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Despachos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoDespachoF2", propOrder = {
    "despachos"
})
public class IngresoDespachoF2 {

    @XmlElement(name = "Despachos")
    protected String despachos;

    /**
     * Obtiene el valor de la propiedad despachos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespachos() {
        return despachos;
    }

    /**
     * Define el valor de la propiedad despachos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespachos(String value) {
        this.despachos = value;
    }

}
