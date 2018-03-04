
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresoMedicoCS2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoMedicoCS2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Medicos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoMedicoCS2", propOrder = {
    "medicos"
})
public class IngresoMedicoCS2 {

    @XmlElement(name = "Medicos")
    protected String medicos;

    /**
     * Obtiene el valor de la propiedad medicos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicos() {
        return medicos;
    }

    /**
     * Define el valor de la propiedad medicos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicos(String value) {
        this.medicos = value;
    }

}
