package dao;

import java.util.List;

import fr.adaming.model.Lieu;

public interface ILieuDao {
	
	public int createLieu(Lieu lieu);
	public List<Lieu> getLieu();

}
