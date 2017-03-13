
package web.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.service package. 
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

    private final static QName _ActualizarVehiculo_QNAME = new QName("http://Service.web/", "actualizarVehiculo");
    private final static QName _ActualizarVehiculoResponse_QNAME = new QName("http://Service.web/", "actualizarVehiculoResponse");
    private final static QName _Calificacion_QNAME = new QName("http://Service.web/", "calificacion");
    private final static QName _ConsultarClasificacion_QNAME = new QName("http://Service.web/", "consultarClasificacion");
    private final static QName _ConsultarClasificacionResponse_QNAME = new QName("http://Service.web/", "consultarClasificacionResponse");
    private final static QName _ConsultarListaClasificacion_QNAME = new QName("http://Service.web/", "consultarListaClasificacion");
    private final static QName _ConsultarListaClasificacionResponse_QNAME = new QName("http://Service.web/", "consultarListaClasificacionResponse");
    private final static QName _InsertarClasificacion_QNAME = new QName("http://Service.web/", "insertarClasificacion");
    private final static QName _InsertarClasificacionResponse_QNAME = new QName("http://Service.web/", "insertarClasificacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarVehiculo }
     * 
     */
    public ActualizarVehiculo createActualizarVehiculo() {
        return new ActualizarVehiculo();
    }

    /**
     * Create an instance of {@link ActualizarVehiculoResponse }
     * 
     */
    public ActualizarVehiculoResponse createActualizarVehiculoResponse() {
        return new ActualizarVehiculoResponse();
    }

    /**
     * Create an instance of {@link Calificacion }
     * 
     */
    public Calificacion createCalificacion() {
        return new Calificacion();
    }

    /**
     * Create an instance of {@link ConsultarClasificacion }
     * 
     */
    public ConsultarClasificacion createConsultarClasificacion() {
        return new ConsultarClasificacion();
    }

    /**
     * Create an instance of {@link ConsultarClasificacionResponse }
     * 
     */
    public ConsultarClasificacionResponse createConsultarClasificacionResponse() {
        return new ConsultarClasificacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarListaClasificacion }
     * 
     */
    public ConsultarListaClasificacion createConsultarListaClasificacion() {
        return new ConsultarListaClasificacion();
    }

    /**
     * Create an instance of {@link ConsultarListaClasificacionResponse }
     * 
     */
    public ConsultarListaClasificacionResponse createConsultarListaClasificacionResponse() {
        return new ConsultarListaClasificacionResponse();
    }

    /**
     * Create an instance of {@link InsertarClasificacion }
     * 
     */
    public InsertarClasificacion createInsertarClasificacion() {
        return new InsertarClasificacion();
    }

    /**
     * Create an instance of {@link InsertarClasificacionResponse }
     * 
     */
    public InsertarClasificacionResponse createInsertarClasificacionResponse() {
        return new InsertarClasificacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "actualizarVehiculo")
    public JAXBElement<ActualizarVehiculo> createActualizarVehiculo(ActualizarVehiculo value) {
        return new JAXBElement<ActualizarVehiculo>(_ActualizarVehiculo_QNAME, ActualizarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "actualizarVehiculoResponse")
    public JAXBElement<ActualizarVehiculoResponse> createActualizarVehiculoResponse(ActualizarVehiculoResponse value) {
        return new JAXBElement<ActualizarVehiculoResponse>(_ActualizarVehiculoResponse_QNAME, ActualizarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "calificacion")
    public JAXBElement<Calificacion> createCalificacion(Calificacion value) {
        return new JAXBElement<Calificacion>(_Calificacion_QNAME, Calificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClasificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "consultarClasificacion")
    public JAXBElement<ConsultarClasificacion> createConsultarClasificacion(ConsultarClasificacion value) {
        return new JAXBElement<ConsultarClasificacion>(_ConsultarClasificacion_QNAME, ConsultarClasificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClasificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "consultarClasificacionResponse")
    public JAXBElement<ConsultarClasificacionResponse> createConsultarClasificacionResponse(ConsultarClasificacionResponse value) {
        return new JAXBElement<ConsultarClasificacionResponse>(_ConsultarClasificacionResponse_QNAME, ConsultarClasificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaClasificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "consultarListaClasificacion")
    public JAXBElement<ConsultarListaClasificacion> createConsultarListaClasificacion(ConsultarListaClasificacion value) {
        return new JAXBElement<ConsultarListaClasificacion>(_ConsultarListaClasificacion_QNAME, ConsultarListaClasificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaClasificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "consultarListaClasificacionResponse")
    public JAXBElement<ConsultarListaClasificacionResponse> createConsultarListaClasificacionResponse(ConsultarListaClasificacionResponse value) {
        return new JAXBElement<ConsultarListaClasificacionResponse>(_ConsultarListaClasificacionResponse_QNAME, ConsultarListaClasificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarClasificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "insertarClasificacion")
    public JAXBElement<InsertarClasificacion> createInsertarClasificacion(InsertarClasificacion value) {
        return new JAXBElement<InsertarClasificacion>(_InsertarClasificacion_QNAME, InsertarClasificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarClasificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.web/", name = "insertarClasificacionResponse")
    public JAXBElement<InsertarClasificacionResponse> createInsertarClasificacionResponse(InsertarClasificacionResponse value) {
        return new JAXBElement<InsertarClasificacionResponse>(_InsertarClasificacionResponse_QNAME, InsertarClasificacionResponse.class, null, value);
    }

}
