package br.sesi.hgmbm.poo;

import br.sesi.hgmbm.poo.cabeca.Cabeca;
import br.sesi.hgmbm.poo.inferior.MembrosInferiores;
import br.sesi.hgmbm.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }

}
