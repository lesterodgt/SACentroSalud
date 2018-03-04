
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresoCitaCS2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoCitaCS2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Citas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoCitaCS2", propOrder = {
    "citas"
})
public class IngresoCitaCS2 {

    @XmlElement(name = "Citas")
    protected String citas;

    /**
     * Obtiene el valor de la propiedad citas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitas() {
        return citas;
    }

    /**
     * Define el valor de la propiedad citas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitas(String value) {
        this.citas = value;
    }

}
