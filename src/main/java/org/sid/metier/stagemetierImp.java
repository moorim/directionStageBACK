package org.sid.metier;

import org.sid.Dao.stageRepository;
import org.sid.entities.stage;
import org.sid.exception.StageNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("stageService")
public class stagemetierImp implements stagemetier{
    @Autowired
    private stageRepository stageRepository;
    @Override
    public stage savestage(stage s) {
        return stageRepository.save(s);
    }

    @Override
    public List<stage> getstages() {
        return stageRepository.findAll();
    }

    @Override
    public void deletestage(Long id) {
        stageRepository.deleteById(id);
    }

    @Override
    public void modifystage(Long id, stage s) {
      s.setId_stage(id);
      stageRepository.save(s);
    }

    @Override
    public stage getStageById(Long id) {
        return stageRepository.findById(id).orElseThrow(()->new StageNotFoundException("Stageby id"+id+"not found"));
    }

    @Override
    public Long countStage() {
        return stageRepository.count();
    }
}
