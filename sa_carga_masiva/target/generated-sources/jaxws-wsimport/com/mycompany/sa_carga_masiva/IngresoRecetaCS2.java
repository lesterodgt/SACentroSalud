
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresoRecetaCS2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoRecetaCS2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recetas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoRecetaCS2", propOrder = {
    "recetas"
})
public class IngresoRecetaCS2 {

    @XmlElement(name = "Recetas")
    protected String recetas;

    /**
     * Obtiene el valor de la propiedad recetas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecetas() {
        return recetas;
    }

    /**
     * Define el valor de la propiedad recetas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecetas(String value) {
        this.recetas = value;
    }

}
