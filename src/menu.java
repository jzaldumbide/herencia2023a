import java.lang.reflect.Array;
import java.util.ArrayList;

public class menu {
    public static void main(String[] args) {
        ArrayList <Estudiante> integrantes=new ArrayList<Estudiante>();

        Persona miPersona=new Persona(1715467991,
        "Juan",
        "Pérez",
        "Conocoto",
        "0996192599");
    //    Persona Pedro=new Persona();

      //  System.out.println(miPersona.getCi());
      //  System.out.println(Pedro.getCi());

        Estudiante Mayerli=new Estudiante(
                1715467869,
                "Mayerli",
                "Catani",
                "La Floresta",
                "123455",
                //a partir de aqui son elementos propios de estudiante
                12345,
                "elcorre@epn.edu.ec",
                "3ero",
                "TSDS"
        );
        Estudiante Juan=new Estudiante(
                1234567890,
                "Juan",
                "Perez",
                "Conocoto",
                "55555555",
                //a partir de aqui son elementos propios de estudiante
                54321,
                "elcorre1@epn.edu.ec",
                "3ero",
                "TSDS"
        );
        Estudiante Pedro=new Estudiante(
                987654321,
                "Pedro",
                "Molina",
                "El Pintado",
                "123455",
                //a partir de aqui son elementos propios de estudiante
                56789,
                "elcorre3@epn.edu.ec",
                "3ero",
                "TSDS"
        );

        integrantes.add(Pedro);
        integrantes.add(Juan);
        integrantes.add(Mayerli);

        System.out.println("Todos los integrantes comienzan ");
        for (Estudiante integrante : integrantes) {
            System.out.print(integrante.getNombre()+" "+integrante.getApellido()+" -> ");
            integrante.leer();
        }
    }

}
