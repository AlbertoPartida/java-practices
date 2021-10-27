package es.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;
import es.curso.modelo.entidad.Videojuego;


public class DaoVideojuego {

	public DaoVideojuego() {
		
	}
	
	public List<Videojuego> listar(){
		List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
		
		Videojuego v = new Videojuego();
		v.setId(1);
		v.setNombre("Grand Theft Auto V");
		v.setCompania("Rockstar Games");		
		v.setNombreCreador("Rockstar North");
		v.setNotaMedia("10");
		v.setWebOficial("https://www.rockstargames.com/V/restricted-content/agegate/form?redirect=https%3A%2F%2Fwww.rockstargames.com%2FV%2Fes&options=&locale=es_es");
		
		listaVideojuegos.add(v);
		
		v = new Videojuego();
		v.setId(2);
		v.setNombre("FARCRY6");
		v.setCompania("Ubisoft Toronto");		
		v.setNombreCreador("Ubisoft");
		v.setNotaMedia("9");
		v.setWebOficial("https://www.ubisoft.com/es-es/game/far-cry/far-cry-6");
		
		listaVideojuegos.add(v);
		
		v = new Videojuego();
		v.setId(3);
		v.setNombre("Call of Duty: Vanguard");
		v.setCompania("Activision");		
		v.setNombreCreador("Sledgehammer Games");
		v.setNotaMedia("9.5");
		v.setWebOficial("https://www.callofduty.com/content/atvi/callofduty/vanguard/web/es/home.html");
		
		listaVideojuegos.add(v);
		
		v = new Videojuego();
		v.setId(4);
		v.setNombre("Age of Empires IV");
		v.setCompania("Relic Entertainment");		
		v.setNombreCreador("James Agay");
		v.setNotaMedia("8.5");
		v.setWebOficial("https://www.ageofempires.com/games/age-of-empires-iv/");
		
		listaVideojuegos.add(v);

		return listaVideojuegos;
	}
	
	public Videojuego buscar(int id){
		
		if(id == 1) {
			Videojuego v = new Videojuego();
			v.setId(1);
			v.setNombre("Grand Theft Auto V");
			v.setCompania("Rockstar Games");		
			v.setNombreCreador("Rockstar North");
			v.setNotaMedia("10");
			v.setWebOficial("https://www.rockstargames.com/V/restricted-content/agegate/form?redirect=https%3A%2F%2Fwww.rockstargames.com%2FV%2Fes&options=&locale=es_es");
		
			return v;
		}else if(id == 2) {
			Videojuego v = new Videojuego();
			v.setId(2);
			v.setNombre("FARCRY6");
			v.setCompania("Ubisoft Toronto");		
			v.setNombreCreador("Ubisoft");
			v.setNotaMedia("9");
			v.setWebOficial("https://www.ubisoft.com/es-es/game/far-cry/far-cry-6");
			
			return v;
		}else if(id == 3) {
			Videojuego v = new Videojuego();
			v.setId(3);
			v.setNombre("Call of Duty: Vanguard");
			v.setCompania("Activision");		
			v.setNombreCreador("Sledgehammer Games");
			v.setNotaMedia("9.5");
			v.setWebOficial("https://www.callofduty.com/content/atvi/callofduty/vanguard/web/es/home.html");
				
			return v;
		}else if(id == 4) {
			Videojuego v = new Videojuego();
			v.setId(4);
			v.setNombre("Age of Empires IV");
			v.setCompania("Relic Entertainment");		
			v.setNombreCreador("James Agay");
			v.setNotaMedia("8.5");
			v.setWebOficial("https://www.ageofempires.com/games/age-of-empires-iv/");
				
			return v;
		} else {
			return null;
		}
	}
}
