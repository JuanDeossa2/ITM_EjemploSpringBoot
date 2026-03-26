import com.co.miempresa.modulo.EjemploLecturaTeclado;
import com.co.miempresa.modulo.EjemploOperaciones;
import ejemplosPOO.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  IO.println(String.format("Hello and welcome!"));

  for (int i = 1; i <= 5; i++) {
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    IO.println("i = " + i);
  }
  int [] enteros = new int[15];
  enteros [7] = 5;
  System.out.println("que tiene el arreglo ");
  for(int i : enteros){
      System.out.println("i = " + i);
  }
  Integer [] objetosInt = new Integer[5];
  objetosInt[3] = 4;
  System.out.println("que tiene el arreglo ");
  for(Integer i : objetosInt){
      System.out.println("i = " + i);
  }
  EjemploLecturaTeclado prueba = new EjemploLecturaTeclado();
  //prueba.primeraLectura();
  //prueba.segundaLectura();

  EjemploOperaciones ops = new EjemploOperaciones();
  System.out.println("la suma de 2 + 2 es " + ops.sumar(2,3));
  ops.probarTokenizer();

  Carro micarro = new Carro("Toyota" ,"corrola",2025, 4);
  System.out.println(micarro.arrancar());
  System.out.println(micarro.detener());

  System.out.println("marca" + micarro.getMarca());

  Vehiculo [] vehiculos = new Vehiculo[2];
  vehiculos[0] = new Carro("Honda" ,"Todo terreno",2026,4);
  vehiculos[1] = new Moto(2);
  for (Vehiculo v :vehiculos){
    v.conducir();
    System.out.println("Numero de ruedas "+v.obtenernumeroruedas());
  }

  Animal[] animales = new Animal[4];
  animales[0] = new Gato("pelusa");
  animales[1] = new Perro("cui");
  animales[2] = new Poni("Ruper");
  animales[3] = new PuraSangre("matin");
  for (Animal a :animales){
    a.hacerSonido();
  }

  CalculadoraDeSumas calculadoraDeSumas = new CalculadoraDeSumas();
  System.out.println("Suma dos enteros" + calculadoraDeSumas.sumar(2,4));
  System.out.println("Suma tres enteros" + calculadoraDeSumas.sumar(2,4,5));
  System.out.println("Suma dos float" + calculadoraDeSumas.sumar(2.7,4.8));
  System.out.println("Suma dos double" + calculadoraDeSumas.sumar(2.7d,4.8d));

  Caballo[] caballos = new Caballo[2];
  caballos[0] = new Poni("alberto");
  caballos[1] = new PuraSangre("hector");
  for (Caballo c : caballos){
    System.out.println("Numero de ruedas "+c.getNumeroPatas());
    c.hacerSonido();
    System.out.println("Especialidad "+c.traerEspecialidad());
  }
}
