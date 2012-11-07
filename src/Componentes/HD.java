package Componentes;

import java.util.ArrayList;
import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class HD extends PecasDecorator {

	public HD(Gabinete g) {
		tipoPeca = TipoPeca.HD;
		gab = g;
		//		descricao= g.descricao + " " + tipoPeca.toString() + marca + ".";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return gab.descricao + ", " + this.tipoPeca + marca + ".";
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		
		float cus;
		
	    switch (marca) {

	    case WD: cus = 180;	break;
		case SEAGATE: cus = 140; break;

		default: cus = 0;	break;
		}
	     
	    return cus;
		 
	}

	public static List<Marca> getListaMarcas() {
		List<Marca> lista = new ArrayList<Marca>() ;
		lista.add(Marca.WD);
		lista.add(Marca.SEAGATE);
		return lista;
	}
	
}
