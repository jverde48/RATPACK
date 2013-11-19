@GrabResolver("http://oss.jfrog.org/artifactory/libs-snapshot")
@Grab("io.ratpack:ratpack-groovy:0.9.0-SNAPSHOT")
import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get ('validarTarjeta/:noTarjetaSbx'){
            "No tarjeta: ${urlparams.noTarjetaSbx}!"
        }

        post ("registroUsuario")  {

        }

        post ("login") {

        }

        get ("consultarTajeta") {

        }

        get ("consultarEstatusRewards") {

        }

        get ("consultarTransaccionPorTajeta") {

        }

        post ("agregarTarjetaRewards") {

        }

        get ("consultarDatosUsuario") {

        }
    }
}


