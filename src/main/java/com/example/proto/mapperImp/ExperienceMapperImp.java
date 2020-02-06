package com.example.proto.mapperImp;

import com.example.proto.DTO.ExperienceDTO;
import com.example.proto.mapper.ExperienceMapper;
import com.example.proto.model.Experience;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class ExperienceMapperImp implements ExperienceMapper {
	private MapperFacade mapperFacade;
	 public ExperienceMapperImp() {
	 
    MapperFactory mapperFactory = new DefaultMapperFactory
      .Builder().build();
	 
	        mapperFactory.classMap(ExperienceDTO.class, Experience.class)
	          .byDefault().register();
    mapperFacade = mapperFactory.getMapperFacade();
}
	@Override
	public Experience dtoToDomain(ExperienceDTO experience) {
		// TODO Auto-generated method stub
		return mapperFacade.map(experience, Experience.class);
	}

	@Override
	public ExperienceDTO domainToDto(Experience experience) {
		// TODO Auto-generated method stub
		return mapperFacade.map(experience, ExperienceDTO.class);
	}

}
