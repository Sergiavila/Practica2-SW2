
package com.cliente_recetario.cliente_soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generarReceta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generarReceta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recetario" type="{http://soap.Pr2_SWII/}recetario" minOccurs="0"/&gt;
 *         &lt;element name="receta" type="{http://soap.Pr2_SWII/}receta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarReceta", propOrder = {
    "recetario",
    "receta"
})
public class GenerarReceta {

    protected Recetario recetario;
    protected Receta receta;

    /**
     * Obtiene el valor de la propiedad recetario.
     * 
     * @return
     *     possible object is
     *     {@link Recetario }
     *     
     */
    public Recetario getRecetario() {
        return recetario;
    }

    /**
     * Define el valor de la propiedad recetario.
     * 
     * @param value
     *     allowed object is
     *     {@link Recetario }
     *     
     */
    public void setRecetario(Recetario value) {
        this.recetario = value;
    }

    /**
     * Obtiene el valor de la propiedad receta.
     * 
     * @return
     *     possible object is
     *     {@link Receta }
     *     
     */
    public Receta getReceta() {
        return receta;
    }

    /**
     * Define el valor de la propiedad receta.
     * 
     * @param value
     *     allowed object is
     *     {@link Receta }
     *     
     */
    public void setReceta(Receta value) {
        this.receta = value;
    }

}
