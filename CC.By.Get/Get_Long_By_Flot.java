package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot$Long;

public interface Get_Long_By_Flot extends
	Get_Q_By_Flot,
	Get_Long_By_Q,
	Flot$Long
{
	@Lin_Dclar
	long Get_Long_By_Flot(float By);
		@Override @Nevr_Neds_Ovrid
		default long Flot$Long(float In)
		{return Get_Long_By_Flot(In);}
}