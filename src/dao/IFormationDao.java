package dao;

import java.util.List;

import fr.adaming.model.Formation;

public interface IFormationDao {
	
public int creatFormation(Formation fr);
public List<Formation> getFormations();
public List<Formation> getFormations(String ville);

}
