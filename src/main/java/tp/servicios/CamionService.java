package tp.servicios;

import java.util.List;

import tp.dao.CamionDao;
import tp.dao.CamionDaoMysql;
import tp.entidades.Camion;

public class CamionService {
	
	private CamionDao camionDao = new CamionDaoMysql();

	public Camion crearCamion(Camion c) {
		// si hay alguna regla de negocio que indque que no se 
		// puede agregar un camion si no se cumplen determinadas
		// condiciones en otras entidades o reglas 
		// se valida aquí
			return this.camionDao.saveOrUpdate(c);
	}
	
	public List<Camion> buscarTodos() {
		return camionDao.buscarTodos();
	}

}
