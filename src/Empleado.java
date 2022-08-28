public class Empleado {
        private String nombre;
        private String empresa;
        private String telefono;
        private String rol;
        private String correo;
        private String transaccion;
        private String perfil;

    public Empleado(String nombre, String empresa, String telefono, String rol, String correo, String transaccion, String perfil) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.rol = rol;
        this.correo = correo;
        this.transaccion = transaccion;
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}