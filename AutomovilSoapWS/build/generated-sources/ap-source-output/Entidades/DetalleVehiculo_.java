package Entidades;

import Entidades.Caracteristicas;
import Entidades.DetalleVehiculoPK;
import Entidades.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-25T19:11:16")
@StaticMetamodel(DetalleVehiculo.class)
public class DetalleVehiculo_ { 

    public static volatile SingularAttribute<DetalleVehiculo, DetalleVehiculoPK> detalleVehiculoPK;
    public static volatile SingularAttribute<DetalleVehiculo, Caracteristicas> caracteristicas;
    public static volatile SingularAttribute<DetalleVehiculo, Vehiculo> vehiculo;

}