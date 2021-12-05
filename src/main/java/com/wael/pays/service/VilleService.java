package com.wael.pays.service;

import java.util.List;

import com.wael.pays.entities.Ville;

public interface VilleService {
	Ville saveVille(Ville v);
	Ville updateVille(Ville v);
	void deleteVille(Ville v);
	void deleteVilleById(Long id);
	Ville getVille(Long id);
	List<Ville> getAllVilles();
}
