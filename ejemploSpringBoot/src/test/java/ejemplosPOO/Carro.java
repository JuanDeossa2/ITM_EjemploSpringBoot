package ejemplosPOO;

public class Carro implements Vehiculo {
    private String marca;
    private  String modelo;
    private  int year;
    private  int numeroRuedas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public Carro(String marca, String modelo, int year,int numeroRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.numeroRuedas = numeroRuedas;
    }
    public String arrancar(){
        return  "El carro de marca "+marca+ " y modelo "+modelo+"esta arrancando";
    }
    public String detener(){
        return  "El carro de marca "+marca+ " y modelo "+modelo+"esta deteniendoce";
    }

    @Override
    public void conducir() {
        System.out.println("Conducion un carrro con mucho cuidado");
    }

    @Override
    public int obtenernumeroruedas() {
        return getNumeroRuedas();
    }

}
