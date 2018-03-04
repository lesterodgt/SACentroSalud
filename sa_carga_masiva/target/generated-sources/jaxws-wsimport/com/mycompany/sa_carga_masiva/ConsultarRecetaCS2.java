
package com.mycompany.sa_carga_masiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarRecetaCS2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarRecetaCS2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Receta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarRecetaCS2", propOrder = {
    "receta"
})
public class ConsultarRecetaCS2 {

    @XmlElement(name = "Receta")
    protected int receta;

    /**
     * Obtiene el valor de la propiedad receta.
     * 
     */
    public int getReceta() {
        return receta;
    }

    /**
     * Define el valor de la propiedad receta.
     * 
     */
    public void setReceta(int value) {
        this.receta = value;
    }

}
