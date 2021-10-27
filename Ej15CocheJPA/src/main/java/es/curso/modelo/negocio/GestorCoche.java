package es.curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.curso.modelo.entidad.Coche;
import es.curso.modelo.persistencia.DaoCoche;


@Service
public class GestorCoche {
	
	@Autowired
	private DaoCoche cocheDao;
	
	@Transactional
	public int alta(Coche c){
		return cocheDao.alta(c);
	}
	
	@Transactional
	public int baja(int id){
		return cocheDao.baja(id);
	}
	
	@Transactional
	public Coche modificar(Coche c){
		return cocheDao.modificar(c);	
	}
	
	//Listar y obtener NO modifican la bbdd, por lo tanto no tiene
	//porque se transaccional
	public Coche obtener(int id){
		return cocheDao.obtener(id);
	}
	
	public List<Coche> listar(){
		List<Coche> listaPersonas = cocheDao.listar();
		return listaPersonas;
	}
	
}