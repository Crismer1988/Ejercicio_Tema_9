public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 35;
        cliente.nombre = "Cristian Mercado";
        cliente.telefono = "305-755-9879";
        cliente.credito = 5952.26;

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 31;
        trabajador.nombre = "Thomas Voyer";
        trabajador.telefono = "311-856-5452";
        trabajador.salario = 151.25;

        System.out.println("DATOS DEL CLIENTE");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad + " años");
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + "$" + cliente.credito);
        System.out.println();

        System.out.println("DATOS DEL TRABAJADOR");
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad + " años");
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + "$" + trabajador.salario);
        System.out.println();
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

final class Cliente extends Persona {
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

final class Trabajador extends Persona {
    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}