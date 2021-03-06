package main.model.naves;

import fiuba.algo3.titiritero.modelo.ObjetoPosicionable;
import main.model.tablero.Coordenada;

public class Parte implements ObjetoPosicionable{

	private Coordenada posicion ;
	private boolean destruida;
	private boolean recibioDisparo; 

	public Parte(){
		this.destruida = false;
		this.recibioDisparo = false;
	}
	
	public Parte(Coordenada coordenada){
		this.destruida = false;
		this.recibioDisparo = false;
		this.posicion = coordenada;
	}

	public boolean estaDestruida(){
		return destruida;
	}

	public boolean recibioDisparo(){
		return recibioDisparo;
	}

	public void recibirDisparo(){
		this.recibioDisparo = true;
	}

	public void destruir(){
		this.destruida = true;
	}

	public Coordenada getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Coordenada laPosicion) {
		this.posicion = laPosicion;
	}

	@Override
	public int getX() {
		return 25 + posicion.getX() * 60;
	}

	@Override
	public int getY() {
		return 25 + posicion.getY() * 60;
	}
	
}
