package com.example.proto.mapperTest;

import com.example.proto.model.Individual;

import org.junit.Assert;
import org.junit.Test;
import com.example.proto.DTO.IndiDTO;
import com.example.proto.mapperImp.IndividualMapperImp;

public class IndividualMapperTest {

	private final IndividualMapperImp individualMapper = new IndividualMapperImp();

	@Test
	public void IndividualMapper_domainToDto() {
		final IndiDTO source =new IndiDTO();

	source.setNational_id("W");
		source.setFirstName("W");
	source.setMName("W");
	source.setLastName("W");
		source.setGender("W");
	source.setStatus("W");
	source.setSkills("W");
		source.setDOB(null);
		source.setAttachments("W");

	final Individual target = individualMapper.dtoToDomain(source);

	Assert.assertNotNull(target);
		Assert.assertEquals("W", target.getNational_id());
	Assert.assertEquals("W", target.getFirstName());
	Assert.assertEquals("W", target.getMName());
	Assert.assertEquals("W", target.getLastName());
		Assert.assertEquals("W", target.getGender());
		Assert.assertEquals("W", target.getStatus());
		Assert.assertEquals("W", target.getSkills());
	Assert.assertEquals(null, target.getDOB());
		Assert.assertEquals("W", target.getAttachments());


}
//
//	@Test
//	public void IndividualMapper_dtoToDomain() {
//	final Individual source =new Individual();
//		source.setNational_id("W");
//		source.setFirstName("W");
//		source.setMName("W");
//	source.setLastName("W");
//		source.setGender("W");
//		source.setStatus("W");
//		source.setSkills("W");
//		source.setDOB(null);
//		source.setAttachments("W");
//
//		final IndiDTO target = individualMapper.domainToDto(source);
//
//		Assert.assertNotNull(target);
//		Assert.assertEquals("W", target.getNational_id());
//	Assert.assertEquals("W", target.getFirstName());
//		Assert.assertEquals("W", target.getMName());
//	Assert.assertEquals("W", target.getLastName());
//		Assert.assertEquals("W", target.getGender());
//		Assert.assertEquals("W", target.getStatus());
//		Assert.assertEquals("W", target.getSkills());
//		Assert.assertEquals(null, target.getDOB());
//		Assert.assertEquals("W", target.getAttachments());
//
//	}

}