package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl$Long;

public interface Get_Long_By_Dubl extends
	Get_Q_By_Dubl,
	Get_Long_By_Q,
	Dubl$Long
{
	@Lin_Dclar
	long Get_Long_By_Dubl(double By);
		@Override @Nevr_Neds_Ovrid
		default long Dubl$Long(double In)
		{return Get_Long_By_Dubl(In);}
}