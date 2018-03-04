
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresoPacienteCS2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoPacienteCS2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pacientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoPacienteCS2", propOrder = {
    "pacientes"
})
public class IngresoPacienteCS2 {

    @XmlElement(name = "Pacientes")
    protected String pacientes;

    /**
     * Obtiene el valor de la propiedad pacientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacientes() {
        return pacientes;
    }

    /**
     * Define el valor de la propiedad pacientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacientes(String value) {
        this.pacientes = value;
    }

}
