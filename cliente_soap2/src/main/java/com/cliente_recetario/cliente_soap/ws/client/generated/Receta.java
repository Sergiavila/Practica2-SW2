
package com.cliente_recetario.cliente_soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para receta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="receta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreReceta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ingredientes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ingrediente" type="{http://soap.Pr2_SWII/}ingrediente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="instrucciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dificultad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receta", propOrder = {
    "nombreReceta",
    "ingredientes",
    "instrucciones"
})
public class Receta {

    protected String nombreReceta;
    protected Receta.Ingredientes ingredientes;
    protected String instrucciones;
    @XmlAttribute(name = "dificultad")
    protected String dificultad;
    @XmlAttribute(name = "tipo")
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad nombreReceta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreReceta() {
        return nombreReceta;
    }

    /**
     * Define el valor de la propiedad nombreReceta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreReceta(String value) {
        this.nombreReceta = value;
    }

    /**
     * Obtiene el valor de la propiedad ingredientes.
     * 
     * @return
     *     possible object is
     *     {@link Receta.Ingredientes }
     *     
     */
    public Receta.Ingredientes getIngredientes() {
        return ingredientes;
    }

    /**
     * Define el valor de la propiedad ingredientes.
     * 
     * @param value
     *     allowed object is
     *     {@link Receta.Ingredientes }
     *     
     */
    public void setIngredientes(Receta.Ingredientes value) {
        this.ingredientes = value;
    }

    /**
     * Obtiene el valor de la propiedad instrucciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrucciones() {
        return instrucciones;
    }

    /**
     * Define el valor de la propiedad instrucciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrucciones(String value) {
        this.instrucciones = value;
    }

    /**
     * Obtiene el valor de la propiedad dificultad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Define el valor de la propiedad dificultad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDificultad(String value) {
        this.dificultad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ingrediente" type="{http://soap.Pr2_SWII/}ingrediente" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ingrediente"
    })
    public static class Ingredientes {

        protected List<Ingrediente> ingrediente;

        /**
         * Gets the value of the ingrediente property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ingrediente property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIngrediente().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ingrediente }
         * 
         * 
         */
        public List<Ingrediente> getIngrediente() {
            if (ingrediente == null) {
                ingrediente = new ArrayList<Ingrediente>();
            }
            return this.ingrediente;
        }

    }

}
