package com.wael.pays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wael.pays.entities.Ville;
import com.wael.pays.repos.VilleRepository;
@Service
public class VilleServiceImpl implements VilleService {
	
	@Autowired
	VilleRepository VilleRepository;
	@Override
	public Ville saveVille(Ville p) {
	return VilleRepository.save(p);
	}
	@Override
	public Ville updateVille(Ville p) {
	return VilleRepository.save(p);
	}
	@Override
	public void deleteVille(Ville p) {
	VilleRepository.delete(p);
	}
	@Override
	public void deleteVilleById(Long id) {
	VilleRepository.deleteById(id);
	}
	@Override
	public Ville getVille(Long id) {
	return VilleRepository.findById(id).get();
	}
	@Override
	public List<Ville> getAllVilles() {
	return VilleRepository.findAll();
	}

}
