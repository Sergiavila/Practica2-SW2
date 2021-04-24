
package com.cliente_recetario.cliente_soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingrediente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingrediente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreIngrediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingrediente", propOrder = {
    "nombreIngrediente",
    "cantidad"
})
public class Ingrediente {

    protected String nombreIngrediente;
    protected String cantidad;

    /**
     * Obtiene el valor de la propiedad nombreIngrediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    /**
     * Define el valor de la propiedad nombreIngrediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreIngrediente(String value) {
        this.nombreIngrediente = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }
    
    public String toString() {
		return "\n\tIngrediente: [nombreIngrediente=" + nombreIngrediente + ", cantidad=" + cantidad + "]";
	}

}
