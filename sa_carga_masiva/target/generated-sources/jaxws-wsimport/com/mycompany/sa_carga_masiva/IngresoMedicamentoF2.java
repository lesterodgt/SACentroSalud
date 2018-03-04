
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresoMedicamentoF2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoMedicamentoF2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Medicamentos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoMedicamentoF2", propOrder = {
    "medicamentos"
})
public class IngresoMedicamentoF2 {

    @XmlElement(name = "Medicamentos")
    protected String medicamentos;

    /**
     * Obtiene el valor de la propiedad medicamentos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicamentos() {
        return medicamentos;
    }

    /**
     * Define el valor de la propiedad medicamentos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicamentos(String value) {
        this.medicamentos = value;
    }

}
