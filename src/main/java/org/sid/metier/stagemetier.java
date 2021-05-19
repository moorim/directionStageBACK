package org.sid.metier;

import org.sid.entities.stage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("stageService")
public interface stagemetier {
    public stage savestage(stage s);
    public List<stage> getstages();
    public void deletestage(Long id);
    public void modifystage(Long id,stage s);
    public stage getStageById(Long id);
    public Long  countStage();

}
