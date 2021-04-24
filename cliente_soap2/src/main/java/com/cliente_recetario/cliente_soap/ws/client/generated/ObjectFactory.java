
package com.cliente_recetario.cliente_soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cliente_recetario.cliente_soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JAXBException_QNAME = new QName("http://soap.Pr2_SWII/", "JAXBException");
    private final static QName _Ingrediente_QNAME = new QName("http://soap.Pr2_SWII/", "ingrediente");
    private final static QName _Iniciar_QNAME = new QName("http://soap.Pr2_SWII/", "iniciar");
    private final static QName _IniciarResponse_QNAME = new QName("http://soap.Pr2_SWII/", "iniciarResponse");
    private final static QName _Receta_QNAME = new QName("http://soap.Pr2_SWII/", "receta");
    private final static QName _Recetario_QNAME = new QName("http://soap.Pr2_SWII/", "recetario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cliente_recetario.cliente_soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Receta }
     * 
     */
    public Receta createReceta() {
        return new Receta();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link Ingrediente }
     * 
     */
    public Ingrediente createIngrediente() {
        return new Ingrediente();
    }

    /**
     * Create an instance of {@link Iniciar }
     * 
     */
    public Iniciar createIniciar() {
        return new Iniciar();
    }

    /**
     * Create an instance of {@link IniciarResponse }
     * 
     */
    public IniciarResponse createIniciarResponse() {
        return new IniciarResponse();
    }

    /**
     * Create an instance of {@link Recetario }
     * 
     */
    public Recetario createRecetario() {
        return new Recetario();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link Receta.Ingredientes }
     * 
     */
    public Receta.Ingredientes createRecetaIngredientes() {
        return new Receta.Ingredientes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Pr2_SWII/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingrediente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ingrediente }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Pr2_SWII/", name = "ingrediente")
    public JAXBElement<Ingrediente> createIngrediente(Ingrediente value) {
        return new JAXBElement<Ingrediente>(_Ingrediente_QNAME, Ingrediente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Iniciar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Iniciar }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Pr2_SWII/", name = "iniciar")
    public JAXBElement<Iniciar> createIniciar(Iniciar value) {
        return new JAXBElement<Iniciar>(_Iniciar_QNAME, Iniciar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IniciarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Pr2_SWII/", name = "iniciarResponse")
    public JAXBElement<IniciarResponse> createIniciarResponse(IniciarResponse value) {
        return new JAXBElement<IniciarResponse>(_IniciarResponse_QNAME, IniciarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Receta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Receta }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Pr2_SWII/", name = "receta")
    public JAXBElement<Receta> createReceta(Receta value) {
        return new JAXBElement<Receta>(_Receta_QNAME, Receta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recetario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Recetario }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Pr2_SWII/", name = "recetario")
    public JAXBElement<Recetario> createRecetario(Recetario value) {
        return new JAXBElement<Recetario>(_Recetario_QNAME, Recetario.class, null, value);
    }

}
