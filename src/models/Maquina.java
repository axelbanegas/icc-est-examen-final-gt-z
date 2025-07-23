package models;
import java.util.List;

public class Maquina{
    String nombre;
    String ip;
    List<Integer> codigos;
    int subred;
    int riesgo;
    public Maquina(String nombre, String ip, List<Integer> codigos, int subred, int riesgo) {
        int calcularSubred;
        int calcularRiesgo;
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = subred;
        this.riesgo = riesgo;
    }
    
};