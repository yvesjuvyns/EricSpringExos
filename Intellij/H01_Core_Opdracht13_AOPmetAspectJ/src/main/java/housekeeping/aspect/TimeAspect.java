package housekeeping.aspect;

import housekeeping.services.MusicMaker;
import housekeeping.services.implementation.MusicMakerImplementation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class TimeAspect {


    @DeclareParents (value = "housekeeping.services.implementation.DomesticServiceImpl",
            defaultImpl = MusicMakerImplementation.class)
    public static MusicMaker mixin;





}
