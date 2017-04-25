package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.GroupsDao;
import entity.Contacter;
import entity.Groups;

@Service
@Transactional
public class GroupsServiceImpl implements GroupsService{

	@Autowired
	@Qualifier("groupsDaoImpl")
	GroupsDao groupsDao;
	
	public Groups get(int id){
		return groupsDao.get(Groups.class, id);
	}
	
	public List<Groups> getAll() {
		return groupsDao.getAll(Groups.class);
	}
	
	public void save(Groups entity) {
		groupsDao.save(entity);
	}
	
	public void update(Groups entity) {
		groupsDao.update(entity);
	}
	
	public void delete(Groups entity) {
		groupsDao.delete(entity);
	}
	
	public 	List<Contacter> getContacters(Groups entity){
		
		return null;
	}
	
	public void deleteContacter(Contacter entity){
		
	}
	
	public void deleteContacters(List<Contacter> entityList){
		
	}
	
	public void addContacter(Contacter entity){
		
	}
	
	public void addContacters(List<Contacter> entityList){
		
	}
}
