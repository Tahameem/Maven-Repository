package com.xworkz.airoplaneTester;

import java.util.List;

import com.xworkz.airoplaneDAO.AiroPlaneDAO;
import com.xworkz.airoplaneDTO.AiroPlaneDto1;

public class AirpPlaneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AiroPlaneDto1 airoPlaneDto=new AiroPlaneDto1();
		airoPlaneDto.setAiroplaneName("kingfisher");
		
		airoPlaneDto.setAiroplaneModel("1000");
		airoPlaneDto.setAiroplaneType("International");
		airoPlaneDto.setEngineType("Desel engine");
		airoPlaneDto.setSeatCapacity("2000");
		
		AiroPlaneDAO airoPlaneDao=new AiroPlaneDAO();
	//	airoPlaneDao.save(airoPlaneDto);
		
		
		/*
		 * List<AiroPlaneDto1> airoPlaneDtos = airoPlaneDao.getAll();
		 * 
		 * airoPlaneDtos.forEach(System.out::println);
		 */
		 
		airoPlaneDao.updateAiroPlaneBySeatCap("2000","kingfisher");
		
		
		/*
		 * List<Object[]> obj = airoPlaneDao.fetchByAiroPlaneName("kingfisher");
		 * //obj.forEach(System.out::println); for (Object[] result : obj) {
		 * 
		 * String res = (String)result[1]; System.out.println(res); }
		 */
		 
		}
		 
		 
		 
		
	}


