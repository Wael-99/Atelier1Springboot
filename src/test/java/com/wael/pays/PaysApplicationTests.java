package com.wael.pays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wael.pays.entities.Ville;
import com.wael.pays.repos.VilleRepository;

import java.util.List;

@SpringBootTest
class PaysApplicationTests {

	@Autowired
	private VilleRepository villeRepository;
	@Test
	public void testCreateVille() {
	Ville ville = new Ville("France",23.3,100);
	villeRepository.save(ville);
	}
	
	@Test
	public void testFindVille()
	{
	Ville v = villeRepository.findById(1L).get();

	System.out.println(v);
	}
	
	
	@Test
	public void testUpdateVille()
	{
	Ville v = villeRepository.findById(1L).get();
	v.setSurfaceVille(30.0);
	villeRepository.save(v);
	}
	
	@Test
	public void testDeleteVille()
	{
	villeRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousVilles()
	{
	List<Ville> ville = villeRepository.findAll();
	for (Ville v : ville)
	{
	System.out.println(v);
	}

}}
