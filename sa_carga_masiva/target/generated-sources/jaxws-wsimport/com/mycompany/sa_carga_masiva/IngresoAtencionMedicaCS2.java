
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresoAtencionMedicaCS2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoAtencionMedicaCS2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Atenciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoAtencionMedicaCS2", propOrder = {
    "atenciones"
})
public class IngresoAtencionMedicaCS2 {

    @XmlElement(name = "Atenciones")
    protected String atenciones;

    /**
     * Obtiene el valor de la propiedad atenciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtenciones() {
        return atenciones;
    }

    /**
     * Define el valor de la propiedad atenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtenciones(String value) {
        this.atenciones = value;
    }

}
