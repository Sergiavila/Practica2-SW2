
package com.cliente_recetario.cliente_soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;





/**
 * <p>Clase Java para recetario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="recetario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receta" type="{http://soap.Pr2_SWII/}receta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recetario")
public class Recetario {
	@XmlElement(name = "receta")
	private List<Receta> recetas;
    protected List<Receta> receta;

    /**
     * Gets the value of the receta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Receta }
     * 
     * 
     */
    public List<Receta> getReceta() {
        if (receta == null) {
            receta = new ArrayList<Receta>();
        }
        return this.receta;
    }
	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
    
    public void addReceta(Receta r) {
		if(!recetas.contains(r))
			recetas.add(r);
	}
    public String toString() {
  		return "Recetario:" + recetas.toString();
  	}
    

}

