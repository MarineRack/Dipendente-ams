package com.ams.gestione_dipendenti_be.runnerbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ams.gestione_dipendenti_be.model.Mesi;
import com.ams.gestione_dipendenti_be.repository.MesiRepository;



@Component
public class MesiRunnerBean implements ApplicationRunner{
	
	@Autowired
	MesiRepository mRepository;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		if(mRepository.count()==0) {
			mRepository.save(new  Mesi(1,"Gennaio") );
			mRepository.save(new  Mesi(2,"Febbraio") );
			mRepository.save(new  Mesi(3,"Marzo") );
			mRepository.save(new  Mesi(4,"Aprile") );
			mRepository.save(new  Mesi(5,"Maggio") );
			mRepository.save(new  Mesi(6,"Giugno") );
			mRepository.save(new  Mesi(7,"Luglio") );
			mRepository.save(new  Mesi(8,"Agosto") );
			mRepository.save(new  Mesi(9,"Settembre") );
			mRepository.save(new  Mesi(10,"Ottobre") );
			mRepository.save(new  Mesi(11,"Novembre") );
			mRepository.save(new  Mesi(12,"Dicembre") );
		}
		
		
	} 

}
