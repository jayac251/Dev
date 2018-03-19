package com.jc.jdbc.student.xml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import com.jc.jdbc.student.model.StudentCollection;
import com.jc.jdbc.student.model.StudentType;
import com.jc.jdbc.student.model.StudentType.AttributeCollection;
import com.jc.jdbc.student.model.StudentType.AttributeCollection.Attribute;
import com.jc.jdbc.student.model.student.Student;


public class XmlConverter {
	
	JAXBContext contextObj; 
	
		
	public void convertFromObjectToXML(List<Student> studentlist) throws IOException, JAXBException {
		try {
			contextObj= JAXBContext.newInstance(StudentCollection.class);
			Marshaller marshaller=contextObj.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StudentCollection studentcollection = new StudentCollection();
			studentcollection=MaptoXMLType(studentlist);		
			marshaller.marshal(studentcollection, new FileOutputStream("student.xml"));
			}catch(Exception e){
			throw e;
		}
	}
		
		public StudentCollection MaptoXMLType(List<Student> studentlist)  {
			
				StudentCollection studentcollection = new StudentCollection();
				
				for(Student student:studentlist)
				{
					AttributeCollection attcol=new AttributeCollection();
					List<Attribute> attlist = new ArrayList<Attribute>();
					StudentType studenttype=new StudentType();
					studenttype.setId(student.getStudentId());
					studenttype.setName(student.getStudentName());
					if(student.getIssport()!=null)
					{
						Attribute a =new Attribute();
						a.setKey("IS_SPORT");
						a.setValue(student.getIssport());						
						attlist.add(a);
					}
					if(student.getIsacademic()!=null)
					{
						Attribute a =new Attribute();
						a.setKey("IS_ACADEMIC");
						a.setValue(student.getIsacademic());						
						attlist.add(a);						
					}
					if(attlist!=null)
					{
					attcol.getAttribute().addAll(attlist);
					studenttype.setAttributeCollection(attcol);
					}
					studentcollection.getStudentDetail().add(studenttype);
					System.out.println("Get All JAX:"+studentcollection.getStudentDetail().toString());
				}
							
						return studentcollection;
		
	}
 
	
	}


